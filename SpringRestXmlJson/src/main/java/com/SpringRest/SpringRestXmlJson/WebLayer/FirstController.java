package com.SpringRest.SpringRestXmlJson.WebLayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class FirstController
{

	
	@PostMapping("/addCourse")
	public ResponseEntity<?> addCourse(@RequestBody Course course)
	{
		String res="Course Added Successfully";
		return new ResponseEntity<>(res,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/getCourse",produces = {"application/xml","application/json"})
	public ResponseEntity<?> getCourse()
	{
		Course course=new Course(101,"SBM",9999.9);
		return new ResponseEntity<>(course,HttpStatus.CREATED);
	}
	
}
