package com.hospital.hospital.controller;

import com.hospital.hospital.domain.Appointment;
import com.hospital.hospital.domain.Doctor;
import com.hospital.service.DoctorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@Validated
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private DoctorService doctorService;

    @GetMapping({"/{doctorName}"})
    public Set<Doctor>  getAppointments(@PathVariable String doctorName) {
        return doctorService.getAppointmentsByDate(doctorName);
    }
}
