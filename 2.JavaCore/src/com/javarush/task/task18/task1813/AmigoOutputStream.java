package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream copyFOS;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream localFOS) throws FileNotFoundException {
        super(String.valueOf(localFOS));
        this.copyFOS = localFOS;
    }

    public void write(int b) throws IOException {
        copyFOS.write(b);
    }

    public void close() throws IOException {
        copyFOS.flush();
        copyFOS.write("JavaRush © All rights reserved.".getBytes());
        copyFOS.close();
    }
    public void flush() throws IOException {
        copyFOS.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        copyFOS.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        copyFOS.write(b, off, len);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
