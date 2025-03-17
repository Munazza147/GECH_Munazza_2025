package com.geccurd.SpringbootCrud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.geccurd.SpringbootCrud.DTO.StudentDTO;
import com.geccurd.SpringbootCrud.models.Student;
import com.geccurd.SpringbootCrud.service.StudentService;



@Controller

public class HomeController {
	private final StudentService studentService;
	
		
		public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


		@GetMapping({"","/"})
		public String getAllStudents(Model model) {
			List<Student> students = studentService.getAllstudents();
			model.addAttribute("students",students);
	 		return "students";
	}
		@GetMapping("/add_student")
		public String add_student(Model model) {
			StudentDTO studentDTO=new StudentDTO();
			model.addAttribute("studentDTO",studentDTO);
			return "add_student";
		}
		@PostMapping("/add-student")
		public String saveStudent(@ModelAttribute studentDTO studentDTO) {
	

}
