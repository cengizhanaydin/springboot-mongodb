package com.harbiyazilim.mongodb.springbootmongodbexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,Integer> {

}
