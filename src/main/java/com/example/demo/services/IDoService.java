package com.example.demo.services;

import com.example.demo.domain.DoEntity;

import java.util.List;

public interface IDoService {
    public List<DoEntity> findAll();
    public List<DoEntity> listFeatured();
    public void save(DoEntity doEntity);
    public DoEntity findById(Long id);
    public void delete(Long id);

}
