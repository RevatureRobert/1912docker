package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Trophy;

public interface TrophyDaoContract extends CrudRepository<Trophy, Integer>{

	Trophy findById(int id);
}
