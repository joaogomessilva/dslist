package com.aulaextra.devsuperior.aulaextra.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulaextra.devsuperior.aulaextra.dto.GameListDTO;
import com.aulaextra.devsuperior.aulaextra.entities.GameList;
import com.aulaextra.devsuperior.aulaextra.repositories.GameListRepository;



@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly=true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x-> new GameListDTO(x)).toList();
		
	}

}
