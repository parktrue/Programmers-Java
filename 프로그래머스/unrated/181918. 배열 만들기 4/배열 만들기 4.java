import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else if(stk.peek() >= arr[i]) {
                stk.pop();
            }
        }
        int[] result = new int[stk.size()];
        for(int j = result.length - 1; j >= 0; j--) {
            result[j] = stk.pop();
        }
        return result;
    }
}
