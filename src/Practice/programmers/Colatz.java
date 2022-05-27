package Practice.programmers;

public class Colatz {

    public static int solution(int num) {

        int count=0;
        long n1 = num;

        while(n1!=1) {
            if (n1%2==0) {
                n1 = n1/2;
                count ++;
            }
            else {
                n1 = n1*3+1;
                count ++;
            }

            if (count > 500){
                return -1;
            }
        }
        return count;
//        int answer = 0;
//        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

}
