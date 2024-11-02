package com.iltoneto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iltoneto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	

}
