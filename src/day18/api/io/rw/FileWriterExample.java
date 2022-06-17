package day18.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample { // 쉬프트 f6

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("E:/Exercise/자바수업.txt")) {

            String str = "지금은 자바 입출력 수업중입니다.\n졸잼이야";
            fw.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
