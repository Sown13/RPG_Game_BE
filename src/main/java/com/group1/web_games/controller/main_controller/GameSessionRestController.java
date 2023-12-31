package com.group1.web_games.controller.main_controller;
import com.group1.web_games.model.main_entity.GameSession;
import com.group1.web_games.service.main_entity_service.game_session.IGameSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/game-session")
public class GameSessionRestController {
    @Autowired
    private IGameSessionService gameSessionService;

    @PostMapping
    private ResponseEntity<GameSession> saveGameSession(@RequestBody GameSession gameSession) {
        return new ResponseEntity<>(gameSessionService.save(gameSession), HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<Iterable<GameSession>> findAllGameSession() {
        return new ResponseEntity<>(gameSessionService.findAll(), HttpStatus.OK);
    }
    @GetMapping("{gameSessionId}")
    private ResponseEntity<GameSession> findGameSessionByGameSessionId(@PathVariable Long gameSessionId) {
        return new ResponseEntity<>(gameSessionService.findGameSessionByGameSessionId(gameSessionId), HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    private ResponseEntity<Iterable<GameSession>>findAllByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(gameSessionService.findGameSessionByUserId(userId),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    private ResponseEntity<GameSession> deleteGameSession(@PathVariable Long id) {
        Optional<GameSession> gameSession = gameSessionService.findById(id);
        if (!gameSession.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        gameSessionService.remove(id);
        return new ResponseEntity<>(gameSession.get(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    private ResponseEntity<GameSession> updateGameSession(@PathVariable Long id) {
        Optional<GameSession> gameSession = gameSessionService.findById(id);
        if (!gameSession.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        gameSessionService.save(gameSession.orElse(null));
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //    @GetMapping("{id}")
//    private ResponseEntity<Optional<GameSession>> findAllByUserId(@PathVariable Long id) {
//        return new ResponseEntity<>(gameSessionService.findAllByUserId(id), HttpStatus.OK);
//    @GetMapping("{id}")
//    private ResponseEntity<List<GameSession>> findTuongByUserId(@PathVariable Long id) {
//        return new ResponseEntity<>(gameSessionService.findByUserEntityUserId(id), HttpStatus.OK);
//    }
}
