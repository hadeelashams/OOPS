import java.util.Scanner;

class linear{
  public static void main(String args[]){
  int a,i,e;
  boolean found =false; // use a boolean variable for clarify
  Scanner sc=new Scanner(System.in);
  
   System.out.print("Enter the number of elements in array: ");
   a=sc.nextInt();
   
   int[] ar =new int[a];
   
   System.out.println("Enter the elements of the array:");
   for(i=0;i<a;i++){
    ar[i]=sc.nextInt();
   }
   
   // input element to be searched
   System.out.print("Enter the element to be searched: ");
   e = sc.nextInt();
   
   //perform linear search
   
   for(i=0;i<a;i++){
       if(ar[i]==e){
         found=true;
         break;
       }
      }
      
      if(found){
        System.out.println("Element is found");
       }
      else{
         System.out.print("Element is not found");
        }
       sc.close();
      }
     }          
   
     
  
   
