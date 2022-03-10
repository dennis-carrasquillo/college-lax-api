package com.j2g.collegelax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.j2g.collegelax.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
