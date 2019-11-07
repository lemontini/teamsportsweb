package com.montini.teamsports.repository;

import com.montini.teamsports.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PlayerRepoImpl {

    public static final Logger log = LoggerFactory.getLogger(PlayerRepoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    // Create
    public Player create(Player player) {
        entityManager.persist(player);
        entityManager.flush();
        return player;
    }

    // Update
    public Player update(Player player) {
        player = entityManager.merge(player);
        entityManager.flush();
        return player;
    }

    // Delete
    public void delete(Player player) {
        entityManager.remove(player);
        entityManager.flush();
    }

    // Find
    public Player find(Long id) {
        log.info(String.format("FIND #%d in", id) + this.getClass().getCanonicalName());
        return entityManager.find(Player.class, id);
    }

    public Player findById(long id) {
        return this.find(id);
    }

    public Player findAll(Long id) {
        return entityManager.find(Player.class, id);
    }

}
