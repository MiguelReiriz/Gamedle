package com.springboot.gamedle.controller;

import java.util.List;
import java.util.Optional;

import com.springboot.gamedle.dto.GameDTO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.gamedle.entity.Game;
import com.springboot.gamedle.service.GameService;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "http://localhost:4200/")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping
    public ResponseEntity<List<Game>> getAll(){
        return ResponseEntity.ok(gameService.getAll());
    }
    @GetMapping("/AllNames")
    public List<String> getAllnombre(){
        return gameService.getAllnombre();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getOne(ObjectId _id){
        if(gameService.getOneById(_id).isPresent()){
            return ResponseEntity.ok(gameService.getOneById(_id).get());
        } else {
            throw new RuntimeException("Data not found");
        }

    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Game> getOneName(@PathVariable String nombre){
        Optional<Game> game = gameService.getOneByName(nombre);

        if(game.isPresent()){
            return ResponseEntity.ok(game.get());
        } else {

            throw new RuntimeException("Data not found");
        }
    }
    

    @PostMapping
    public ResponseEntity<Game> save(@RequestBody GameDTO dto){
        return ResponseEntity.ok(gameService.save(dto));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Game> uda(@PathVariable("id") ObjectId id, @RequestBody GameDTO dto){
        return ResponseEntity.ok(gameService.update(id,dto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Game> delete(@PathVariable("id") ObjectId id){
        return ResponseEntity.ok(gameService.delete(id));

}

}
