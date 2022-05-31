package com.example.demo.services;

import com.example.demo.domain.DoEntity;
import com.example.demo.repository.DoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoServicesImpl {
    @Autowired
    private DoRepository doRepository;

    public DoServicesImpl(DoRepository doRepository) {
        this.doRepository = doRepository;
    }


    public List<DoEntity> findAll(){
        return (List<DoEntity>) doRepository.findAll();
    }



    public void save (DoEntity events){
        doRepository.save(events);
    }


    public DoEntity findById(Long id){

        return doRepository.findById(id).orElse(null);
    }


    public void delete(Long id){
        doRepository.deleteById(id);
    }


    public List<DoEntity> listUsers(){
        return null;
    }

}
