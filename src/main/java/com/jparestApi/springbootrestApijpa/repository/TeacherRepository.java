package com.jparestApi.springbootrestApijpa.repository;

import com.jparestApi.springbootrestApijpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}