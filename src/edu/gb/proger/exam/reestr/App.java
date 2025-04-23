package edu.gb.proger.exam.reestr;

import edu.gb.proger.exam.reestr.controller.Controller;
import edu.gb.proger.exam.reestr.model.service.NurseryService;
import edu.gb.proger.exam.reestr.view.ConsoleUI;
import edu.gb.proger.exam.reestr.view.View;

public class App {

    private View view;
    private Controller controller;
    private final NurseryService model;

    public App() {

        model = new NurseryService();
        controller = new Controller(model);
        view = new ConsoleUI(controller);

    }

    public View getView() {
        return view;
    }

}
