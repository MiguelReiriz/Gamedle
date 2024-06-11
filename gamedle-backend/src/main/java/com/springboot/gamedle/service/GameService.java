package com.springboot.gamedle.service;

import java.util.List;
import java.util.Optional;

import com.springboot.gamedle.dto.GameDTO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.gamedle.entity.Game;
import com.springboot.gamedle.repository.IGameRepository;

@Service
@Transactional
public class GameService {
    
    @Autowired
    IGameRepository gameRepository;

    
    public List<Game> getAll(){
        return gameRepository.findAll();
    }

    public Optional<Game> getOneById(ObjectId _id){
        return gameRepository.findById(_id);
    }

    public Optional<Game> getOneByName(String nombre){
        return gameRepository.findByNombre(nombre);
    }



    public Game save(GameDTO dto){
        Game game = new Game(dto.getNombre(), dto.getCompania(), dto.getAno_lanzamiento(), dto.getGeneros(), dto.getPlataforma());
        return gameRepository.save(game);
    }

    public Game update(ObjectId _id, GameDTO dto){
        Game game = gameRepository.findById(_id).get();

        game.setNombre(dto.getNombre());
        return gameRepository.save(game);
    }

    public Game delete(ObjectId _id){
        Game game = gameRepository.findById(_id).get();
        gameRepository.delete(game);
        return game;
    }


}
