package com.github.juliahormuth.playRank.features.game.service;

import com.github.juliahormuth.playRank.features.game.model.GameModel;
import com.github.juliahormuth.playRank.features.game.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    GameRepository gameRepository;

    public GameModel saveNewGame(GameModel game) {
        GameModel newGame = new GameModel();
        newGame.setName(game.getName());

        GameModel gameCreated = this.gameRepository.save(newGame);
        return gameCreated;
    }

    public GameModel findGameByName(String name) {
        GameModel game = this.gameRepository.findByName(name);
        return game;
    }
}
