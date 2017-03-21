package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.PushRequestService;

@RestController
public class RestPointController {

	private final PushRequestService pushRequestService;

	@Autowired
	public RestPointController(final PushRequestService pushRequestService) {
		this.pushRequestService = pushRequestService;
	}

	@GetMapping("push")
	public String push(@RequestParam Integer i1, @RequestParam Integer i2) {
		return pushRequestService.add(i1, i2);
	}

	@GetMapping("fetchAll")
	public List<Integer> fetchAll() {
		return pushRequestService.findAll();
	}
}
