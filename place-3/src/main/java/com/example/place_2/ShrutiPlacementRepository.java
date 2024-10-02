package com.example.place_2;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public interface ShrutiPlacementRepository extends JpaRepository<ShrutiPlacement,Integer> {

}
