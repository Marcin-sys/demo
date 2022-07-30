package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Marian",
                        "miarian.jamal@gmail.com",
                        LocalDate.of(2000, 1,5),
                        21
                )
        );
    }
}
