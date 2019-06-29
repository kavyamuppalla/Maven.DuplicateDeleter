package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);

    }
    public String[] removeDuplicates(int maxNumberOfDuplications){
        String[] arrayCount = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count = count + 1;
                }
            }
            if(count < maxNumberOfDuplications) {
                arrayCount[i] = array[i];
            }
        }
        return removeNullValues(arrayCount);
    }
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] arrayCount = new String[array.length];

        for(int i = 0; i < array.length; i ++) {
            int count = 0;
            for(int j = 0; j < array.length; j ++) {
                if(array[i] == array[j]) {
                    count = count + 1;
                }

            }
            if(count != exactNumberOfDuplications) {

                arrayCount[i] = array[i];
            }
        }
        System.out.println(Arrays.asList(arrayCount));
        return removeNullValues(arrayCount);
    }
    protected String[] removeNullValues(String[] originalArray) {
        int count = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if(originalArray[i] == null) {
                count = count + 1;
            }
        }
        System.out.println(count);

        String[] nullNoArray = new String[originalArray.length - count];
        int index = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if(originalArray[i] != null) {
                nullNoArray[index] = originalArray[i];
                index ++;
            }
        }
        //System.out.println(Arrays.asList(nullNoArray));
        return nullNoArray;
    }
}
