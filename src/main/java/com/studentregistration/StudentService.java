package com.studentregistration;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
 
    @Autowired
    private StudentRepository repo;
     
    public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student student) {
        repo.save(student);
    }
     
    public Student get(Integer studentId) {
        return repo.findById(studentId).get();
    }
     
    public void delete(Integer studentId) {
        repo.deleteById(studentId);
    }
}
