package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping()
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

}
