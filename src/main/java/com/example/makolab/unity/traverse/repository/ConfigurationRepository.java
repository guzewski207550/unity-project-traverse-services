package com.example.makolab.unity.traverse.repository;

import org.springframework.stereotype.Repository;

import com.example.makolab.unity.traverse.models.FurnitureConfiguration;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ConfigurationRepository extends MongoRepository<FurnitureConfiguration, String> {

}
