package com.group1.web_games.model.intermediate;

import com.group1.web_games.model.main_entity.GameSession;
import com.group1.web_games.model.main_entity.GameCharacter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionCharacterId;
    @ManyToOne
    private GameSession gameSession;
    @ManyToOne
    private GameCharacter gameCharacter;

    public SessionCharacter(GameSession gameSession, GameCharacter gameCharacter) {
        this.gameSession = gameSession;
        this.gameCharacter = gameCharacter;
    }
}
