package com.example.checkin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "checkin")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students students;

    private int year;
    private int month;
    private int day;

    @ManyToOne
    @JoinColumn(name = "attendance_09_hour")
    private AttendanceType attendance09Hour; // 09시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_10_hour")
    private AttendanceType attendance10Hour; // 10시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_11_hour")
    private AttendanceType attendance11Hour; // 11시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_13_hour")
    private AttendanceType attendance13Hour; // 13시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_14_hour")
    private AttendanceType attendance14Hour; // 14시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_15_hour")
    private AttendanceType attendance15Hour; // 15시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_16_hour")
    private AttendanceType attendance16Hour; // 16시 출결 상태

    @ManyToOne
    @JoinColumn(name = "attendance_17_hour")
    private AttendanceType attendance17Hour; // 17시 출결 상태
}
