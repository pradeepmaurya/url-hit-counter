package com.hitCounter.app.service;

import org.springframework.stereotype.Component;

import com.hitCounter.app.count.Count;

@Component
public class Visit {

	static int count = 1;
	
	public Count getVisit() {
		Count visit = new Count(count++);
		return visit;
	}
	
	
}
