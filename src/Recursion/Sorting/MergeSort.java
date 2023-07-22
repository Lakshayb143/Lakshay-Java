package Recursion.Sorting;


import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] array = {8,3,4,12,5,6};
        mergeSortInPlace(array,0,array.length );
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(mergeSort(array)));

    }

    static int[] mergeSort(int[] array)
    {
        if(array.length == 1){
            return array;
        }
        int mid = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort((Arrays.copyOfRange(array,mid,array.length)));

        return merge(left,right);
    }

    static int[] merge(int[] first , int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
          if(first[i] > second[j]){
              merged[k] = second[j];
              j++;
          }else{
              merged[k] = first[i];
              i++;
          }
          k++;
        }

        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;

    }

    static void mergeSortInPlace(int[] arr , int s , int e)
    {
        if( e - s == 1){
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr,s, mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr , s , mid , e);

    }

    static void mergeInPlace(int[] arr, int s, int m , int e)
    {
        int[] merged = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e){
            if(arr[i] > arr[j]){
                merged[k] = arr[j];
                j++;
            }else{
                merged[k] = arr[i];
                i++;
            }
            k++;

        }

        while(i < m){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            merged[k] = arr[j];
            j++;
            k++;
        }
        for(int a = 0;a < merged.length ; a++){
            arr[s+a] = merged[a];
        }

    }


//    My Answer -:
//    static int[] merge(int[] arr1 , int[] arr2)
//    {
//        int[] merged = new int[arr1.length + arr2.length];
//        int i = 0;
//        int m = 0;
//        int n = 0;
//        if(m == arr1.length){
//            for(int j = 0 ; j <= arr2.length - 1 ; j++){
//                merged[i] = arr2[n];
//                i++;
//                n++;
//            }
//
//            return merged;
//        }
//        else if( n == arr2.length){
//            for(int j = 0 ; j <= arr1.length - 1 ; j++){
//                merged[i] = arr1[m];
//                i++;
//                m++;
//            }
//            return merged;
//
//        }else{
//            if(arr1[m] < arr2[n]){
//                merged[i] = arr1[m];
//                m++;
//            }
//            if(arr1[m] > arr2[n]){
//                merged[i] = arr2[n];
//                n++;
//            }
//            i++;
//        }
//        return merged;
//
//
//    }
}
