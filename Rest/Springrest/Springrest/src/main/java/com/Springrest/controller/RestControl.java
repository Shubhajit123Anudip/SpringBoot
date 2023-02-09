package com.Springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.entity.Course;
import com.Springrest.service.Restservices;

@RestController

public class RestControl {
	@Autowired
	private Restservices restservices;
	
   @GetMapping("/1stproject")
   public String display() {
	   return "Welcome to our 1st project";
   }//get all the cources
   @GetMapping("/courses")
   public List<Course>getcourses(){
	   return this.restservices.getcourses();
	   
   }
}
