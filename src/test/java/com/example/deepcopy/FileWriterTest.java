package com.example.deepcopy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileWriterTest {

    FileWriter fw;
    File file;
    @Before
    public void init(){
         fw = new FileWriter();
        file = new File("src/main/resources/output.txt");
        //System.out.println("file:"+ file.getAbsolutePath());
    }

    @Test
    public void testWrite() throws IOException {
        List<Person> pl = new ArrayList<>();
        pl.add(new Person("Tinu, 20"));
        pl.add(new Person("James, 21"));
        pl.add(new Person("Karan, 22"));
        fw.write(pl, file);
        File testfile = new File("src/main/resources/output.txt");
        Assert.assertTrue(testfile.exists()); 
    }
}
