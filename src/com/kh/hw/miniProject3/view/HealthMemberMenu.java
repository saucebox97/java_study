package com.kh.hw.miniProject3.view;

import com.kh.hw.miniProject3.controller.HealthMemberController;

import java.util.Scanner;

public class HealthMemberMenu {

    private Scanner sc = new Scanner(System.in);

    private HealthMemberController hmc = new HealthMemberController();

    public void mainMenu() {
        while (true) {
            System.out.println("\n# 최대 등록 가능한 회원수는 %d입니다");
        }
    }


}
