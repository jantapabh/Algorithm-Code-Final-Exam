// Java program to find a pair with the given difference 
import java.io.*; 
  
class PairMatch
{ 
    static boolean findPair(int arr[],int n) 
    { 
        int size = arr.length; 
        int num = arr[n];
  
        // Initialize positions of two elements 
        int i = 0, j = 1; 
  
        // Search for a pair 
        for(i = 0 ; i < size ; i++)
        { 
            if (arr[i] == num && num == size) // เช็คเงื่อนไขว่าค่า arr ตำแหน่งไหนเท่ากับค่า num และค่า num ต้องเท่ากับขนาดของอาเรย์
            { 
                System.out.print("Pair Found: "); 
                System.out.print(arr[i]); 
                return true; 
            } 
        } 
  
        System.out.print("No such pair"); 
        return false; 
    } 

    public static void main (String[] args) 
    { 
        int a[] = {3,1,2,4,7,8,9,2}; 
        findPair(a,5); //เรียกฟังก์ชั่น PairMatch
    } 
} 
/*This code is contributed by Devesh Agrawal*/