package com.Onesofts.JenkinTrail.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/admin")
public class JenkinTrail {
@GetMapping(value="/msg")
public String getmsg() {
	return "Hello the message recevied";
}
}
