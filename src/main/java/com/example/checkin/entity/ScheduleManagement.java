package com.example.checkin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "checkin")
public class ScheduleManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author")
    private Admin author;  // 일정 작성자 (Admin)

    @Column(name = "start_date")
    private LocalDateTime startDate;  // 일정 시작 일시

    @Column(name = "end_date")
    private LocalDateTime endDate;    // 일정 종료 일시

    @Column(columnDefinition = "TEXT")
    private String content;  // 일정 내용

    @Column(name = "attachment_path", length = 255)
    private String attachmentPath;  // 첨부파일 경로

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;  // 삭제 여부 (기본값은 false)
}
