package edu.gb.proger.exam.reestr.model.animal;

import edu.gb.proger.exam.reestr.model.nursery.RegistryItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements RegistryItem, Serializable {

    protected Integer id;
    protected String name;
    protected LocalDate birthdate;
    protected List<String> commands;

    public Animal(Integer id, String name, LocalDate birthday) {

        this.id = id;
        this.name = name;
        this.birthdate = birthday;
        this.commands = new ArrayList<>();

    }

    public Integer getId() {
        return id;
    }

    public String getName() { return name; }

    public LocalDate getBirthdate() { return birthdate; }

    public abstract String getType();

    public abstract String addCommand(String command);

    protected String showName() {

        StringBuilder result = new StringBuilder();

        result.append("id=").append(id)
                .append(", name='").append(name).append("'")
                .append(", birthdate=").append(birthdate).append("'");

        return result.toString();

    }

    protected String showNameExtended() {

        StringBuilder result = new StringBuilder();

        result.append("id: ").append(id).append("\n")
                .append("name: ").append(name).append("\n")
                .append("birthdate: ").append(birthdate).append("\n");

        return result.toString();

    }

    protected String showCommands() {

        StringBuilder result = new StringBuilder();

        result.append("commands:").append("\n");
        if (commands.isEmpty()) {
            result.append("none").append("\n");
        } else {
            for (String item : commands) {
                result.append(item).append("\n");
            }
        }

        return result.toString();

    }

    public String info() {

        StringBuilder result = new StringBuilder();

        result.append(getType()).append("{").append("\n")
                .append(showNameExtended())
                .append(showCommands())
                .append('}');

        return  result.toString();

    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append(getType()).append("{")
                .append(showName())
                .append(", commands=");
        if (commands.isEmpty()) {
            result.append("none");
        } else {
            result.append(commands);
        }
        result.append('}');

        return result.toString();

    }

}
