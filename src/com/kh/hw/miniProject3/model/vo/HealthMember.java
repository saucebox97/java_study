package com.kh.hw.miniProject3.model.vo;

import java.util.Date;

public class HealthMember {

    // 필드
    private String id;
    private String name;
    private char gender;
    private int age;
    private String job;
    private int start;
    private int last;
    private int locker;

    // 생성자 똑같은거만들면안됌
    public HealthMember() {

    }

    public HealthMember(String id, String name, char gender, int age, String job, int start, int last, int locker) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.start = start;
        this.last = last;
        this.locker = locker;
    }

    public void inform()
    {
        String lock = locker == 0 ? "무" : String.valueOf(locker);
        System.out.printf("[ 고객코드 : %s | 이름 : %s | 성별 : %s | 나이 : %d | 직업 : %s | 시작날짜 %d | 마지막날짜 : %d | 락커유무 : %s ] \n"
                ,id,name,gender,age,job,start,last,lock);
    }
    // 메서드
/*
    public  String inform() {
        return String.format("%s %s %c %d %s %d", id, name, gender, age, job, locker);
    }
*/
    public String getId() {
        return id;
    }

    public void setId(String code) {
        this.id = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        start = start;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        last = last;
    }

    public int getLocker() {
        return locker;
    }

    public void setLocker(int locker) {
        this.locker = locker;
    }
}

