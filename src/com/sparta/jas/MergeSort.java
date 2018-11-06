package com.sparta.jas;

import java.util.List;

public class MergeSort {

    public int[] mergeSort(int[] input){
        int inputHalf = input.length/2;
        int[] mergedArray;

        Split performSplit = new Split();

        int[][] splitArray = performSplit.splitter(input,inputHalf);
        int[] splitArrayLeft = splitArray[0];
        int[] splitArrayRight = splitArray[1];

        if(splitArrayLeft.length != 1){
            splitArrayLeft = mergeSort(splitArrayLeft);
        }
        if(splitArrayRight.length != 1){
            splitArrayRight = mergeSort(splitArrayRight);
        }

        Merge performMerge = new Merge(splitArrayLeft, splitArrayRight);
        mergedArray = performMerge.merge();

        return mergedArray;
    }


}
