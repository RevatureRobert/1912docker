package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Trophy;
import com.example.service.TrophyService;

@Controller
public class TrophyController {
	@Autowired
	TrophyService ts;

	@GetMapping(value="trophy/{id}")
	public @ResponseBody Trophy getById(@PathVariable("id") int id) {
		return ts.getById(id);
	}
}
