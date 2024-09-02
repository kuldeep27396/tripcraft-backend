// TripRepository.java
package com.tripcraft.backend.repository;

import com.tripcraft.backend.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}