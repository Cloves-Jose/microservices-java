package com.microservices.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.hrworker.entitie.Worker;

/* O WorkRepository, assim como os repositórios em geral
 * terão os métodos para fazer o acesso aos dados, ou seja 
 * métodos comuns de uma operação crud.*/

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
