package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.model.Receiver;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ReceiverRepository extends MongoRepository<Receiver, String> {

}
