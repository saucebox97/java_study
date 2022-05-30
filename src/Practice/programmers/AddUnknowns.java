package Practice.programmers;

public class AddUnknowns {

    public static int solution(int[] numbers) {
        int sum = 0;
        boolean [] arr = new boolean[10];

        for (int i = 0; i < numbers.length; i++) {
            arr[ numbers[i] ] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]) sum += i;
        }
        int answer = sum;
        return answer;
        /*
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += i;
        }

        for (int n : numbers) {
            sum -= n;
        }
        return sum;
         */
    }

    public static void main(String[] args) {
        int[] nums = {4,7};
        System.out.println(solution(nums));
    }

}
