package com.weareforyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weareforyou.entity.Details;
import com.weareforyou.service.WeareforyouService;

@RestController
public class Weareforyou {

	@Autowired
	private WeareforyouService detailsservice;
	
@CrossOrigin(origins = {"http://localhost:3000"})
	@PostMapping(path = "/donate")
	public ResponseEntity<Details> postDetails(@RequestBody Details details) {
		
		return new ResponseEntity<Details>(detailsservice.saveDetails(details), HttpStatus.CREATED);
	}
	
	
@CrossOrigin(origins = {"http://localhost:3000"})
	@GetMapping(path = "/getdetails")
	public ResponseEntity<List<Details>> getAlldetails() {
		return new ResponseEntity<List<Details>>(detailsservice.getDetails(),HttpStatus.OK);
	}	
}
