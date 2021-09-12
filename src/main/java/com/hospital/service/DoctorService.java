package com.hospital.service;

import com.hospital.hospital.domain.Appointment;
import com.hospital.hospital.domain.Doctor;

import java.util.Optional;
import java.util.Set;

public interface DoctorService {

    public Set<Doctor>  getAppointmentsByDate(String doctorName);
}
