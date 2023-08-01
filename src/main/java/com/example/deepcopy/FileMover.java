package com.example.deepcopy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileMover {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader();
        File filein = new File("src/main/resources/input.txt");
        List<Person> lp = reader.read(filein);
        List <Person> lpout = new Sorter().sort(lp);

        FileWriter fw = new FileWriter();
        File fileout = new File("src/main/resources/output.txt");
        fw.write(lpout, fileout);
    }
    
}
