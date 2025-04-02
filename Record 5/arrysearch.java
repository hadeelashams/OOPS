import java.util.Scanner;
import java.util.Arrays;

  class arrysearch{
  public static void main(String args[]){
  
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements:");
     int size=sc.nextInt();
     int[] numbers=new int[size];
     
     System.out.println("enter the elements of array:");
     for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
        }
     Arrays.sort(numbers);
     System.out.println("sorted array:" + Arrays.toString(numbers));
     System.out.println("enter the element to search :");
     int target=sc.nextInt();
     int result=Arrays.binarySearch(numbers,target);
     
     if(result >=0){
     
         System.out.println("element found at location:"+result);
      }
     else{
       System.out.println("element not found");
      }
    }
  }
