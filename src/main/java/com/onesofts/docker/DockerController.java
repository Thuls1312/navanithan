package com.onesofts.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class DockerController {

	@GetMapping("/value")
	public String display() {
		return "Hello world";
		
	}
}
