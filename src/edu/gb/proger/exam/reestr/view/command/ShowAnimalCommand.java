package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class ShowAnimalCommand extends Command {

    public ShowAnimalCommand(ConsoleUI consoleUI) {
        super("Показать данные о животном.", consoleUI);
    }

    @Override
    public void execute() { getConsoleUI().showAnimal(); }

}
