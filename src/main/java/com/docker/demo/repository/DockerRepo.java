package com.docker.demo.repository;

import com.docker.demo.entity.DockerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerRepo extends JpaRepository<DockerEntity,Long> {
}
