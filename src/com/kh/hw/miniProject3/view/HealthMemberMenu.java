package com.kh.hw.miniProject3.view;

import com.kh.hw.miniProject3.controller.HealthMemberController;
import com.kh.hw.miniProject3.model.vo.HealthMember;
import com.kh.hw.miniProject3.controller.TrainerController;
import com.kh.hw.miniProject3.model.vo.Trainer;

import java.util.Scanner;

public class HealthMemberMenu {

    private Scanner sc = new Scanner(System.in);

    private HealthMemberController hmc = new HealthMemberController();
    private TrainerMenu t = new TrainerMenu();
    private TrainerController tc = new TrainerController();

    public void mainMenu() {
        while (true) {
            System.out.printf("\n# 최대 등록 가능한 회원수는 %d입니다", hmc.SIZE);

            int count = hmc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다", count);

            System.out.println("=======================================");

            System.out.println("# 1. 회원관리");
            System.out.println("# 2. 락커정보");
            System.out.println("# 3. 모든회원정보");
            System.out.println("# 4. 직원관리");
            System.out.println("# 5. 출석체크");
            System.out.println("# 0. 프로그램종료");

            System.out.println("\n# 메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 회원관리
                    MembershipManagement();
                    break;
                case 2:
                    // 락커정보
                    break;
                case 3:
                    // 모든회원정보
                    break;
                case 4:
                    // 직원관리
                    t.trainerManagement();
                    break;
                case 5:
                    // 출석체크
//                    attendanceCheck();
                    break;
                case 0:
                    // 프로그램종료
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하세요:");
            }
        }
    }


    public void managementPayroll() {

    }

    // 1번 메뉴
    private void MembershipManagement() {

        System.out.println("\n# 1. 회원등록");
        System.out.println("# 2. 회원수정");
        System.out.println("# 3. 회원검색");
        System.out.println("# 4. 회원탈퇴");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                insertMember();
                break;
            case 2:
                updateMember();
                break;
            case 3:
                searchMember();
                break;
            case 4:
//                deleteAll();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }

    private void insertMember() {

        String id = null;
        while (true) {
            id = inputStr("아이디: ");
            if (!hmc.checkId(id)) break;
            System.out.println("- 중복된 아이디입니다!");
        }
        String name = inputStr(" 이름: ");
        char gender = inputStr(" 성별(M/F): ").toUpperCase().charAt(0); // M이랑F하면 안돼게
        int age = inputNumber(" 나이: ");
        String job = inputStr(" 직업: ");
        int start = inputNumber(" 시작날짜:");
        int last = inputNumber(" 끝나는날짜:");
        int locker = inputNumber(" 락커번호:");

        hmc.insertMember(id, name, gender, age, job, start, last, locker);

        System.out.println("\n# 회원가입 성공!");

    }

    private void updateMember() {

        System.out.println("\n======= 회원 정보 수정 =======");
        System.out.println("# 1. 이름 수정하기");
        System.out.println("# 2. 성별 수정하기");
        System.out.println("# 3. 나이 수정하기");
        System.out.println("# 4. 직업 수정하기");
        System.out.println("# 5. 시작날짜 수정하기");
        System.out.println("# 6. 끝나는날짜 수정하기");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 이름 수정
                updateName();
                break;
            case 2:
                // 성별 수정
                updateGender();
                break;
            case 3:
                // 나이 수정
                updateAge();
                break;
            case 4:
                // 직업 수정
                updateJob();
                break;
            case 5:
                // 시작날짜 수정
                updateStart();
                break;
            case 6:
                // 끝나는날짜 수정
                updateLast();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }

    private void updateName() {

        String id = inputStr("- 아이디: ");
        String newName = inputStr("- 새로운 이름: ");

        if (hmc.updateName(id, newName)) {
            System.out.println("\n이름 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }

    private void updateGender() {

        String id = inputStr("- 아이디: ");
        char newGender = inputStr("- 새로운 나이: ").charAt(0);

        if (hmc.updateGender(id, newGender)) {
            System.out.println("\n성별 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }

    private void updateAge() {

        String id = inputStr("- 아이디: ");
        int newAge = inputNumber("- 새로운 나이: ");

        if (hmc.updateAge(id, newAge)) {
            System.out.println("\n나이 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }

    private void updateJob() {

        String id = inputStr("- 아이디: ");
        String newJob = inputStr("- 새로운 직업: ");

        if (hmc.updateJob(id, newJob)) {
            System.out.println("\n직업 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }

    private void updateStart() {

        String id = inputStr("- 아이디: ");
        int newStart = inputNumber("- 새로운 시작날짜: ");

        if (hmc.updateStart(id, newStart)) {
            System.out.println("\n시작날짜 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }

    private void updateLast() {

        String id = inputStr("- 아이디: ");
        int newLast = inputNumber("- 새로운 끝나는날짜: ");

        if (hmc.updateLast(id, newLast)) {
            System.out.println("\n끝나는날짜 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }
    }


    private void searchMember() {

        System.out.println("\n===== 회원 정보 검색 =====");
        System.out.println("# 1. 이름으로 검색하기");
        System.out.println("# 2. 아이디로 검색하기");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputNumber("- 메뉴 입력: ");
        switch (menu) {
            case 1:
                // 아이디 검색
//                searchName();
                break;
            case 2:
                // 이름 검색
//                searchId();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력하셨습니다");
        }
    }


    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }

    private int inputNumber(String msg) {
        System.out.printf(msg);
        return sc.nextInt();
    }


}

