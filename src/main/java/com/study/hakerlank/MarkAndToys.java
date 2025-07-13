package com.study.hakerlank;

import java.util.Arrays;

public class MarkAndToys {

    /*
    * Problem:
        Mark has a budget of k dollars to buy toys. He wants to buy as many as possible.
        Given prices of n toys, determine the maximum number he can buy without exceeding his budget.

        Function Description:
        Complete the function maximumToys which receives an integer array prices and integer k.
        Return an integer, the maximum number of toys.

        Input Format:

        First line: integer n (number of toys) and integer k (budget).

        Second line: n space-separated integers, prices of toys.

        Output Format:

        Single integer, maximum number of toys.

        INPUT
        7 50 (장남감의 개수) (비용)
        1 12 5 111 200 1000 10 (장난감들의 가격)
        OUTPUT
        4
        Explanation:
        Mark can buy toys with prices [1, 5, 10, 12] for a total of 28 dollars.

        정해진 비용으로 최대한 많은 장난감을 가질수 있어야 한다.

        *
        * */

    public static int solution(int[] n , int[] k){
        int cost = n[1];
        //최대한 많은 장난감을 사기 위해서는 가장 가격이 낮은 것들부터 담아야 유리하다.
        Arrays.sort(k);

        int getToys = 0;
        for(int i = 0 ; i < k.length; i++){
            cost = cost - k[i];
            if(cost > 0){
                getToys++;
            }else{
                break;
            }
        }

        return getToys;
    }

    public static void main(String[] args) {
        /*
        INPUT
        7 50 (장남감의 개수) (비용)
        1 12 5 111 200 1000 10 (장난감들의 가격)
        OUTPUT
        4
        */

        int result = solution(new int[]{7,50} , new int[]{1,12,5,111,200,1000,10});

        System.out.println("result = " + result + " expect = 4 test result = " + (result == 4));
    }

}
