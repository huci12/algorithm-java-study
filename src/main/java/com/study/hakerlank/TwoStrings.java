package com.study.hakerlank;

import java.util.*;

public class TwoStrings {

    /*
   Problem:
    Given two strings, determine if they share a common substring.
    A substring may be as small as one character.

    Function Description:
    Complete the function twoStrings which receives two strings s1 and s2.
    Return "YES" if they share a common substring, otherwise "NO".

    Input Format:

    First line: string s1

    Second line: string s2

    Output Format:

    "YES" or "NO"

    INPUT

    hello
    world

    OUTPUT
    YES

    주어진 두 문자가 같은 알파벳을 경우 하는지에 대해 묻는 문제


    * */

    public static String solution(String s1 , String s2){
        //그냥 쉽게 보면 문자를 정렬후 비교 하여 맞는게 있으면 YES 리턴
        //하지만 이전에 StringAnagram문제를 보아 알수 있듯이 굳이? 반복문으로 비교를 해야 하나 싶다.
        //이번에는 갯수를 세는게 아니기 때문에 아스키 코드까지 갈 필요가 있나 싶다.

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Set<Character> dictSet = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            dictSet.add(s1.charAt(i));
        }

        System.out.println(dictSet);

        for (int i = 0; i < s2.length(); i++) {
           if(dictSet.contains(s2.charAt(i))){
               return "YES";
           }
        }

        return "NO";
    }


    //셋을 사용하지 않고 해당 아스키 코드로 변경 하여 배열을 이용하는 방법도 있다.
    public static String solution2(String s1, String s2) {
        boolean[] exist = new boolean[26];
        for (char c : s1.toLowerCase().toCharArray()) {
            exist[c - 'a'] = true;
        }

        for (char c : s2.toLowerCase().toCharArray()) {
            if (exist[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
    public static void main(String[] args) {
        System.out.println(solution("abc","def"));
        System.out.println(solution("hello","world"));
    }
}
