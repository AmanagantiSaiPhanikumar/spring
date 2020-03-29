package com.capg.trainning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.training.beans.Trainee;
import com.capg.trainning.service.ItraineeService;
@RestController
@RequestMapping("/trainning")
class TraineeController {
@Autowired
ItraineeService service;
@PostMapping("/add")
@ResponseBody
public Trainee  addTrainee(@RequestBody Trainee trainee)
{
	return service.addTrainee(trainee);
}

	
}
