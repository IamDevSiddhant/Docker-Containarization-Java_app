package com.docker.demo.controller;

import com.docker.demo.entity.DockerEntity;
import com.docker.demo.service.DockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class DockerController {

    private final DockerService service;

    public DockerController(DockerService service) {
        this.service = service;
    }

    @GetMapping("/docker/check")
    public ResponseEntity<?> checkDocker(){
        Map<String ,String> dockMap = new HashMap<>();
        dockMap.put("docker","working");
        return new ResponseEntity<>(dockMap, HttpStatus.OK);
    }

    @PostMapping("/save/docker")
    public ResponseEntity<?> saveIt(@RequestBody DockerEntity dockerEntity){
        return new ResponseEntity<>(service.saveIt(dockerEntity),HttpStatus.CREATED);
    }

    @GetMapping("/allDockers")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(service.getAllDockers(),HttpStatus.OK);
    }
}
