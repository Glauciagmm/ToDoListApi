package com.example.demo.controllers;

import com.example.demo.domain.DoEntity;
import com.example.demo.repository.DoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DoController {

    @Autowired
    private final DoRepository doRepository;

    DoController(DoRepository doRepository){this.doRepository = doRepository;}

    @GetMapping("/todo")
        public List<DoEntity> findAllTodo() {return doRepository.findAll(); }

    @GetMapping("/todo/{id}")
    public DoEntity findTodo(@PathVariable Long id) {
        return doRepository.findById(id).orElseThrow(TodoNotFoundException::new);
    }

    @PostMapping("/todo")
    public DoEntity addActivity(@RequestBody DoEntity doEntity) {
        return doRepository.save(doEntity);
    }


    @DeleteMapping("/todo/{id}")
    public DoEntity deleteActivityById(@PathVariable Long id) {
        DoEntity doEntity = doRepository.findById(id).orElseThrow(TodoNotFoundException::new);
        doRepository.deleteById(id);
        return doEntity;
    }

    @PutMapping("/todo")
    public DoEntity updateActivityById(@RequestBody DoEntity doEntity) {
        return doRepository.save(doEntity);
    }

}
