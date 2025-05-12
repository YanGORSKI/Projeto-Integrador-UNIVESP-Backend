package com.univesp.sistemainternoadra.model.DTO.calendar;

import java.util.List;

public class EventResponse {
    private String date;
    private String title;
    private String color;
    private String startTime;
    private String endTime;
    private String details;
    private List<String> participants;
    private String notificationTime;

    public EventResponse() {
    }

    public EventResponse(String date, String title, String color, String startTime, String endTime,
                         String details, List<String> participants, String notificationTime) {
        this.date = date;
        this.title = title;
        this.color = color;
        this.startTime = startTime;
        this.endTime = endTime;
        this.details = details;
        this.participants = participants;
        this.notificationTime = notificationTime;
    }

    // Getters e Setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }
}