package com.griffith.DojoNinja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.griffith.DojoNinja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
}
