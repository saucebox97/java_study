package datastructure.chap04;

/*
1. 오름차 정렬 - Arrays.sort(배열변수)
2. s 를 첫위치 e를 끝위치에 둔다
3. 찾는 수보다 합산 수가 작은 경우
   s를 오른쪽으로 한칸 이동
4. 찾는 수보다 합산 수가 큰 경우
   e를 왼쪽으로 한칸 이동
5. 찾는 수와 합산 수가 같은 경우
   eount를 증가시키고 s++, e--
 */
public class 투_포인터_02 {

    public static void main(String[] args) {

        int[] N = {2,7,4,1,5,3};
        int O = 9;

        int start = 0, end = N.length;
        int M = N[start];
        int count = 0;

        while (start < end) {
            if (M == O) {
                count++;
                start++;
                end--;
            } else if (M > O) {
                M -= N[start];
                start++;
            } else {
                end--;
                M += N[end];
            }
        }
        System.out.println(count);
    }
}
