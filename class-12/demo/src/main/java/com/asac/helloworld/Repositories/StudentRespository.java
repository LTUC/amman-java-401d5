package com.asac.helloworld.Repositories;

import com.asac.helloworld.Models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRespository extends CrudRepository<Student,Integer> {

}
