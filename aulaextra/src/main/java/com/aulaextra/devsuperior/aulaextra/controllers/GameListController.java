package com.aulaextra.devsuperior.aulaextra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aulaextra.devsuperior.aulaextra.dto.GameListDTO;
import com.aulaextra.devsuperior.aulaextra.dto.GameMinDTO;
import com.aulaextra.devsuperior.aulaextra.services.GameListService;
import com.aulaextra.devsuperior.aulaextra.services.GameService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {

		
		@Autowired
		private GameListService gameListService;
		
		@Autowired
		private GameService gameService;

		
		@GetMapping
		public List<GameListDTO> findAll(){
			List<GameListDTO> result = gameListService.findAll();
			return result;
		}
		@GetMapping(value="/{listId}/games")
		public List<GameMinDTO> findByList(@PathVariable Long listId){
			List<GameMinDTO> result = gameService.findByList(listId);
			return result;
		
		}
	}
	

