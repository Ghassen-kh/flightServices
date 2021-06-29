package com.ghassen.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghassen.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
