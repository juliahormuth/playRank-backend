package com.github.juliahormuth.playRank.features.game.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "GAMES")
public class GameModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 11)
    private String description;

    @Column(name = "note", length = 100)
    private Integer note;
}
