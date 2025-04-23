package edu.gb.proger.exam.reestr.model.writer;

public interface Writer<T> {
    void saveToFile(T item, String string);
    T restoreFromFile (String string);
}
