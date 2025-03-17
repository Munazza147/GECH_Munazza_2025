package com.geccurd.SpringbootCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geccurd.SpringbootCrud.models.Student;
import com.geccurd.SpringbootCrud.repository.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	//create constructor

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;

}
	 // to get list of students 
		public List<Student> getAllstudentsList(){
			List<Student> students= studentRepository.findAll();
		    return students;
		
	} // to get list of students 
		public List<Student> getAllstudents(){
			List<Student> students= studentRepository.findAll();
		    return students;
		    
		    public void saveStudent(studentDTO studentDTO) {
		    	Student student = new Student();
		    	student.setfName(studentDTO.getFName());
		    }
		
	}
}