package com.studentregistration;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class StudentRegistrationController {
	
    @Autowired
    private ProgramService programService;
    @Autowired
    private StudentService studentService;
    
    //*************************************************************************PROGRAM CRUD METHODS*************************************************************
    // RESTful API methods for Program Retrieval operations
    @GetMapping("/programs")
    public List<Program> list() {
        return programService.listAll();
    }

    // RESTful API method for Program Create operation
    @PostMapping("/programs")
    public void add(@RequestBody Program program) {
        programService.save(program);
    }

    // RESTful API method for Program Update operation
    @PutMapping("/programs/{id}")
    public ResponseEntity<?> update(@RequestBody Program program, @PathVariable Integer id) {
        try {
            Program existProgram = programService.get(id);
            programService.save(program);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    // RESTful API method for Program Delete operation
    @DeleteMapping("/programs/{id}")
    public void delete(@PathVariable Integer id) {
        programService.delete(id);
    }

    //get program by id
    @GetMapping("/programs/{id}")
    public ResponseEntity<Program> get(@PathVariable Integer id) {
        try {
            Program program = programService.get(id);
            return new ResponseEntity<Program>(program, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Program>(HttpStatus.NOT_FOUND);
        }      
    }
    //*************************************************************************PROGRAM CRUD METHODS*************************************************************
    @GetMapping("/students")
    public List<Student> studentList() {
        return studentService.listAll();
    }

    // RESTful API method for Student Create operation
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    // RESTful API method for Student Update operation
    @PutMapping("/students/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Student student, @PathVariable Integer id) {
        try {
            Student existStudent = studentService.get(id);
            studentService.save(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }

    // RESTful API method for Student Delete operation
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.delete(id);
    }

    //get Student by id
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        try {
            Student student = studentService.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }      
    }
    
    

}
