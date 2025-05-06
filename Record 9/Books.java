import java.util.Scanner;

class Book {
  String publisher;
  String title;
  int price;
  String author;
  
  void display(){
  
   System.out.println("\nPublisher:"+publisher);
   System.out.println("Title:"+title);
   System.out.println("Price:"+price);
   System.out.println("Author:"+author);
   
  }
 }
 
 class Literature extends Book{
   String genre;
   void display(){
     super.display();
     System.out.println("Genre:"+genre);
     
   
   }
  }
  class Fiction extends Book{
  
   String genre;
   void display(){
     super.display();
     System.out.println("Genre:"+genre);
     }   
   }
  public class Books{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int choice;
    String publisher,title,author,genre;
    int price;
    
    do{
       System.out.print("\n 1.Literature \n 2.fiction \n 3.exit \n Enter your choice:");
       choice = sc.nextInt();
       if(choice==3){
        System.out.print("Exiting..");
        System.exit(0);
        
       }
       System.out.print("Enter publisher:");
       publisher= sc.next();
       System.out.print("Enter Title:");
       title= sc.next();
       System.out.print("Enter price:");
       price= sc.nextInt();
       System.out.print("Enter author:");
       author= sc.next();
       System.out.print("Enter genre:");
       genre= sc.next();
       if(choice==1){
         Literature lit=new Literature();
         lit.publisher=publisher;
         lit.title=title;
         lit.price=price;
         lit.author=author;
         lit.genre=genre; 
         
         System.out.print("\n ***Literature Book Deatails***");
         lit.display();
         
        }else if(choice ==2){
          Fiction fic =new Fiction();
          fic.publisher=publisher;
          fic.title=title;
          fic.price=price;
          fic.author=author;
          fic.genre=genre;
          
          System.out.println("\n***Fiction Book Details***");
          fic.display();
          
          
          } 
        }while(true);
       }
      } 
       
       
       
       
   
  
