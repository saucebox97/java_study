package day18.api.io.filelOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        // 파일 읽어들이려면
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("E:/sl_test/java_study/src/datastructure/chap02/linkedlist/singly/Node.java");// InputStream 은 추상클래스여서안됌 상속받은걸써야함
//
//            int data = 0;
//            while (data != -1) {
//                data = fis.read(); // 1바이트씩 읽는다
//                System.out.write(data); // 아스키를 문자로 출력
//            }
//            System.out.println("data = " + (char)data);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("파일을 찾을 수 없습니다.");
//        } catch (IOException e) {
//            System.out.println("에러!");
//        } finally {
//            try {
//                if (fis != null) fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        String path = "E:/sl_test/java_study/src/datastructure/chap02/linkedlist/singly/Node.java";
        // try with resource : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
        try (FileInputStream fis = new FileInputStream(path)) {
            // InputStream 은 추상클래스여서안됌 상속받은걸써야함

            int data = 0;
            while (data != -1) {
                data = fis.read(); // 1바이트씩 읽는다
                System.out.write(data); // 아스키를 문자로 출력
            }
            System.out.println("data = " + (char)data);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("에러!");
        }
    }
}
