package com.study.hakerlank;

import java.util.*;

public class UnexpectedDemand {

    /*
    * A widget manufacturer is facing unexpectedly high demand for its new product. They would like to satisfy as many customers as possible. Given a number of widgets available and a list of customer orders, what is the maximum number of orders the manufacturer can fill in full?Complete the function filledOrders.Function Description:filledOrders has the following parameter(s):order: an array of integers representing the number of widgets per order
    k: an integer representing the number of widgets available

    Returns:int: the maximum number of orders that can be filled in full

    Input Format:The first line contains an integer n, the number of orders.
    The next n lines each contain an integer order[i], the number of widgets in the i-th order.
    The last line contains an integer k, the number of widgets available.

    Constraints:1 ≤ n ≤ 10^5
    1 ≤ order[i] ≤ 10^9
    1 ≤ k ≤ 10^9

    Output Format:A single integer representing the maximum number of orders that can be filled in full.

    Example
    * INPUT
    * 3 (주문의 개수)
    * 3 (각 주문의 위젯수)
    * 2 (각 주문의 위젯수)
    * 1 (각 주문의 위젯수)
    * 5 (사용 가능한 위젯수)

    * OUTPUT
    * 2 (충족할수 있는 최대 주문수)

    * INPUT
    * 2 (주문의 개수)
    * 4 (각 주문의 위젯수)
    * 4 (각 주문의 위젯수)
    * 10 (사용 가능한 위젯 수)

    * OUTPUT
    * 2 (충족할수 있는 최대 주문 수)

    *
    * 그리디 알고리즘이라는것을 사용하여 해결 할수 있다고 한다.
    * */

    private static int filledOrders(List<Integer> order, int k) {
        //최고 많은 주문을 해결 하라는 문제지 먼저 들어온 주문을 해결 하라는 문제가 아니다
        Collections.sort(order); //먼저 주문을 오름차순으로 정렬한다. why? 가장 많은 주문의 개수를 해결 하기 위해서는 작은 주문건수부터 처리 해야한다.
        int count = 0;

        for (int i = 0; i < order.size(); i++) {
            //첫 시작부터 요구량이 더 크다면 가능한 주문은 0 이다.
            if(order.get(i) <= k ){
                count++;
                k -= order.get(i); //주문 가능한 개수에서 차감 시킨다.
            }else{
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //몇개의 주문을 받을 것인가
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            order.add(scanner.nextInt());
        }

        int k = scanner.nextInt(); //생산 가능 개수
        System.out.println(filledOrders(order, k));
        scanner.close();
    }



}
