package com.anlw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anliwen
 */
@RestController
public class TestController {

	@GetMapping("test")
	public String test(){
		return "hello springboot huhu!";
	}
}
