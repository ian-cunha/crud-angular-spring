package com.ian.controller;

import java.util.List;

import com.ian.model.Course;
import com.ian.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

  private final CourseRepository courseRepository;  
  
  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public List<Course> list() {
    return courseRepository.findAll();
  }

  
}
