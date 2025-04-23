package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class ShowRegistryCommand extends Command {

    public ShowRegistryCommand(ConsoleUI consoleUI) {
        super("Вывести все записи из реестре.", consoleUI);
    }

    @Override
    public void execute() { getConsoleUI().showRegistry(); }

}
