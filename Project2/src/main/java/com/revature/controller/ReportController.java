package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Report;
import com.revature.service.ReportService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/report")
public class ReportController {
	@Autowired
	public ReportService service;
	
	@RequestMapping(method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Report> add(@RequestBody Report r){
		r=service.add(r);
		if(r == null) return new ResponseEntity<Report>(HttpStatus.CONFLICT);
		return new ResponseEntity<Report>(r, HttpStatus.CREATED);
	
	}
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Report>> findAll(){
		return new ResponseEntity<List<Report>>(service.getAll(), HttpStatus.OK);
	}

}
