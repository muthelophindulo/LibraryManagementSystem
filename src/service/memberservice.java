package src.service;
import java.io.*;
import java.util.Scanner;

import src.model.*;

public class memberservice {
    private final String filepath = "data\\members.txt";

    public memberservice() {
    }
    

    //add a new member
    public void addmember(String name,String email,String tel){
        users us1 = new users(name,email,tel);
        us1.createmember();

    }

    //search a member by id
    public void search(String id){
        Scanner reader;
        String[] content;

        try {
            //open the file
            File f = new File(filepath);

            //create a reader to read the file
            reader = new Scanner(f);

            //search for the user
            while(reader.hasNextLine()){
                content = reader.nextLine().split(",");
                
                if(content[0].equals(id)){
                    for(String x : content ){
                        System.out.print(x + " ");
                    }System.out.println();
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("no user was found");
        }
    }
}
