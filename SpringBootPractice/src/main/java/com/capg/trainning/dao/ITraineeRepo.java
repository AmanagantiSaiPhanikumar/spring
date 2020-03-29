package com.capg.trainning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.training.beans.Trainee;
@Repository
public interface ITraineeRepo extends JpaRepository<Trainee, Integer> {

}
