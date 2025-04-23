package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class DomesticAnimal extends Animal implements Serializable {

    public DomesticAnimal(Integer id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }

}
