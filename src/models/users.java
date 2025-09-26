package src.model;


import java.io.*;
import java.util.Scanner;

public class users {
    private final String name;
    private final String email;
    private final String tel;

    public users(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

   

    //create a member using txt file
    public void createmember(){
        try {
            //open a file using filewriter
            FileWriter f = new FileWriter("data\\members.txt",true);

            //create a buffered writer
            BufferedWriter bf = new BufferedWriter(f);

            //write contents to the file
            try ( //create a printwriter to write on the file
                    PrintWriter writter = new PrintWriter(bf)) {
                //write contents to the file
                writter.write(lastmemberid() + ",");
                writter.write(name + ",");
                writter.write(email + ",");
                writter.write(tel + ",");
                writter.write("\n");
                //close the printwriter
            }
            
        } catch (IOException e) {
            System.out.println("error while opening file");
        }
    }

    //get the id of the last member
    public int lastmemberid(){
        int line = 0;

        Scanner reader;

        try {
            //open the file
            File f = new File("data\\members.txt");

            //create a reader
            reader = new Scanner(f);

            //count the number of lines
            while(reader.hasNextLine()){
                reader.nextLine();
                line++;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("error while opening file");
        }


        return (line+1);
    }
}
