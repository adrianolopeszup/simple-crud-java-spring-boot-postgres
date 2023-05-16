package com.example.demo.service;

import com.example.demo.entity.DemoEntity;

import java.util.Optional;

public interface DemoService {
    Optional<DemoEntity> findById(Integer id);
    Optional<DemoEntity> create(DemoEntity demo);
}
