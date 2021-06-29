package com.ghassen.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghassen.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
