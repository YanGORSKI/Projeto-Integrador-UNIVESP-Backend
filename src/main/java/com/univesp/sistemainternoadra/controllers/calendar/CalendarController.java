package com.univesp.sistemainternoadra.controllers.calendar;

import com.univesp.sistemainternoadra.model.DTO.calendar.EventResponse;
import com.univesp.sistemainternoadra.services.GoogleCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

    @Autowired
    private GoogleCalendarService calendarService;

    @GetMapping("/eventos")
    public List<EventResponse> listarEventos(
            @RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime inicio,
            @RequestParam("fim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fim
    ) throws IOException {
        return calendarService.listarEventos(inicio, fim);
    }
}
