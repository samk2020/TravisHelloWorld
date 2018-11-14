/*
 * Hello World example with use of travis for java.
 */
package travisexjava;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;


public class LinearSearchTravis{ 
    
    public static int linearSearch(int[] arr, int key){    
        System.out.println("Linear search for finding a specific array: ");
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,40,50,60,70,80,90,100};    
        int key = 100;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key)); 
        
        System.out.println("\nIndexes of a second array list below: ");
        int length;
        int[] arr;
        int i;
        arr = new int[5];
        arr[0] = 10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50; 
        for(i = 0; i< arr.length; i++)
            System.out.println(" index: "+ i + " : " + arr[i]);
        }
        
 
}