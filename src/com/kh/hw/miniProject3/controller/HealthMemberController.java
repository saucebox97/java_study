package com.kh.hw.miniProject3.controller;

import com.kh.hw.miniProject3.model.vo.HealthMember;

import java.util.Date;

public class HealthMemberController {

    private HealthMember[] hm = new HealthMember[SIZE];


    public static final int SIZE = 10;

    public HealthMemberController() {
        hm[0] = new HealthMember("aaa", "김철수", 'M', 24, "대학생", 20200321, 20200621, 0);
        hm[1] = new HealthMember("bbb", "김영희", 'W', 17, "고등학생", 20200321, 20200421, 1);
        hm[2] = new HealthMember("ccc", "김철수", 'M', 28, "직장인", 20200521, 20200621, 2);
    }

    // 회원의 숫자
    public int existMemberNum() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (hm[i] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    // 회원정보
    public void insertMember(String id, String name, char gender, int age, String job, int start, int last, int locker) {
        int count = existMemberNum();
        hm[count] = new HealthMember(id, name, gender, age, job, start, last, locker);
    }


    public int findIndexByID(String id) {
        int index = -1;
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(hm[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 회원아이디찾기
    public HealthMember searchId(String inputId) {
        int index = findIndexByID(inputId);
        return (index != -1) ? hm[index] : null;
    }

    // 회원이름찾기
    public HealthMember[] searchName(String name) {

        // 임시 배열 생성
        HealthMember[] temp = new HealthMember[SIZE];
        int count = 0;
        for (int i = 0; i < existMemberNum(); i++) {
            if (name.equals(hm[i].getName())) {
                temp[count++] = hm[i];
            }
        }
        // 리턴할 배열
        HealthMember[] returned = new HealthMember[count];
        for (int i = 0; i < returned.length; i++) {
            returned[i] = temp[i];
        }
        return returned;
    }

    // 아이디 중복
    public int findIndexById(String id) {
        int index = -1;
        for (int i = 0; i < existMemberNum(); i++) { //m.length
            if (id.equals(hm[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean checkId(String inputId) {
        return findIndexById(inputId) != -1;
    }

    public boolean updateName(String id, String newName) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setName(newName);
            return true;
        }
        return false;
    }

    public boolean updateGender(String id, char newGender) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setGender(newGender);
            return true;
        }
        return false;
    }

    public boolean updateAge(String id, int newAge) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setAge(newAge);
            return true;
        }
        return false;
    }

    public boolean updateJob(String id, String newJob) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setJob(newJob);
            return true;
        }
        return false;
    }

    public boolean updateStart(String id, int newStart) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setStart(newStart);
            return true;
        }
        return false;
    }

    public boolean updateLast(String id, int newLast) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setLast(newLast);
            return true;
        }
        return false;
    }

    public boolean deleteOne(String id) {
        int index = -1;
        index = findIndexByID(id);
        if (index != -1)
        {
            for (int i = index; i < existMemberNum() - 1; i++) {
                hm[i] = hm[i + 1];
            }
            // 마지막 null로 변경
            hm[existMemberNum() - 1] = null;
            return true;
        }
        return false;
    }

    public void delete() {
        int count = existMemberNum();
        for (int i = 0; i < count; i++) {
            hm[i] = null;
        }
    }

    public HealthMember[] printAll() {
        return hm;
    }

    public boolean lockerInsert(String name, String id, int lockerNum) {
        for (HealthMember healthMember : hm) {
            if(healthMember == null) break;
            // 입력 이름이 있다면 입력한 락커번호로 바꾸기
            if(name.equals(healthMember.getName())) {
                // 같은 이름인 멤버가 없으면
                if (searchName(name).length == 1) {
                    healthMember.setLocker(lockerNum);
                    return true;
                }
                // 같은 이름인 멤버가 있으면
                else {
                    if (id.equals(healthMember.getId())) {
                        healthMember.setLocker(lockerNum);
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

}
