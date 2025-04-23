package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class PackAnimal extends Animal implements Serializable {

    public PackAnimal(Integer id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }

}
