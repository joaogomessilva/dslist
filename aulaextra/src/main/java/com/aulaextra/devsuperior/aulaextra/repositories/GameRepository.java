package com.aulaextra.devsuperior.aulaextra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaextra.devsuperior.aulaextra.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{

}
