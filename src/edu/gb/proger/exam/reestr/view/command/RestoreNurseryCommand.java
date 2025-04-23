package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class RestoreNurseryCommand extends Command {

    public RestoreNurseryCommand(ConsoleUI consoleUI) {
        super("Загрузить реестр из файла.", consoleUI);
    }

    @Override
    public void execute() { getConsoleUI().restoreNursery(); }

}
