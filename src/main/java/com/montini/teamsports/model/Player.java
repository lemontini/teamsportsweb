package com.montini.teamsports.model;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Boolean inATeam = false;
    private String logo;

    // Constructors

    public Player() {}

    public Player(String name, String logo) {
        this.name = name;
        this.inATeam = false;
        this.logo = logo;
        System.out.print("Player " + getPlayerData() + " has appeared.");
    }

    // Getters and Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean isInATeam() { return inATeam; }
    public void setInATeam(Boolean inATeam) { this.inATeam = inATeam; }

    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    // Methods

    public String getPlayerData() {
        return "[" + id + ". " + name + "]";
    }

    public void showPlayerData() {
        System.out.println(getPlayerData());
    }

}
