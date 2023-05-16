package com.example.demo.service.impl;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {

    private final DemoRepository repository;

    public DemoServiceImpl(DemoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<DemoEntity> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<DemoEntity> create(DemoEntity demo) {
        return Optional.of(repository.save(demo));
    }
}
