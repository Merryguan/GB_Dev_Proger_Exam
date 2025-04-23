package edu.gb.proger.exam.reestr.view.command;

import edu.gb.proger.exam.reestr.view.ConsoleUI;

public class SaveNurseryCommand extends Command {

    public SaveNurseryCommand(ConsoleUI consoleUI) {
        super("Сохранить реестр в файл.", consoleUI);
    }

    @Override
    public void execute() { getConsoleUI().saveNursery(); }

}
