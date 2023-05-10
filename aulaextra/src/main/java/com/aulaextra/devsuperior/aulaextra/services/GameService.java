package com.aulaextra.devsuperior.aulaextra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaextra.devsuperior.aulaextra.dto.GameMinDTO;
import com.aulaextra.devsuperior.aulaextra.entities.Game;
import com.aulaextra.devsuperior.aulaextra.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
		
	}

}
