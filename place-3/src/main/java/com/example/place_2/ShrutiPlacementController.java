package com.example.place_2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShrutiPlacementController {
	@Autowired
	public ShrutiPlacementService service;
	//Retrieval
	@GetMapping("/Placement")
	public List<ShrutiPlacement> list(){
		return service.listAll();
	}
	//Retrieve  by Id
	@GetMapping("/Placement{id}")
	public ResponseEntity<ShrutiPlacement>get(@PathVariable Integer id)
	{
		try
		{
			ShrutiPlacement shrutiPlacement=service.get(id);
		     return new ResponseEntity<>(shrutiPlacement,HttpStatus.OK);
	}
		catch(Exception e)
		{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
		
	//create
	@PostMapping("/Placement")
	public void add(@RequestBody ShrutiPlacement placement)
	{
		service.save(placement);
	}
	//update
	@PutMapping("/Placement")
	public ResponseEntity<?>update(@RequestBody ShrutiPlacement placement,@PathVariable Integer id)
	{
		try {
			ShrutiPlacement existingPlacement=service.get(id);
			if(existingPlacement!=null)
			{
				service.save(placement);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}
	//Delete
	@DeleteMapping("/Placement/{id}")
	public ResponseEntity <Void> delete(@PathVariable Integer id)
	{
		try
		{
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); 	
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); 	
		}
	}	
}



	
