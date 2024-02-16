package com.example.springdata_asterixapi.repository;

import com.example.springdata_asterixapi.model.Asterix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsterixRepo extends MongoRepository<Asterix, String> {
}
