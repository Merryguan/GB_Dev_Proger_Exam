package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Cat extends DomesticAnimal implements Serializable {

    public Cat(Integer id, String name, LocalDate birthday) {

        super(id, name, birthday);

    }

    @Override
    public String getType() { return "Cat"; }

    @Override
    public String addCommand(String command) {

        StringBuilder result = new StringBuilder();

        this.commands.add(command);

        result.append("Cat{")
                .append(showName())
                .append(" обучился команде: ").append(command).append("\n");

        return  result.toString();

    }

}
