package com.example.deepcopy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {

    FileReader fileReader;
    File file;

    @Before
    public void init(){
        fileReader = new FileReader();
        file = new File("src/main/resources/input.txt");
        System.out.println("file:"+ file.getAbsolutePath());
    }

    @Test
    public void canReadFromFile() throws IOException {
       List<Person> lp = fileReader.read(file);
       System.out.println("lp:"+ lp.get(0).age);
       Assert.assertTrue(lp.size()>0);

    }
}
