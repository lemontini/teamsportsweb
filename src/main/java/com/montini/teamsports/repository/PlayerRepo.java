package com.montini.teamsports.repository;

import com.montini.teamsports.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Long> {
}