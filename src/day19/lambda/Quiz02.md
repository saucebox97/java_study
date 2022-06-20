#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 42;
                System.out.println(this.value); //this 필드 니까 로컬인 6,42지워야됌
            } // 4,5가돼는이유는 public(필드)니까 익명클래스여서 4는됄수없음
        };// this 는 자신의 클래스영억의 필드를 가르침
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```


---
정답: 5