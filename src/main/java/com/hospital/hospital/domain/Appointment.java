package com.hospital.hospital.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appointment {

    @Id
    private String id;

    @Column
    private LocalDateTime localDateTime;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    public Appointment(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
