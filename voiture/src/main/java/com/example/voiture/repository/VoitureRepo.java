package com.example.voiture.repository;

import com.example.voiture.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
//@Author Behloul
public interface VoitureRepo extends JpaRepository<Voiture,Long> {
}
