package com.study.hakerlank;

import java.io.*;

public class FizzBuzz {

    /*
    * Given a number n , for each integer i in the range from 1 to n inclusive ,
    *  print one value per line as follows
    *
    * if is a multiple of both 3 and 5 , print FizzBuzz
    * if i is a multiple of 3(but not 5) print Fizz
    * if i is a multiple of 3 or 5 print the value of i.
    *
    * funtion Description
    *
    * Complete the function fizzBuzz in the editor below.
    * fizzBuzz has the following parameters
    * int n : uppper limit of values to test (inclusive)
    * Returns None
    * Prints :
    * The function must print the appropriate response for each value i in the set {1,2,...n} in
    * ascending order , each on a separate line
    *
    * 0 < n 2< 10^5
    *
    * 15 -> n = 15
    *
    * Samples
    * 1 \n 2 Fizz
    * 4 \n Buzz \n Fizz
    * 7 \n 8 Fizz \n Buzz
    * 11 \n Fizz
    * 13 \n 14 FizzBuzz
    * */
    /* 해석
    주어진 숫자 n에 대해, 1부터 n까지의 정수 i 각각에 대해 다음 규칙에 따라 한 줄에 하나씩 출력하세요.
    i가 3과 5의 공배수라면 FizzBuzz를 출력합니다.
    i가 3의 배수이지만 5의 배수가 아니라면 Fizz를 출력합니다.
    i가 3 또는 5의 배수라면 i의 값을 출력합니다.

     */



    //function accepts INTEGER n as parameter

    public static void fizzBuzz(int n) throws IOException{
        //write your code here

        // 3의 공배수라면 Fizz
        // 5의 공배수라면 Buzz
        //i가 3과 5의 공배수라면 FizzBuz를 출력 한다.

        //굉장히 쉽게 문제를 접근 했을때 !!
        /*
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

        */



        //10 의 5승이라면 입출력 병목을 최대한 출여보자

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 3 == 0) {
                result.append("Fizz");
            }
            if (i % 5 == 0) {
                result.append("Buzz");
            }

            if (result.length() > 0) {
                bw.write(result.toString());
            } else {
                bw.write(String.valueOf(i));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();





    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }

}
