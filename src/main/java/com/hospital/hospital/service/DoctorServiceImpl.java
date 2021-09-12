package com.hospital.service;

import com.hospital.hospital.domain.Appointment;
import com.hospital.hospital.domain.Doctor;
import com.hospital.hospital.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.Optional;
import java.util.Set;

@Service
public class DoctorServiceImpl implements DoctorService {


    private DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Set<Doctor> getAppointmentsByDate(String doctorName) {
        Optional<Doctor> doctor = doctorRepository.findByName(doctorName);
        Doctor doctor1 = doctor.get();

        Set<Appointment> appointments = doctor1.getAppointments();
        Set<Doctor> doctors = doctorRepository.findAll();
        return doctors;
    }
}
