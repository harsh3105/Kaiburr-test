package com.spring.test.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.exception.NotFoundException;
import com.spring.test.model.Id;
import com.spring.test.model.Name;
import com.spring.test.model.Server;
import com.spring.test.repository.ServerRepository;


@Controller
public class ServerController {
	
	@Autowired
	private ServerRepository repo;
	
	@GetMapping("/add")
	public String showAdd(Server server, BindingResult bindingResult, Model model){
		model.addAttribute("server",server);
		return "add";
	}
	
	@RequestMapping(value ="/addServer", produces="application/json", method=RequestMethod.POST)
	public String saveServer(@ModelAttribute Server server) {
		repo.save(server);
		return "done";
	}
	
	@GetMapping("/getByName")
	public String showGetByName(Model model) {
		Name foo = new Name();
		model.addAttribute("foo", foo);
		return "getbyname";
	}
	
	@RequestMapping(value="/findByName", method=RequestMethod.POST)
	public String getServerByName(@ModelAttribute(value = "foo") Name foo,Model model){
		if(!repo.findServerByName(foo.getName()).isEmpty()) {
		model.addAttribute("result", repo.findServerByName(foo.getName()).get(0));
		return "new";
		}
		else {
			throw new NotFoundException();
		}
	}
	
	@GetMapping("/getByID")
	public String showGetByID(Model model) {
		Id foo = new Id();
		model.addAttribute("foo", foo);
		return "getbyid";
	}
	
	@RequestMapping(value="/findByID", method=RequestMethod.POST)
	public String getServerByID(@ModelAttribute(value="id") Id foo,Model model){
		if(repo.findById(foo.getId()).isPresent()) {
			model.addAttribute("result", repo.findById(foo.getId()).get());
			return "new";
		}
		else {
			throw new NotFoundException();
		}
	}
	
	@GetMapping("/deleteByID")
	public String showDeleteByID(Model model) {
		Id foo = new Id();
		model.addAttribute("foo", foo);
		return "delete";
	}
	
	@PostMapping("/deleteByID")
	public String deleteServerByID(@ModelAttribute(value="id") Id foo,Model model) {
		model.addAttribute("result", repo.deleteById(foo.getId()));
		return "done";
	}
}
