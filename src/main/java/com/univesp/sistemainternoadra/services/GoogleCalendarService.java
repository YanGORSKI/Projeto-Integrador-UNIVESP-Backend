package com.univesp.sistemainternoadra.services;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.Events;
import com.univesp.sistemainternoadra.model.DTO.calendar.EventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoogleCalendarService {

    @Autowired
    private Calendar googleCalendar;

    public List<EventResponse> listarEventos(LocalDateTime inicio, LocalDateTime fim) throws IOException {
        DateTime start = new DateTime(inicio.toString() + "Z");
        DateTime end = new DateTime(fim.toString() + "Z");

        Events events = googleCalendar.events().list("primary")
                .setTimeMin(start)
                .setTimeMax(end)
                .setOrderBy("startTime")
                .setSingleEvents(true)
                .execute();

        List<EventResponse> response = new ArrayList<>();

        for (Event event : events.getItems()) {
            String title = event.getSummary();
            String color = event.getColorId() != null ? "#" + event.getColorId() : "#2196F3"; // fallback para azul se não houver cor
            String details = event.getDescription() != null ? event.getDescription() : "";
            List<String> participants = new ArrayList<>();
            if (event.getAttendees() != null) {
                for (EventAttendee attendee : event.getAttendees()) {
                    if (attendee.getDisplayName() != null) {
                        participants.add(attendee.getDisplayName());
                    } else if (attendee.getEmail() != null) {
                        participants.add(attendee.getEmail());
                    }
                }
            }

            // Obter datas
            DateTime startDateTime = event.getStart().getDateTime() != null ?
                    event.getStart().getDateTime() : event.getStart().getDate();
            DateTime endDateTime = event.getEnd().getDateTime() != null ?
                    event.getEnd().getDateTime() : event.getEnd().getDate();

            // Converter para LocalDateTime
            ZonedDateTime startZoned = Instant.ofEpochMilli(startDateTime.getValue()).atZone(ZoneId.systemDefault());
            ZonedDateTime endZoned = Instant.ofEpochMilli(endDateTime.getValue()).atZone(ZoneId.systemDefault());

            String date = startZoned.toLocalDate().toString();
            String startTime = startZoned.toLocalTime().toString().substring(0, 5); // HH:mm
            String endTime = endZoned.toLocalTime().toString().substring(0, 5);

            // Supondo que a notificação seja armazenada em extendedProperties ou outro campo customizado
            String notificationTime = null;
            if (event.getExtendedProperties() != null &&
                    event.getExtendedProperties().getPrivate() != null &&
                    event.getExtendedProperties().getPrivate().get("notificationTime") != null) {
                notificationTime = event.getExtendedProperties().getPrivate().get("notificationTime");
            }

            response.add(new EventResponse(
                    date,
                    title,
                    color,
                    startTime,
                    endTime,
                    details,
                    participants,
                    notificationTime
            ));
        }


        return response;
    }
}