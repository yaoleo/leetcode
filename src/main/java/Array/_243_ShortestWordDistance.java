package Array;

import java.util.ArrayList;

public class _243_ShortestWordDistance {
/**
 * @program: leetcode
 * @description: 243, 244, 245
 * @author: J.Y.Zhang
 * @create: 2018-12-12
 **/
    public static int solution1(String[] words, String word1, String word2 ){
        int dis = Integer.MAX_VALUE;

        ArrayList<Integer> array1 = new ArrayList(), array2 = new ArrayList();
        for(int i = words.length-1; i >= 0; i--){
            if(words[i].equals(word1)){
                array1.add(i);
            }
            if(words[i].equals(word2)){
                array2.add(i);
            }
        }
        for(int loc: array1){
            for(int loc2: array2 ){
                if(Math.abs(loc-loc2)<dis){
                    dis = Math.abs((loc-loc2));
                }
            }
        }

        return dis;
    }

    public static int solution2(String[] words, String word1, String word2){
        int dis = Integer.MAX_VALUE;
        int p = -1 ,q = -1;

        for(int i = words.length-1; i >= 0; i--){
            if(words[i].equals(word1)){
                p = i;
            }
            if(words[i].equals(word2)){
                q = i;
            }

            dis = Math.min(dis,Math.abs(p-q));
        }

        return dis;
    }

    public static void main(String[] args){
        String[] wordsList = {"practice", "makes", "perfect", "coding", "makes"};
        int result = solution2(wordsList, "coding", "makes");
        System.out.println(result);
    }
}
