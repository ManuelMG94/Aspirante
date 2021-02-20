package com.web.usuario.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.usuario.Beans.BeanUser;
import com.web.usuario.WSUserContract.IWSUsers;

@Controller
public class UserController {

	@Autowired
	private IWSUsers _wsUsers;
	
	@RequestMapping(value="/users")
	public String index(Model model) {
		model.addAttribute("list",_wsUsers.GetAll());
		return "users/index";
	}
	
	@RequestMapping(value="/users/save1/{id}")
	public String ShowSave(@PathVariable("id") String id, Model model) {
		if((id!=null && !id.equals("null")) && !id.isEmpty()) {
			model.addAttribute("user", _wsUsers.FindById(id));
		}else {
			model.addAttribute("user", new BeanUser());
		}
		return "users/Save";
	}
	
	@PostMapping("/users/save")
	public String Save(BeanUser user,Model model) {
		_wsUsers.Save(user);
		
		return "redirect:/users";
	}
	
	@GetMapping("/users/delete/{id}")
	public String delete(@PathVariable String id, Model model) {
		_wsUsers.Delete(id);
		return "redirect:/users";
	}
}
