package com.semicolon.africa.data.repositories;


import com.semicolon.africa.data.model.Sender;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface SenderRepository extends MongoRepository<Sender, String> {

}
