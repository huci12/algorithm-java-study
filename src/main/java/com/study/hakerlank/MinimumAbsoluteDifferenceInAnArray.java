package com.study.hakerlank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifferenceInAnArray {

    /*
    * Problem:
    Given an array of integers, find the minimum absolute difference between any two elements.

    Function Description:
    Complete the function minimumAbsoluteDifference which receives an integer array arr.
    Return an integer, the minimum absolute difference between any two elements.

    Input Format:

    The first line contains a single integer n — the number of elements.

    The second line contains n space-separated integers.

    Output Format:

    Return a single integer, the minimum absolute difference.

    INPUT

    3
    3 -7 0

    OUTPUT
    3

    The pair (3, 0) has absolute difference |3 - 0| = 3, which is the smallest
    *
    문제:
    정수 배열이 주어졌을 때, 두 원소의 절대값 차이 중 최소값을 구하시오.

    입력 형식:

    첫 줄: 배열 길이 n

    둘째 줄: n개의 정수

    출력 형식:

    두 원소의 절대값 차이 중 최소값
    *
    해석
    *
    세개의 숫자가 들어왔을대 절대값에 의한 차이 (3  --7) => 10 , (3 - 0) => 3, ( -7 - 0) => 7
    최소 차이 3 이다.
    *
    * */

    public static int solution(int length, int[] args) {
        //가장 작은수의 절대값 차이를 구하는게 중요하다.

        //오름차순으로 정렬 이후 가장 min이 적은 녀석을 찾아낸다.

        int min = Integer.MAX_VALUE; //정보처리 기사에서 자주 봤던 수법으로 어떤 최소값을 구해서 교체할때는 가장 큰수를 기준으로 잡는다.
        
        // 방법 1: Arrays.stream()을 사용한 변환 (Java 8+)
        List<Integer> sortableList = Arrays.stream(args)
                .boxed()  // int를 Integer로 박싱
                .collect(Collectors.toList());
        
        // 방법 2: 전통적인 for문 사용 (주석 처리)
        // List<Integer> sortableList = new ArrayList<>();
        // for (int num : args) {
        //     sortableList.add(num);
        // }
        
        Collections.sort(sortableList);
        
        for (int i = 0; i < sortableList.size() - 1; i++) {
            if (Math.abs(sortableList.get(i) - sortableList.get(i + 1)) < min) {
                min = Math.abs(sortableList.get(i) - sortableList.get(i + 1));
            }
        }
        return min;
    }

    // 방법 3: 배열을 직접 정렬하는 더 효율적인 방법
    public static int solutionOptimized(int length, int[] args) {
        int min = Integer.MAX_VALUE;
        
        // 배열을 직접 정렬
        Arrays.sort(args);
        
        // 인접한 요소들의 차이를 비교
        for (int i = 0; i < args.length - 1; i++) {
            int diff = Math.abs(args[i] - args[i + 1]);
            if (diff < min) {
                min = diff;
            }
        }
        
        return min;
    }

    public static void main(String[] args) {

        // 10
        //-59 -36 -13 1 -53 -92 -2 -96 -54 75
        //expect 1 because -54 - -53 = 1
        int result1 = solution(10, new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
        System.out.println("result1 = " + result1);
        //5
        //1 -3 71 68 17
        //expect 3 because 71 - 68 = 3
        int result2 = solution(5, new int[]{1, -3, 71, 68, 17});
        System.out.println("result2 = " + result2);

        // 배열을 리스트로 변환 하지 않고 테스트
        int result3 = solutionOptimized(10, new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
        System.out.println("result3 = " + result3);
        int result4 = solutionOptimized(5, new int[]{1, -3, 71, 68, 17});
        System.out.println("result4 = " + result4);
    }
}
