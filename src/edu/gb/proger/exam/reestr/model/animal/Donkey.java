package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Donkey extends PackAnimal implements Serializable {

    public Donkey(Integer id, String name, LocalDate birthday) {

        super(id, name, birthday);

    }

    @Override
    public String getType() { return "Donkey"; }

    @Override
    public String addCommand(String command) {

        StringBuilder result = new StringBuilder();

        this.commands.add(command);

        result.append("Donkey{")
                .append(showName())
                .append(" обучился команде: ").append(command).append("\n");

        return  result.toString();

    }

}
