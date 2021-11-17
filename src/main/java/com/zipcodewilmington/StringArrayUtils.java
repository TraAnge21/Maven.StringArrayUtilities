package com.zipcodewilmington;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array [array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return  array [array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length ; i++) {
            if ( array[i] == value )
                return true ;

        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        StringBuilder result = new StringBuilder();
        for (int j = array.length - 1; j >= 0; j--) {
            result.append(array[j]).append(" ");
        }
        return result.toString().split(" ");
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        int size = array.length;
        for (int j = 0; j < size / 2; j++) {
            if(array[j].equals(array[size -1-j])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) { return false;}
////        char [] value = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
////        boolean[] count = new boolean[26];
////        for (int i = 0 ; i < 26 ; i++) {
////            for (int j = 0; j < array.length; j++) {
////                if (value[i] == ch[j])
////                    return true;
////            }
////        }
////        return null;
//
//
//
//
//    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        List<String> arr = new LinkedList<String>();
        for(int i=0; i< array.length;i++){
            if(array[i]!=valueToRemove){
                arr.add(array[i]);
            }
        }
        String [] finalArray = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            finalArray[i]= arr.get(i);

        }
        return finalArray;

    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        List<String> arr = new LinkedList<String>();
        arr.add(array[0]);
        for(int i=1; i< array.length;i++){
            if(array[i]!=array[i-1]){
                arr.add(array[i]);
            }
        }
        String [] finalArray = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            finalArray[i]= arr.get(i);

        }
        return finalArray;

    }




    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {


return null;
}
}




