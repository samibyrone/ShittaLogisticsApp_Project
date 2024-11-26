package com.semicolon.africa.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Receiver {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
}