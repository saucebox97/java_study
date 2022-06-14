package com.kh.practice.chap02_abstractNlnterface.run;

import com.kh.practice.chap02_abstractNlnterface.controller.PhoneController;

public class Run {

    public static void main(String[] args) {

        PhoneController pc = new PhoneController();
        String[] method = pc.method();
        for (String s : method) {
            System.out.println(s);
        }
    }
}
