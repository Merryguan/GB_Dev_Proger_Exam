package edu.gb.proger.exam.reestr.view;

import edu.gb.proger.exam.reestr.view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {

        commands = new ArrayList<>();
        commands.add(new AddAnimalCommand(consoleUI));
        commands.add(new DeleteAnimalCommand(consoleUI));
        commands.add(new TeachCommandCommand(consoleUI));
        commands.add(new ShowAnimalCommand(consoleUI));
        commands.add(new CreateRegistryCommand(consoleUI));
        commands.add(new ShowRegistryCommand(consoleUI));
        commands.add(new SaveNurseryCommand(consoleUI));
        commands.add(new RestoreNurseryCommand(consoleUI));
        commands.add(new StopCommand(consoleUI));

    }

    public String menu() {

        StringBuilder result = new StringBuilder();

        result.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            result.append(i + 1)
                    .append(". ");
            result.append(commands.get(i).getDescription())
                    .append("\n");
        }
        result.append("\n").append("Выберите пункт меню: ");

        return result.toString();

    }

    public void execute(int choice) {

        Command command = commands.get(choice - 1);
        command.execute();

    }

    public int size() { return commands.size(); }

}
