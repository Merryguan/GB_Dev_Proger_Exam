package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class DeleteAnimalCommand extends Command {

    public DeleteAnimalCommand(ConsoleUI consoleUI) {
        super("Удалить животное из реестра.", consoleUI);
    }

    @Override
    public void execute() { getConsoleUI().deleteAnimal(); }

}
