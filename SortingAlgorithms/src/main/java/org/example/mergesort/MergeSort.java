package org.example.mergesort;

public class MergeSort {
    public void mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;

        if (inputLength < 2) {
            return;
        }

        int midIdx = inputLength / 2;
        int[] left = new int[midIdx];
        int[] right = new int[inputLength - midIdx];

        // Fill the left sub array
        for (int i = 0; i < midIdx; i++){
            left[i] = inputArr[i];
        }

        // Fill the right sub array
        for (int i = midIdx; i < inputLength; i++) {
            right[i - midIdx] = inputArr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(inputArr, left, right);
    }

    public void merge(int[] inputArr, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                inputArr[k] = left[i];
                i++;
            }
            else {
                inputArr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            inputArr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArr[k] = right[j];
            j++;
            k++;
        }
    }
}
