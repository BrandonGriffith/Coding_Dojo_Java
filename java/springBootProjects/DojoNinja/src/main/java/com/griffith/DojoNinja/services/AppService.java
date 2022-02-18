package com.griffith.DojoNinja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.griffith.DojoNinja.models.Dojo;
import com.griffith.DojoNinja.models.Ninja;
import com.griffith.DojoNinja.repositories.DojoRepository;
import com.griffith.DojoNinja.repositories.NinjaRepository;

@Service
public class AppService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;

	public AppService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos(){
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}
