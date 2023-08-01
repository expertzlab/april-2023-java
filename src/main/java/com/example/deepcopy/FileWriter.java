package com.example.deepcopy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileWriter {

    public void write(List<Person> sortedPersons, File opFile) 
    throws IOException{
        java.io.FileWriter fw = new java.io.FileWriter(opFile);
        System.out.println("starting:loop:size:"+ sortedPersons.size());
        
        for(int i =0; i < sortedPersons.size(); i++){
            System.out.println("writing:"+sortedPersons.get(i).toString());
            fw.write(sortedPersons.get(i).toString()+"\n");
        }

        fw.flush();
    }
}
