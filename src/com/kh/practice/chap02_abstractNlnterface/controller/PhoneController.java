package com.kh.practice.chap02_abstractNlnterface.controller;

import com.kh.practice.chap02_abstractNlnterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNlnterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNlnterface.model.vo.V40;

public class PhoneController {

    private String[] result;

    public PhoneController() {
        result = new String[2];
    }

    public String[] method() {
        Phone[] phones = {
                new GalaxyNote9(),
                new V40()
        };

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] instanceof GalaxyNote9) {
                GalaxyNote9 galaxyNote9 = (GalaxyNote9) phones[i];
                result[i] = galaxyNote9.printInformation();
            } else if (phones[i] instanceof V40) {
                V40 v40 = (V40) phones[i];
                result[i] = v40.printInformation();
            }
        }
        return result;

    }
}
