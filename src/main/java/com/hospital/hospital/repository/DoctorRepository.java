package com.hospital.hospital.repository;

import com.hospital.hospital.domain.Doctor;
import com.sun.istack.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

    Optional<Doctor> findByName(@NotNull String name);

    Set<Doctor> findAll();
}
