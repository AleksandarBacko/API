package OfficeHours.Practice._SAIMSPRACTICE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Postclass {
    String body;
    String dateTime;

    public Postclass(String body) {
        this.body = body;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    final String getDateTime() {
        return dateTime;
    }
}
