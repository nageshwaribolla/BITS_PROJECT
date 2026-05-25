package day2.Arrays;


import java.util.Arrays;

public class BinarySearch {
    public static boolean solution(int[] arr,int key){
        //sorting array TC:o(nlogn) sc:o(1)
        Arrays.sort(arr);
        //finding the mid comparing with the search key
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid =start+(end-start)/2;
            if(key< arr[mid]){
                end=mid;
            }else if(key>arr[mid]){
                start=mid+1;

            }else{
                return true;
            }
            
        } 
        return false;

    }
    public static void main(String[] args) {
        int[] arr={-1,0,2,4,8,10};

        if(solution(arr,0)){
            System.out.println("Element is present");
        }else{
             System.out.println("Element is not present");
        }
    }
    
}
