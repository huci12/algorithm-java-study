package com.study.hakerlank;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StringAnagram {

    /*
    * An anagram of a string is another string with the same
    * character in th same frequencyt , in any order . For example
    * 'abc','bca','acb','bac','cba','cba' are all anagrams of the string
    * 'abc' Given two arrays of strings , for every string in one list,
    *  determine how mana anagrams of itt re in the other list.
    *  write a function that receives dictionary and query , two string array.
    *  It should return an array of integer where each element i contains the number of
    *  anagrams of query[i] that exist in dictionary.
    *
    *  dictionary = ['hack', 'a', 'rank', 'khac'  'ackh', 'kran', 'rankhacker' 'a', 'ab', 'ba', 'stairs', 'raits']
    *  query = ["a" , "nark" , "bs" , "hack" , "stair"]
    *  query[0] = 'a' has 2 anagrams in dictionary 'a' and 'a'
    *  query[1] = 'nark' has 2 anagrams in dictionary: 'rank' nad 'kran'
    *  query[2] = 'bs' has no anagrams in dictionary. has 0 anagrams in dictionary
    *  query[3] = 'hack' has 3 anagrams in dictionary 'hack', 'khac' and 'ackh'
    *  query[4] = 'stair' has 1 anagram in dictionary 'raits'
    *
    *  2,2,0,3,1
    *
    * 넣은 쿼리의 알파벳과 동일한 딕셔너리의 단어가 있는지 (순서와 상관없이)
    * */


    /*
     * complete the stringAnagram function
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *   1. STRING_ARRAY dictionary
     *   2. STRING_ARRAY qauery
     *
     * */

    public static List<Integer> stringAnagram(List<String> dictionary , List<String> query){
        //write your code here
        //일반적인 접근으로는 이와 같은 반복문 중첩만으로 해당 문제를 풀수 없다.
        /*
        List<Integer> countArr = new ArrayList<>();
        for (int i = 0; i < query.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < dictionary.size(); j++) {
                if(query.get(i).length() == dictionary.get(j).length()){
                    char[] qArr = query.get(i).toCharArray();
                    char[] dArr = dictionary.get(j).toCharArray();

                    boolean isAllTrue = true;

                    for (int k = 0; k < qArr.length; k++) {
                        if(isAllTrue){
                            boolean isTrue = false;
                            for (int l = 0; l < dArr.length; l++) {
                                if(qArr[k] == dArr[l]) {
                                    isTrue = true;
                                }
                            }

                            if(!isTrue){
                                isAllTrue = false;
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    if(isAllTrue){
                        cnt++;
                    }

                }
            }
            countArr.add(cnt);
        }

        return countArr;*/

        // 사전의 단어를 정렬된 버전으로 미리 만들어둠 (속도 최적화)
        /*
        List<Integer> result = new ArrayList<>();
        List<String> sortedDict = new ArrayList<>();
        for (String word : dictionary) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            sortedDict.add(new String(chars));
        }

        for (String q : query) {
            char[] qArr = q.toCharArray();
            Arrays.sort(qArr);
            String sortedQ = new String(qArr);

            int count = 0;
            for (String dictWord : sortedDict) {
                if (sortedQ.equals(dictWord)) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
        */

        //그래도 리스트의 크기가 너무 크다면 Map으로 접근 하는게 유리 할수 도 있다.
        /*
        List<Integer> result = new ArrayList<>();
        // 미리 정렬된 단어 카운트를 Map에 저장
        Map<String, Integer> dictMap = new HashMap<>();
        for (String word : dictionary) {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            dictMap.put(sorted, dictMap.getOrDefault(sorted, 0) + 1);
        }

        for (String q : query) {
            char[] qArr = q.toLowerCase().toCharArray();
            Arrays.sort(qArr);
            String sortedQ = new String(qArr);

            result.add(dictMap.getOrDefault(sortedQ, 0));
        }

        return result;
        */

        //그런데 또 잘 생각해보면? 단어의 앞뒤가 어떠하든 byte의 크기는 동일하다!
        List<Integer> result = new ArrayList<>();

        // 사전: 각 단어의 알파벳 카운트 배열을 Key로 해서 개수 세기
        Map<String, Integer> dictMap = new HashMap<>();

        for (String word : dictionary) {
            String freqKey = getFreqKey(word);
            dictMap.put(freqKey, dictMap.getOrDefault(freqKey, 0) + 1); //동일한 아나그램 패턴이 word에 몇개 있는지 카운트
        }

        for (String q : query) {
            String freqKey = getFreqKey(q);
            result.add(dictMap.getOrDefault(freqKey, 0)); //키를 변환한 이후 dictMap에서 동일한 키값의 카운트를 가져와서 추가한다.
        }

        return result;



    }

    // 소문자로 변환 => 알파벳 카운트 => String Key로 변환
    private static String getFreqKey(String s) {
        //input : abb
        // a => freq[0]++ => freq = [1,0,0]
        // b => freq[1]++ => freq = [1,1,0]
        // b => freq[1]++ => freq = [1,2,0]

        int[] freq = new int[26]; // a~z 가 들어갈수 있는 배열의 공간
        for (char c : s.toLowerCase().toCharArray()) {
            freq[c - 'a']++; //알파벳을 숫자로 바꾸기 'a' => 97 , 'b' => 98 / 'a' - 'a' = 0 , 'b' - 'a' = 1
        }
        // 배열은 equals로 비교 못하니까 String으로 바꿔서 Key로 사용
        return Arrays.toString(freq);
    }






    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0 , dictionaryCount).mapToObj(i -> {
           try{
               return bufferedReader.readLine();
           }catch (IOException ex){
               throw new RuntimeException(ex);
           }
        }).collect(toList());

        List<Integer> result = StringAnagram.stringAnagram(dictionary , dictionary);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
        */

        List<String> dictionary = Arrays.asList(
                "hack", "a", "rank", "khac", "ackh",
                "kran", "rankhacker", "a", "ab", "ba", "stairs", "raits"
        );
        List<String> query = Arrays.asList("a", "nark", "bs", "hack", "stair");

        System.out.println(stringAnagram(dictionary, query)); // [2, 2, 0, 3, 1]
    }

}
