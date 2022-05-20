package day03;

import day02.StdOutput;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.printf(">> ");
        String season = sc.next();
        sc.close();

        // switch 괄호안에는 정수, 문자형 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season) {
            // case에는 switch변수에 들어갈 경우일 수 값들을 배치
            // 단 변수는 배치 불가능, 상수나 리터럴만 가능
            case "봄": case "spring":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "여름": case "summer":
                System.out.println("여름에는 낙산으로 가보세요~");
                break;
            case "가을": case "fall":
                System.out.println("가을에는 춘천도로 가보세요~");
                break;
            case "겨울": case "winter":
                System.out.println("겨울에는 홍천으로 가보세요~");
                break;
            default: // else기능
                System.out.println("[ 봄, 여름, 가을, 겨울 등 입력하세요 ]");
        }*/
        System.out.println("직급을 입력하세요");
        System.out.println("[사원,대리,과장,차장,부장]");
        String rank = sc.next();
        sc.close();
        switch (rank) {
            case "사원":
                System.out.println("사원의 급여는 200만웝입니다");
                break;
            case "대리":
                System.out.println("대리의 급여는 300만웝입니다");
                break;
            case "과장":
                System.out.println("사원의 급여는 400만웝입니다");
                break;
            case "차장":
                System.out.println("사원의 급여는 500만웝입니다");
                break;
            case "부장":
                System.out.println("사원의 급여는 600만웝입니다");
                break;
            default:
                System.out.printf("%s은(는)없는 직급입니다", rank);
        }

    }
}
