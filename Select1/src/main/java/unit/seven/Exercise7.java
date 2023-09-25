package unit.seven;

import java.util.Arrays;

/*
* 중복 항목 제거하여 새 배열 반환
*   - 중복된 요소는 각 고유 요소의 첫번째 항목만 유지
*   - 중복된 요소가 제거되면 나머지 요소를 위쪽으로 이동하여 제거 */

/*
* 1. Exercise6의 중복되지 않은 값들의 개수 구하는 메소드 이용 -> 그 크기만큼 배열 생성
* 2. 처음엔 중복되지 않으니까 새로운 배열[0] = number[0]
* 3. 앞에서부터 붙어있는 요소들끼리 같은지 비교 해서 같으면 새 배열에 할당 x */
public class Exercise7 {
    public static int[] removeDuplicates(int[] a){
        int size = Exercise6.numberOfDistinctValues(a);
        int[] array = new int[size];

        array[0] = a[0];
        for (int i = 0, j = 1; i < size; i++) {
            if(a[i] != a[i+1]){
                array[j] = a[i+1];
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] number = {5, 7, 2, 9, 5};
        Arrays.sort(number);

        System.out.println(Arrays.toString(removeDuplicates(number)));
    }
}
