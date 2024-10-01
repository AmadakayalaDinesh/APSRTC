package com.bb.MVC.services;

import java.util.List;

import com.bb.MVC.entity.ApsrtcEntity;

public interface servinterface {
	
	public String usserRegister(ApsrtcEntity ent);
	public List <ApsrtcEntity> viewall();
	
	public ApsrtcEntity login(String name,Long telp) throws Exception;
	
	public String Delete(int id);
	public String userUpdate(ApsrtcEntity upd);
}
