package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        Student Kim = new Student(3, 6, "김철수", 155.3, 'F');
        Kim.information();
    }
}
