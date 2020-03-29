package com.capg.trainning.service;

import java.util.Optional;

import com.capg.training.beans.Trainee;

public interface ItraineeService {

	public Trainee addTrainee(Trainee trainee);
	public Trainee modifyTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Optional<Trainee>retrieveTrainee(int id);
	
	
	
	
	
	
	
}
