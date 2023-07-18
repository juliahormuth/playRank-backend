package com.github.juliahormuth.playRank.features.game.controller;


import com.github.juliahormuth.playRank.features.game.model.GameModel;
import com.github.juliahormuth.playRank.features.game.service.GameService;
import com.github.juliahormuth.playRank.features.game.service.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;


    @PostMapping()
    public GameModel saveGame(@RequestBody GameModel game) {
        GameModel gameCreated = this.gameService.saveNewGame(game);
        return gameCreated;
    }

    @GetMapping("/{name}")
    public GameModel getGames(@PathVariable String name) {
        GameModel game = this.gameService.findGameByName(name);
        return game;
    }
}
