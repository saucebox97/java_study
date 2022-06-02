package com.kh.hw.miniProject3.controller;

import com.kh.hw.miniProject3.model.vo.HealthMember;

import java.util.Date;

public class HealthMemberController {

    private HealthMember[] hm = new HealthMember[SIZE];


    public static final int SIZE = 10;

    public HealthMemberController() {
        hm[0] = new HealthMember("aaa", "김철수", 'M', 25, "대학생", 20220602, 20200902, "3");
        hm[1] = new HealthMember("bbb", "박영희", 'W', 15, "중학생", 20220602, 20200603, "1");
        hm[2] = new HealthMember("ccc", "김철수", 'M', 35, "직장인", 20220602, 20200702, "2");
    }

    // 회원의 숫자
    public int existMembereNum() {
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
    public void insertMember(String code, String name, char gender, int age, String job, String start, String last, int locker) {
        int count = existMembereNum();
        hm[count] = new HealthMember(code, name, gender, age, job, locker);
    }


    public int findIndexByID(String id) {
        int index = -1;
        for (int i = 0; i < existMembereNum(); i++) {
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
        for (int i = 0; i < existMembereNum(); i++) {
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

    public boolean updateStart(String id, Date newStart) {
        HealthMember member = searchId(id);
        if (member != null) {
            member.setStart(newStart);
            return true;
        }
        return false;
    }

    public boolean deleteOne(String id) {
        int index = -1;
        index = findIndexByID(id);
        if (index != -1)
        {
            for (int i = index; i < existMembereNum() - 1; i++) {
                hm[i] = hm[i + 1];
            }
            // 마지막 null로 변경
            hm[existMembereNum() - 1] = null;
            return true;
        }
        return false;
    }

    public void delete() {
        int count = existMembereNum();
        for (int i = 0; i < count; i++) {
            hm[i] = null;
        }
    }

    public HealthMember[] printAll() {
        return hm;
    }

    public int checklocker() {
       int locker = (int) (Math.random() * 10 + 1);
       if (!isDuplicate(locker)) {
           for (int i = 0; i < existMembereNum(); i++) {
               hm[i].getLocker() = locker;
           }
       }
       return locker;
    }

    public boolean isDuplicate(int locker) {
        for (int i = 0; i < existMembereNum(); i++) {
            if ([i].getLocker() = locker) return true;
        }
        return false;
    }

}
