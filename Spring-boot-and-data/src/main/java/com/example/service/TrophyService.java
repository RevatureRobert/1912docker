package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TrophyDaoContract;
import com.example.model.Trophy;

@Service
public class TrophyService {

	@Autowired
	TrophyDaoContract td;
	
	
	public Trophy getById(int id) {
		return td.findById(id);
	}
}
