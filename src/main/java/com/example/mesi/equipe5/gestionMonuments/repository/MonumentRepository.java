package com.example.mesi.equipe5.gestionMonuments.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mesi.equipe5.gestionMonuments.Model.Monument;

@Repository
public interface MonumentRepository extends CrudRepository<Monument,Long>{

}
