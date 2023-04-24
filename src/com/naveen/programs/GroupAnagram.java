package com.naveen.programs;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] arr = {"dog", "cat", "god", "tac", "act", "man"};
        groupAnagram(arr);
        //test(arr);
    }

    private static void groupAnagram(String[] arr) {
        Map<String, ArrayList<String>> mp = new LinkedHashMap<>();
        ArrayList<String> lst = new ArrayList<>();
        String key = "";
        for (int i=0; i< arr.length; i++){
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            for (char c: ch)
                key = key+c;
            if(!mp.containsKey(key)){
                lst.add(arr[i]);
                mp.put(key,lst);
            }
            else {
                //lst.add[];
            }


        key="";
        }
        System.out.println(mp);

       /* Set<Map.Entry<String, String>> strings = mp.entrySet();
        Iterator<Map.Entry<String, String>> iterator = strings.iterator();
        Map.Entry<String, String> next = iterator.next();
        System.out.println(next.getValue());

        */


    }

    public static void test(String[] arr){
        Map<String, String[]> mp = new LinkedHashMap<>();
        String s = "dog";
        String key = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (char c: chars)
            key = key+c;
        System.out.println("Key is -"+key);

    }
}
