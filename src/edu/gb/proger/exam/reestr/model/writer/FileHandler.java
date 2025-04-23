package edu.gb.proger.exam.reestr.model.writer;

import java.io.*;

public class FileHandler<T> implements Writer<T> {

    public void saveToFile(T item, String string) {

        FileOutputStream output = null;
        ObjectOutputStream objectOutputStream;
        try {
            output = new FileOutputStream(string);
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        try {
            objectOutputStream = new ObjectOutputStream(output);
            objectOutputStream.writeObject(item);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public T restoreFromFile (String string) {

        FileInputStream input = null;
        ObjectInputStream objectInputStream;
        T result = null;
        try {
            input = new FileInputStream(string);
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        try {
            objectInputStream = new ObjectInputStream(input);
            result = (T) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

}
