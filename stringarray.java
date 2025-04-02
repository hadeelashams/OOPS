import java.util.Arrays;
import java.util.Scanner;

class stringarray {
     void userdefine(String str[],int length) {
       int i, j;
       String temp;
       
       for(i=0;i<length;i++) {
       
             for(j=i+1;j<length;j++) {
                 
                 if(str[i].compareTo(str[j])>0) {
                 
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                   
                  }  
              }
         }
         
       System.out.println("\nSorted array user defined method:");
       
       for(i=0;i<length;i++) {
            System.out.println(str[i]);
       }      
     }
     
     public static void main(String args[]) {
      
       int i,length,option;
       stringarray userSort=new stringarray();
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number of words in array:");
       length=sc.nextInt();
       String str[]=new String[length];
       System.out.println("Enter the words in array:");
      
      for(i=0;i<length;i++){
        str[i]=sc.next();
      }  
      
       System.out.println("\nEntered Array is:");
       
       for(i=0;i<length;i++){
           System.out.println(str[i]);
        }      
        
      System.out.println("\nOptions:");
      System.out.println("1.Built Method");
      System.out.println("2.User Defined Method");
      System.out.println("3.Exit");
      System.out.print("Choose your option:");
      option=sc.nextInt();
      while(option!=3)
     {
      switch(option)       
      {
       case 1:
       Arrays.sort(str);
       
       System.out.println("\nSorted Array using in built method");
  
    for(i=0;i<length;i++) {
       System.out.println(str[i]);
    }
    break;
    
    case 2:
    userSort.userdefine(str,length);
    break;
    default:
    
    System.out.println("invalid");
    break;
   } 
    System.out.print("\nChoosen your option:");
    option=sc.nextInt();
   }
  }
 }   
     
   
 
              
                 
              
