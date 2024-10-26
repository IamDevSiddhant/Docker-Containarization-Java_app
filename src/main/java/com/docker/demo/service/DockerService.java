package com.docker.demo.service;

import com.docker.demo.entity.DockerEntity;
import com.docker.demo.repository.DockerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DockerService {

    private final DockerRepo repo;


    public DockerService(DockerRepo repo) {
        this.repo = repo;
    }

    public DockerEntity saveIt(DockerEntity dockerEntity){
        return repo.save(dockerEntity);
    }

    public List<DockerEntity> getAllDockers(){
        return repo.findAll();
    }
}
