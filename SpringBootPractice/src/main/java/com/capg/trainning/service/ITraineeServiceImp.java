package com.capg.trainning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.training.beans.Trainee;
import com.capg.trainning.dao.ITraineeRepo;
@Service
public class ITraineeServiceImp implements ItraineeService {
@Autowired
ITraineeRepo repo;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repo.save(trainee);
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repo.save(trainee);
	}

	@Override
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Optional<Trainee> retrieveTrainee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
