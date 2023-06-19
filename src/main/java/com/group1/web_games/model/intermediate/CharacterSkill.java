package com.group1.web_games.model.intermediate;

import com.group1.web_games.model.main_entity.Character;
import com.group1.web_games.model.main_entity.Skill;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterSkillId;
    @ManyToOne
    private Character character;
    @ManyToOne
    private Skill skill;
}
