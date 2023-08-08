package com.example.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileWriter;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {
        File fin = new File("input.txt");
        File fout = new File("out.txt");

        FileReader fread = new FileReader(fin);
        BufferedReader bfReader = new BufferedReader(fread);

        FileWriter fWriter = new FileWriter(fout);
        String line = null;
        while( (line = bfReader.readLine()) != null){
            fWriter.write(line+"\n");
            //fWriter.flush();
        }
        fWriter.close();
        bfReader.close();

    }
    
}
