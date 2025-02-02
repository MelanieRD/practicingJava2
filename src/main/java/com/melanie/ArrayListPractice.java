package com.melanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPractice {
    public static void toExecute(){
        rotateArrayList();
    }

    public static void rotateArrayList(){
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        Collections.rotate(letters, 2);
        System.out.println(letters);
    }

    public static void pairNumbersPractice(){
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> pairNums = new ArrayList<>();
        int numOfElements = 20;

        for(int i = 1; i<20; i++){
            nums.add(i);
        }

        for(Integer num : nums ){
            if(num%2==0){
                pairNums.add(num);
            }
        }
        System.out.println(nums);
        System.out.println(pairNums);

    }

    public static void arrayListPractice(){

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> unOrderedNums = new ArrayList<>(List.of(3,5,5,1,57,3,1,2,4,6,8,9,0,7,6));

        names.add("Melanie");
        names.add("Delanie");
        names.add("Felanie");
        names.add("Zelanie");
        names.add("Yelanie");


        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
       // names.stream().forEach(name -> System.out.println(name));

      //  nums.remove(4);
      //  System.out.println(nums);
        // System.out.println(names.contains("SDASD"));
       // System.out.println( names.indexOf("Felanie"));


        System.out.println( unOrderedNums.stream().sorted().collect(Collectors.toList()));
        System.out.println(unOrderedNums);
        Collections.sort(unOrderedNums);
        Collections.reverse(unOrderedNums);
        System.out.println(unOrderedNums);
        ArrayList<String> combinedArrayList = new ArrayList<>(names);
        combinedArrayList.addAll(letters);

        System.out.println(combinedArrayList);


    }


}
