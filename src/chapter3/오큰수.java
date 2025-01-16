package chapter3;

import java.io.*;
import java.util.Stack;

public class 오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] A = new int[n];
        int[] ans = new int[n];
        String[] str = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);

        for (int i = 1; i < n; i++) {
            // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i]; // 정답 배열에 오큰수를 현재 수열로 저장
            }
            myStack.push(i);
        }

        while (!myStack.empty()) {
            // 반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
            ans[myStack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }

}
