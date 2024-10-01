package com.bb.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bb.MVC.entity.ApsrtcEntity;

public interface ApsrtcRepo extends JpaRepository<ApsrtcEntity, Integer> {	
	  @Query("from ApsrtcEntity where  UserName=?1 AND phno=?2") 
	  public ApsrtcEntity loginTicket( String name, long phno);
	  
	 
}
