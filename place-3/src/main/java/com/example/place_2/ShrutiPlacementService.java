package com.example.place_2;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ShrutiPlacementService {
	@Autowired
	private ShrutiPlacementRepository repository;
	public List <ShrutiPlacement>listAll()
	{
		return repository.findAll();	
	}
	
	public ShrutiPlacement get(Integer id)
	{
		return  repository.findById(id).get();		
	}
	public void save(ShrutiPlacement placement)
	{
		repository.save(placement);
	}
	public void delete(Integer id)
	{
		repository.deleteById(id);
	}
}
	
	