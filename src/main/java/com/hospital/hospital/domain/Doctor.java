package com.hospital.hospital.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Doctor {
    @Id
    private String id;
    @Column
    private String name;

//    @JsonIgnore
//    @ManyToMany(fetch = FetchType.LAZY)
//    private Set<Patient> patients;

    @OneToMany(mappedBy = "doctor")
    private Set<Appointment> appointments;

    public Doctor(String name, Set<Appointment> appointments) {
        this.name = name;
        this.appointments = appointments;
    }

}
