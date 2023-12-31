package com.group1.web_games.model.main_entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterDetailId;
    private int health;
    private int mana;
    private int physAtk;
    private int physDef;
    private int magicAtk;
    private int magicDef;
    @OneToOne
//    @PrimaryKeyJoinColumn(name = "character_id")
    private GameCharacter gameCharacter;
}
