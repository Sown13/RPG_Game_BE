package com.group1.web_games.model.not_now;

import com.group1.web_games.model.not_now.EquipmentSlot;
import com.group1.web_games.model.main_entity.GameItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameItemEquipmentSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameItemEquipmentSlotId;
    @ManyToOne
    private EquipmentSlot equipmentSlot;
    @ManyToOne
    private GameItem gameItem;
}
