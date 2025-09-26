package src.service;

import java.io.*;
import java.util.Scanner;
import src.model.*;

public class transactionservice {
    private final String filepath = "data\\transaction.txt";
    private String member_id;
    private String book_id;
    private String borrow_date;
    private String return_date;

    public transactionservice(){

    }

    //search for a transaction 
    public String search(String id){
        String[] content;
        Scanner reader;


        try {
            //open the file
            File f = new File(filepath);

            reader = new Scanner(f);

            while(reader.hasNextLine()){
                content = reader.nextLine().split(",");

                if(content[0].equals(id)){
                    this.member_id = content[1];
                    this.book_id = content[2];
                    this.borrow_date = content[3];
                    this.return_date = content[4];
                }
                
            }reader.close();
            
            
        } catch (IOException e) {
            System.out.println("transaction was not found");
        }

        return toString();
    }

    //create a new transaction
    public void createnewtrans(String member_id,String book_id,String borrow_date,String return_date){
        transacton tr1 = new transacton(member_id,book_id,borrow_date,return_date);
        tr1.createtransaction();

    }

    //to string
    @Override
    public String toString(){
        return ("\nmember id: " + member_id + "\n" + "book_id: " + book_id + "\n" + "borrow date: " + borrow_date + "\n" + "return date: " + return_date);
    }
}
