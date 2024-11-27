package com.semicolon.africa.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Packages {
    @Id
    private String id;
    @DBRef
    private Receiver receiver;
    @DBRef
    private Sender sender;
    private String description;
    private int quantity;
    private BigDecimal deliveryFee;
    private LocalDateTime createdAt;
    @DBRef
    List<TrackingLog> trackingLogs = new ArrayList<>();
}