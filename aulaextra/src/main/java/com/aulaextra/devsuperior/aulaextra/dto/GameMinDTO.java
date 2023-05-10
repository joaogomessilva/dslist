package com.aulaextra.devsuperior.aulaextra.dto;

import com.aulaextra.devsuperior.aulaextra.entities.Game;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game Entity) {
		super();
		id = Entity.getId();
		title = Entity.getTitle();
		year = Entity.getYear();
		imgUrl = Entity.getImgUrl();
		shortDescription = Entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	

}
