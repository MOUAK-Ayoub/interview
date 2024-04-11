package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        List<String> listStr= new ArrayList<>(Collections.singletonList(s));
        wordDict=   new ArrayList<>(wordDict);
        while (!listStr.isEmpty() && !wordDict.isEmpty()) {
           // listStr= Collections.singletonList(s);

            for (String word : wordDict) {
                for(String str : listStr){
                  String[] newStr= str.split(word);
                  listStr.addAll(Arrays.asList(newStr));
                }

            }
            wordDict.remove(0);

        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
}