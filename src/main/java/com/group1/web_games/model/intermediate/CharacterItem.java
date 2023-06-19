package com.group1.web_games.model.intermediate;

import com.group1.web_games.model.main_entity.Character;
import com.group1.web_games.model.main_entity.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterItemId;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Character character;
}