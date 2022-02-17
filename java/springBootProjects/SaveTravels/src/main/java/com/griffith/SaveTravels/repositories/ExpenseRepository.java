package com.griffith.SaveTravels.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.griffith.SaveTravels.models.Expense;

//REPOSITORIES HAVE DIRECT ACCESS TO OUR SQL DB

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
	
}
