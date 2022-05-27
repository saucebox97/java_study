package Practice.programmers;

public class harshad {

    public static boolean solution(int x) {
        int sum=0;
        int a=x;

        while(a>0) {
            sum += a%10;
            a = a/10;
        }
        if (x%sum==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(18));
    }

}
