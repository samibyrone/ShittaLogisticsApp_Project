package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.model.Packages;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface PackageRepository extends MongoRepository<Packages, String> {
        public Package findByName(String name);
}
