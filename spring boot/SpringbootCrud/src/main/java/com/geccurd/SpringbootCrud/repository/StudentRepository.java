package com.geccurd.SpringbootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geccurd.SpringbootCrud.models.Student;

public interface StudentRepository extends  JpaRepository<Student, Long>  {

}
