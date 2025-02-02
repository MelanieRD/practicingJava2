package com.melanie;

import java.util.*;

public class WordsRepetition {
    private String sentence;
    private String[] words;
    private HashMap<String, Integer> wordsFrequency = new HashMap<>();

    WordsRepetition(String sentence){
       this.sentence = sentence;
       this.words = sentence.split(" ");
    }


    public HashMap<String, Integer> wordsRepeated(){
        for(String word: words){
            wordsFrequency.compute(word, (key, value)->  (value == null) ?  1:  value+1 );
        }

        System.out.println(wordsFrequency);

     return wordsFrequency;
    }

}
