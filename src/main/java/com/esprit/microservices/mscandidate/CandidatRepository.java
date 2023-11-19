package com.esprit.microservices.mscandidate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CandidatRepository extends JpaRepository<Candidat,Integer> {

    @Query("select c from Candidat c where c.nom like :name")
    //Ilustrer en forme de page(Aff contenu en des pages) : La fontion Page
    public Page<Candidat> candidatByNom(@Param("name") String n, Pageable pageable);
}
