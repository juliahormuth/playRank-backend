package com.github.juliahormuth.playRank.features.game.service;

import com.github.juliahormuth.playRank.features.game.model.GameModel;

public interface GameService {
    public GameModel saveNewGame(GameModel game);
    public GameModel findGameByName(String name);
}
