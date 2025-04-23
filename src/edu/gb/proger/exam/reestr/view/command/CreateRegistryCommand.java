package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class CreateRegistryCommand extends Command {

    public CreateRegistryCommand(ConsoleUI consoleUI) {
        super("Заполнить реестр животных.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().createRegistry();
    }

}
