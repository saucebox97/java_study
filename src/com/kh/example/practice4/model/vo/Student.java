package com.kh.example.practice4.model.vo;

public class Student {

    int grade;
    int classroom;
    String name;
    double height;
    char gender;

    public Student(int sGrade, int sClassroom, String sName, double sHeight, char sGender) {
        grade = sGrade;
        classroom = sClassroom;
        name = sName;
        height = sHeight;
        gender = sGender;
    }

    public void information() {
        System.out.printf("%d학년 %d반 %s 정보: 키:%.2fCM 성별:%c", grade, classroom, name, height, gender);
    }
}
