package ru.mirea.gib04.lab8;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("C:/Users/Vagif/IdeaProjects/Aliev/src/ru/mirea/gib04/lab8/note.txt",false);
            String text = "Мама мыла раму, раму мыла мама";
            file.write(text);
            file.write("Какой-то текст");
            file.append('\n');
            file.append('E');
            file.flush();


        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try {
            FileReader reader = new FileReader("C:/Users/Vagif/IdeaProjects/Aliev/src/ru/mirea/gib04/lab8/note.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.println((char)c);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        


    }
}
