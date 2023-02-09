package com.Springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springrest.entity.Course;

@Service
public class SreviceImpl implements Restservices {
	List<Course>list;
	
		
		public SreviceImpl() {//default contructor
			list=new ArrayList<>();//object of array list
				list.add(new Course(101,"core java","Core java basic"));
				list.add(new Course(102,"Advance java","Advance java basic"));
				list.add(new Course(103,"spring boot","Spring boot basic"));
			}
@Override
public List<Course> getcourses(){
	return list;
}
}