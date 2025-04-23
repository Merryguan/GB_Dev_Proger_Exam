package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class AddAnimalCommand extends Command {

    public AddAnimalCommand(ConsoleUI consoleUI) { super("Добавить животное в реестр.", consoleUI); }

    @Override
    public void execute() { getConsoleUI().addAnimal(); }

}
