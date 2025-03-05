import java.util.Scanner;

class Cpu{
 int price;
    
    class Processor{
     String core_no,manufacture;
     
     void display(){
      System.out.print("Processor manufacture:"+manufacture +"\n");
      System.out.print("Processor no of core:"+core_no +"\n");
      }
    }
 
 static class Ram{
  int memory;
  String manufacture;
  
  void display(){
       System.out.print("RAM memory:"+memory);
       System.out.print(" Processor manufacture:"+manufacture +"\n");
    }  
  }
  
   void display(){
       System.out.print("Price:" +price );
       
   }
  }
  
  public class Cpuinfo{
     public static void main(String args[]){
     
     Cpu ncpu=new Cpu();
     Cpu.Processor processor = ncpu.new Processor();
     Cpu.Ram ram =new Cpu.Ram();
     
     Scanner sc =new Scanner(System.in);
     
     System.out.print("Enter the processor Manufacture:");
     processor.manufacture=sc.next();
     
     
     System.out.print("Enter the no of cores of processor:");
     processor.core_no=sc.next();
     
     
     System.out.print("Enter the Ram memory size");
     ram.memory=sc.nextInt();
     
     
     System.out.print("Enter the RAM manufacture:");
     ncpu.price=sc.nextInt();
     
     
     System.out.print("\nInformation of processor and RAM");
     processor.display();
     ram.display();
     ncpu.display();
     }
  }     
  
  
