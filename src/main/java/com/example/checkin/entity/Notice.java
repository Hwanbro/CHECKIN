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
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author")
    private Admin author;  // 관리자가 작성한 공지사항

    @Column(name = "created_date")
    private LocalDateTime createdDate;  // 공지 작성 일시

    @Column(columnDefinition = "TEXT")
    private String content;  // 공지 내용

    @Column(name = "attachment_path", length = 255)
    private String attachmentPath;  // 첨부파일 경로

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;  // 삭제 여부 (기본값은 false)
}
