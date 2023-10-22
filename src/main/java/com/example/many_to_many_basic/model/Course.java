package com.example.many_to_many_basic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Course {
    @Id
    Long id;
    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;
}
