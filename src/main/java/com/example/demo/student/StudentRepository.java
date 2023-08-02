package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPARepository takes in 2 identifiers, the entity and the type of the primary key
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

}
