package com.kh.example.practice1.model.vo;

public class Member { // 필드 영원한것 객체의속성

    String memberId;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;

    public Member() {}

    public void changeName(String name) {
        memberName = name;
    }
    public void printName() {
        System.out.printf("이름: %s\n", memberName);
    }
}
