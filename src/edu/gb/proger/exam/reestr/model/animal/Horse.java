package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Horse extends PackAnimal implements Serializable {

    public Horse(Integer id, String name, LocalDate birthday) {

        super(id, name, birthday);

    }

    @Override
    public String getType() { return "Horse"; }

    @Override
    public String addCommand(String command) {

        StringBuilder result = new StringBuilder();

        this.commands.add(command);

        result.append("Horse{")
                .append(showName())
                .append(" обучился команде: ").append(command).append("\n");

        return  result.toString();

    }

}
