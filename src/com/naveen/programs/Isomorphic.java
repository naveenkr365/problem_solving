package com.naveen.programs;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {


        String s = "test";
        String t = "NotN";

        System.out.println(checkIsomorphic(s, t));

}

    private static boolean checkIsomorphic(String s, String t) {

        boolean flag = true;

        Map<Character, Character> mp = new HashMap<>();

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        for(int i=0; i<ch1.length; i++){
            if(!mp.containsKey(ch1[i]) && (!mp.containsValue(ch2[i]))){
                mp.put(ch1[i],ch2[i]);
            }
            else if(mp.containsKey(ch1[i]) && (mp.get(ch1[i])==ch2[i])){
                continue;
            }
            else
            {
                flag = false;
                break;
            }
        }
        return flag;

    }

}
