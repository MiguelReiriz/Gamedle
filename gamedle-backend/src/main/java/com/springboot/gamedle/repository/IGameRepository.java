package com.springboot.gamedle.repository;


import com.springboot.gamedle.entity.Game;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IGameRepository extends MongoRepository<Game, ObjectId> {
    Optional<Game> findByNombre(String nombre);
}
