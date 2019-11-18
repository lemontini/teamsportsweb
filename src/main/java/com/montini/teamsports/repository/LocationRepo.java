package com.montini.teamsports.repository;

import com.montini.teamsports.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location, Integer> {
}
