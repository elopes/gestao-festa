package com.enlopes.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enlopes.festa.model.Convidado;
import com.enlopes.festa.repository.Convidados;

/*vamos anotar a classe com @Controller, para
dizer que ela é um componente Spring e que é um controller.*/
@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
	ModelAndView modelAndView = new ModelAndView("ListaConvidados");
				
	modelAndView.addObject("convidados", convidados.findAll());
	
	modelAndView.addObject("convidado", new Convidado());
		
		return modelAndView;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		
		this.convidados.save(convidado);
		return "redirect:/convidados";
		
	}
	
	/*o método listar() é chamado quando acessarmos no browser
	a URL http://localhost:8080/convidados*/
	/*@GetMapping("/convidados") 
	public String listar() {
		return "ListaConvidados";
		
		}*/
	
}


