package com.example.demo.repository;

import com.example.demo.domain.DoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface DoRepository extends JpaRepository<DoEntity, Long>{}
