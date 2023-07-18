package com.github.juliahormuth.playRank.features.game.controller;


import com.github.juliahormuth.playRank.features.game.model.GameModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {


    @GetMapping()
    public String getGames() {
    GameModel gameModel = new GameModel();
    gameModel.setName("Test");
    String game = gameModel.getName();
    return game;
    }
}
