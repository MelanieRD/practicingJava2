package com.melanie;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CollectionPractice.collectionPractice();
        ArrayListPractice.toExecute();



        /*
        //Practicing arrays
        String[] letters = {"Y", "A", "C","Z","B","F", "D"};
        int[] nums ={1,230,5,3231,54,767,32,767,63423};
        int[] nums2 = {1,3,5,1};
        String[] names = {"Melanie", "Delanie","Aurelion Sol", "Velanie", "Fulana", "Rapumzel"};
        names[1] = "Alpacino";

        Arrays.sort(names);
        // Sum elements in array using streams
        System.out.println(Arrays.stream(nums2).sum());
        System.out.println(Arrays.stream(nums2).average().isPresent() ? Arrays.stream(nums2).average().getAsDouble() : " ");
        System.out.println(Arrays.stream(nums2).reduce((a,b)->a-b));











        // Sum element in array using loops
        int totalSum = 0;
        for(int i: nums2){
            totalSum += i;
        }
        System.out.println(totalSum);

       // Summ elements using reduce
         int sum = Arrays.stream(nums2).reduce(10, (a,b)->a+b);
        System.out.println(sum);

        int index = Arrays.binarySearch(names, "Fulana");
        System.out.println("Index: "+ index +" name: "+names[index]);

        // Sort in a desc and asc order
        Arrays.sort(letters, Collections.reverseOrder());
       System.out.println(Arrays.toString(letters));

        // revert array
        Arrays.stream(names).collect(Collections.reverseOrder());

         */



        // looping array Elements
        /*
        //Using just a loop
        for(String letter: letters){
            System.out.println(letter);
        }
        //Using Stream
        Arrays.stream(letters).forEach(letter -> System.out.println(letter));

        // A better way using streams
        Arrays.stream(letters).forEach(System.out::println);
         */

        // When we are using ::, we are referencing the method. Its like writing x-> System.out.println(x)
        // We can't wraite just Syste,out.println() because forEach waits for a function, and System.out.println returns void.


      //  WordsRepetition frequency = new WordsRepetition("hola hola melanie como como estas dime que tal ok ok ok tal hey");
      //  frequency.wordsRepeated();

        /*ContactsAdministrator contacts = new ContactsAdministrator();
        contacts.addContact("Melanie", 3123123);
        contacts.addContact("Fulano", 3123123);
        contacts.addContact("Melanie", 0);

        System.out.println(contacts.getContacts());

        contacts.editContact("Melanie", 23);
        System.out.println(contacts.getContacts());

        contacts.editContact("Melanies", 10);
        System.out.println(contacts.searchContact("Melaniec"));
        System.out.println(contacts.searchContact("Melanie"));*/


    }


}