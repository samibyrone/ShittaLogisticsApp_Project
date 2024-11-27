package com.semicolon.africa.data.repositories;


import com.semicolon.africa.data.model.TrackingLog;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TrackingLogRepository extends MongoRepository<TrackingLog, String> {

}
