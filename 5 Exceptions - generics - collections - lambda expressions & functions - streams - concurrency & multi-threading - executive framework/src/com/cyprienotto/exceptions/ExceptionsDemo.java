package com.cyprienotto.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Type of exceptions
// Checked (we should anticipate, javac checked these error on the compiler time. #Exception )
// =/= Unchecked ( are not checked on the compile time, because its programming error &
// could be check on the runtime with tests. #RuntimeException )
// =/= Error ( error external from our  application. )
public class ExceptionsDemo {
    public static void show(String value){
        try (
                var reader = new FileReader("text.txt");
                var writter = new FileWriter("....");
             ) {
            var fileValue = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //} catch (IOException e) {
        //  e.printStackTrace();
        //}
        // finally {
        //    reader.close();
        // }
    }
}
