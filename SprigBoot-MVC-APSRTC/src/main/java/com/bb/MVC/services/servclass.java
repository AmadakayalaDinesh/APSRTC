package com.bb.MVC.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.MVC.entity.ApsrtcEntity;
import com.bb.MVC.repository.ApsrtcRepo;
@Service
public class servclass implements servinterface {
	@Autowired
	private ApsrtcRepo repo;
	@Override
	public String usserRegister(ApsrtcEntity ent) {
		
		ApsrtcEntity ett=repo.save(ent);
		
		return "Sussfully Your Ticket Is Booked Your Ticket No Is:"+ett.getTicketNo() +" Thank You "+ett.getUserName()+ " Vist Again " ;	
	}
	
	@Override
	public List<ApsrtcEntity> viewall() {
		return repo.findAll();
	}
	
	
	  @Override public ApsrtcEntity login(String name, Long telp) {
		  
	     return repo.loginTicket(name, telp);
	  }
	@Override
	public String Delete(int id) {
		Optional<ApsrtcEntity> kk=repo.findById(id);
		repo.deleteById( id);
		return "Sussfully Your Ticket Deleted "+kk.get().getUserName();
	}
	@Override
	public String userUpdate(ApsrtcEntity upd) {
		ApsrtcEntity aps= repo.save(upd);
		return "successfully upated "+aps.getUserName();
	}
	 
	
	}

