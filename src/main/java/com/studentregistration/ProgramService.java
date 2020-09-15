package com.studentregistration;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProgramService {
 
    @Autowired
    private ProgramRepository repo;
     
    public List<Program> listAll() {
        return repo.findAll();
    }
     
    public void save(Program program) {
        repo.save(program);
    }
     
    public Program get(Integer programId) {
        return repo.findById(programId).get();
    }
     
    public void delete(Integer programId) {
        repo.deleteById(programId);
    }
}
