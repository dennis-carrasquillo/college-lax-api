package com.j2g.collegelax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "player_id")
	private int playerId;
	
	private int rank;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	private String team;
	
	private String cl;
	
	private String position;
	
	private int games;
	
	private int goals;
	
	private int assists;
	
	private int points;
	
	private double ppg;
	
	public Player()

}
