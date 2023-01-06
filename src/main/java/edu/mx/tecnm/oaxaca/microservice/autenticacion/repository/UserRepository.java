/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.microservice.autenticacion.repository;

import edu.mx.tecnm.oaxaca.microservice.autenticacion.model.User;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JOSELYNE
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByCurp(String curp);

    Boolean existsByCurp(String curp);

    Boolean existsByEmail(String email);
}
