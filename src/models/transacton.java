package src.model;

import java.io.*;
import java.util.Scanner;

public class transacton {
    private final String member_id;
    private  final String book_id;
    private  final String borrowdate;
    private  final String returndate;

    public transacton(String member_id, String book_id, String borrowdate, String returndate) {
        this.member_id = member_id;
        this.book_id = book_id;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
    }

    //create a new transaction
    public void createtransaction(){

        try{
            //open the transaction file
            FileWriter f = new FileWriter("data\\transaction.txt",true);

            //create a buffered 
            BufferedWriter bf = new BufferedWriter(f);

            //write the contents
            try ( //create a writter
                    PrintWriter writer = new PrintWriter(bf)) {
                //write the contents
                writer.write(getlastTransid() + ",");
                writer.write(member_id + ",");
                writer.write(book_id+ ",");
                writer.write(borrowdate + ",");
                writer.write(returndate+ ",");
                writer.write("\n");
                //close the writer
            }
        }catch(IOException e){
            System.out.println("error while opening file");
        }
    }

    //get the last line
    private int getlastTransid(){
        Scanner reader;
        int line = 0;

        try{
            File f = new File("data\\transaction.txt");
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
