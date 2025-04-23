package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Dog extends DomesticAnimal implements Serializable {


    public Dog(Integer id, String name, LocalDate birthday) {

        super(id, name, birthday);

    }

    @Override
    public String getType() { return "Dog"; }

    @Override
    public String addCommand(String command) {

        StringBuilder result = new StringBuilder();

        this.commands.add(command);

        result.append("Dog{")
                .append(showName())
                .append(" обучился команде: ").append(command).append("\n");

        return  result.toString();

    }

}
