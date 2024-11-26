package com.semicolon.africa.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class TrackingLog {

    @Id
    private String trackingID;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;

}
