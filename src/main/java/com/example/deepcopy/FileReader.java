package com.example.deepcopy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileReader {

    public List<Person> read (File file) throws IOException{
        List pl = new ArrayList<Person>();
        java.io.FileReader reader = new java.io.FileReader(file);
        BufferedReader bfReader = new BufferedReader(reader);
        String str = bfReader.readLine();
        
        while(str != null && str.length()> 0){
            StringToPersonCoverter stpc = new StringToPersonCoverter();
            pl.add( stpc.convert(str) );
            str = bfReader.readLine();
        }
        return pl;
    }
}
