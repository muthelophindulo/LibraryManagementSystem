package src.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import src.model.Book;

public class bookservice {
   //attributes
   private final String filepath = "data\\book.txt";
   
   //create a constructor for initialising
   public bookservice(){
   
      }

   //serch book by id
   public void search(String id){
      String[] lines;
   
      //create a reader
      Scanner reader;
   
      try {
         File f = new File(filepath);
      
         reader = new Scanner(f);
      
         while(reader.hasNextLine()){
            //add each line to lines
            lines = reader.nextLine().split(",");
         
            //print out the one that has the id you want
            if(lines[0].equals(id)){
               for(String x : lines){
                  System.out.print(x + " ");
                  }
               }
            }
         reader.close();
      } catch (IOException e) {
         System.out.println("error while opening file");
         }
      }


   //add a book
   public void addbook(String title,String author,String publishdate,String isbn){
      //call the book const
      Book b1 = new Book(title,author,publishdate,isbn);
      b1.createbooktxt();
      System.out.println("book added");
      }

   }


