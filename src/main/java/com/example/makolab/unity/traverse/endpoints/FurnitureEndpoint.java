package com.example.makolab.unity.traverse.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/furniture")
public class FurnitureEndpoint {
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Void> saveFurnitureConfiguration(){
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
