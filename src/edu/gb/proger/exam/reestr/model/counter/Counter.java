package edu.gb.proger.exam.reestr.model.counter;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private static Integer counter = 0;
    private Boolean condition = false;

    public Counter() { open(); }

    public Integer getCounter() { return counter; }

    public void setCounter(int counter) throws IOException {

        if (!condition) {
            throw new IOException();
        } else {
            Counter.counter = counter;
        }

    }

    public void add() throws IOException {

        if (!condition) {
            throw new IOException();
        } else {
            counter = counter + 1;
        }

    }

    public void sub() throws IOException {

        if (!condition) {
            throw new IOException();
        } else {
            counter = counter - 1;
        }

    }

    public void open() { condition = true; }

    @Override
    public void close() { condition = false; }

}
