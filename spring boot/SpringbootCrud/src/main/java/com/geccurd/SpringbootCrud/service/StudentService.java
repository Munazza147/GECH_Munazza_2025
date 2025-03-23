package com.geccurd.SpringbootCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.geccurd.SpringbootCrud.DTO.StudentDTO;
import com.geccurd.SpringbootCrud.models.Student;
import com.geccurd.SpringbootCrud.repository.StudentRepository;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    // Constructor injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Save a new student
    public void saveStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setfName(studentDTO.getfName());
        student.setlName(studentDTO.getlName());
        student.setEmail(studentDTO.getEmail());
        student.setPhone(studentDTO.getPhone());
        student.setAddress(studentDTO.getAddress());
        studentRepository.save(student);
    }

    // Get a student by ID
    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    // Update an existing student
    public void updateStudent(StudentDTO studentDTO, Long id) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            student.setfName(studentDTO.getfName());
            student.setlName(studentDTO.getlName());
            student.setEmail(studentDTO.getEmail());
            student.setPhone(studentDTO.getPhone());
            student.setAddress(studentDTO.getAddress());
            studentRepository.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    // Delete a student
    public void deleteStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
}
