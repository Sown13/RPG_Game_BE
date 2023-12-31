package com.group1.web_games.model.main_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameSessionId;
    private String gameSessionName;
    private double money;
    @ManyToOne
    private UserEntity userEntity;
    private String gameSessionImage;
    private int stage;

    public GameSession(String gameSessionName, double money, UserEntity userEntity, String gameSessionImage, int stage) {
        this.gameSessionName = gameSessionName;
        this.money = money;
        this.userEntity = userEntity;
        this.gameSessionImage = gameSessionImage;
        this.stage = stage;
    }

}
