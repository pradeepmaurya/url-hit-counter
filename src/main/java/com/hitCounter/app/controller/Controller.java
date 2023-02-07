package com.hitCounter.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitCounter.app.count.Count;
import com.hitCounter.app.service.Visit;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class Controller {

	@Autowired
	public Visit visit;
	
	
	@GetMapping("/count")
	public Count counting() {
		return visit.getVisit();
	}
	
}
