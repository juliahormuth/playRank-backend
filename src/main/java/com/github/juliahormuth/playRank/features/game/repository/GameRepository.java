package com.github.juliahormuth.playRank.features.game.repository;

import com.github.juliahormuth.playRank.features.game.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Integer> {
    GameModel findByName(String name);
}
