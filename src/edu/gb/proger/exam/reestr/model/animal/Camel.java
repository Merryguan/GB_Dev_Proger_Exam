package edu.gb.proger.exam.reestr.model.animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Camel extends PackAnimal implements Serializable  {

    public Camel(Integer id, String name, LocalDate birthday) {

        super(id, name, birthday);

    }

    @Override
    public String getType() { return "Camel"; }

    @Override
    public String addCommand(String command) {

        StringBuilder result = new StringBuilder();

        this.commands.add(command);

        result.append("Camel{")
                .append(showName())
                .append(" обучился команде: ").append(command).append("\n");

        return  result.toString();

    }

}
