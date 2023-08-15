package com.example.many_to_many_basic.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/*
* Baseado em: https://www.baeldung.com/jpa-many-to-many
* */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    Long id;
    @ManyToMany
    @JoinTable(
        name = "course_likes",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> likedCourses;
}
