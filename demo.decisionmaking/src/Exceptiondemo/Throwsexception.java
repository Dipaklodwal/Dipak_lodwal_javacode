package Exceptiondemo;

import java.io.*;
import java.util.*;

class Throwsexception1 {

    void Testcase(int num) throws IOException, ArithmeticException {
        if (num == 1) {
            throw new IOException("IOException occured");
        } else {
            throw new ArithmeticException("Arithmatic Exception Occured");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scr = new Scanner(System.in);
            System.out.println("Please Enter the volue for check");
            int num = scr.nextInt();
            Throwsexception1 p = new Throwsexception1();
            p.Testcase(num);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
