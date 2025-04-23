package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class TeachCommandCommand extends Command {

    public TeachCommandCommand(ConsoleUI consoleUI) {
        super("Обучить животное команде.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().teachCommand();
    }

}
