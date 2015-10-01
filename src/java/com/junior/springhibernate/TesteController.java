package com.junior.springhibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.junior.springhibernate.model.User;
import com.junior.springhibernate.service.UserService;

@Controller
public class TesteController {
	
	@Autowired
	private UserService us;

	@RequestMapping("/aloMundo")
	public String execute(){
		System.out.println("Acessando controller no String!");
		return "ok";
	}
        
        @RequestMapping("/home")
        public String executar(){
            return "teste";
        }
	
	@RequestMapping("/adiciona")
	public String adiciona(){
		User user = new User();
		user.setNome("Luiza da Conçeição Jerônimo");
		user.setEmail("luiza@ig.com.br");
		user.setSenha("12345");
		
		us.saveUser(user);
		
		return "redirect:";
	}
		
	@RequestMapping("/")
	public ModelAndView home() {
		List<User> listUser = us.findAllUser();
		ModelAndView model = new ModelAndView("home");
		model.addObject("userList", listUser);
		return model;
	}
}
