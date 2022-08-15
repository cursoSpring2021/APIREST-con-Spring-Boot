package com.example.persona.repositories;

import com.example.persona.entities.Persona;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona,Long> {


}
