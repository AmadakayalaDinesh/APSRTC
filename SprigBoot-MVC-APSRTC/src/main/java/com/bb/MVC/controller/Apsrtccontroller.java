package com.bb.MVC.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bb.MVC.entity.ApsrtcEntity;
import com.bb.MVC.services.servinterface;

@Controller
public class Apsrtccontroller {
	@Autowired
	private servinterface serv;
	@GetMapping("/")
	public String homepage() {
		return "home";
	}
		@GetMapping("/bookTicket")
		public String bookTkt(@ModelAttribute("travel") ApsrtcEntity  aps) {
			return "user-register";
		}
			
			@PostMapping("/bookTicket")
			public String bookTktconf(@ModelAttribute("travel") ApsrtcEntity aps,Map<String,Object> map) {
				String str=serv.usserRegister(aps);
				map.put("msg", str);
				return "MSG";
	         }
			
				/*@GetMapping("/viewall")
				public ResponseEntity<List <ApsrtcEntity>> aps(){
					return new ResponseEntity<List<ApsrtcEntity>>(serv.viewall(),HttpStatus.OK);
				}*/
			
			@GetMapping("/viewall")
			public String aps(Map<String , Object> map){
				map.put("all",serv.viewall());
				return "ViewAll";
			}
			
			@GetMapping("/login")
			public String tktLogin(){
				return "user-login";
			}

			@PostMapping("/login")
			public String loginSuccess(@RequestParam("name")  String name,@RequestParam("tel") long phone,Model model) throws Exception{
			     ApsrtcEntity aps=serv.login(name, phone);
			     model.addAttribute("details", aps);
				return "profile";
			}
			
			@PostMapping("/edit")
			public String update(@ModelAttribute("update") ApsrtcEntity aps,Map<String,Object> map) {
				String up=serv.userUpdate(aps);
				map.put("msg",up);
				return "MSG";
	        }
			
			@GetMapping("/delete")
			public String Deleteapsretc()  {
				return "Delete";	
			}
			
			@PostMapping("/delete")
			public ResponseEntity<?> Delettsrtc(@RequestParam(name = "kajal") int id)  {
				return new ResponseEntity<String>(serv.Delete(id),HttpStatus.BAD_REQUEST);
				
			}
}
