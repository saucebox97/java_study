package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class ClassTest {

    public static void main(String[] args) {

        MemberController mc = new MemberController();

//        int index = mc.findIndexById("ghi1234");
//        System.out.println("index = " + index);
//
//        System.out.println(mc.checkId("abc"));

        mc.insertMember("zzz", "김출수", "1111", "aaa@aaa.aaa", 'a', 33);

//        Member member = mc.searchId("def");
//        System.out.println(member.inform());

//        Member[] members = mc.searchName("김철수");
        /*for (member m : members) {
            System.out.println(m.inform());
        }*/

        Member member = mc.searchId("abc");
//        System.out.println(member.inform());

        mc.updatePassword("abc", "냥냥이");
        mc.updateEmail("abc", "asdasdasdasdasdasd");
        mc.updateName("abc", "김동길");

        mc.delete("abc");


        Member[] members = mc.printAll();
//        System.out.println(Arrays.toString(members));
        for (Member mm : members) {
            if (mm == null) break;
            System.out.println(mm.inform());
        }

    }
}
