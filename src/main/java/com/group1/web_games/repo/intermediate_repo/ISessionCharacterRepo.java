package com.group1.web_games.repo.intermediate_repo;

import com.group1.web_games.model.intermediate.SessionCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISessionCharacterRepo extends JpaRepository<SessionCharacter,Long> {
}
