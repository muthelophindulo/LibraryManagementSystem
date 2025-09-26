package src.model;


import java.io.*;
import java.util.Scanner;

public class Book{
    //private int book_id;
    private String title;
    private String author;
    private String publishdate;
    private String isbn;

    public Book(String title, String author,String publishdate, String isbn){
        this.title = title;
        this.author = author;
        this.publishdate = publishdate;
        this.isbn = isbn;
    }

    //get methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublishDAte(){
        return publishdate;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setauthor(String author){
        this.author = author;
    }

    public void setpublishDate(String publishdate){
        this.publishdate = publishdate;
    }

    public void setisbn(String isbn){
        this.isbn = isbn;
    }

    //create a file using all the values
    public void createbooktxt(){
        try {
            //create or open a file
            FileWriter f = new FileWriter("data\\book.txt",true);

            //create a buffered writer 
            BufferedWriter bf = new BufferedWriter(f);

            //write the details
            try (PrintWriter writer = new PrintWriter(bf)) {
                //write the details
                writer.write(getlastbookid() + ",");
                writer.write(title + ",");
                writer.write(author + ",");
                writer.write(publishdate + ",");
                writer.write(isbn + ",");
                writer.write("\n");
                //close the writer
            }
            
        } catch (IOException e) {
            System.out.println("error while opening file");
        }
    }

    //try and get the last book id
    private int getlastbookid(){
        Scanner reader;
        int line = 0;

        try{
            File f = new File("data\\book.txt");
            reader = new Scanner(f);

            while(reader.hasNextLine()){
                reader.nextLine();
                line++;
            }
            reader.close();
        }catch(IOException e){
            System.out.print("error while opening file");
        }

        return (line+1);
    }
}