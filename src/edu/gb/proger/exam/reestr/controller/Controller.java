package edu.gb.proger.exam.reestr.controller;

import edu.gb.proger.exam.reestr.model.service.NurseryService;
import edu.gb.proger.exam.reestr.view.View;

import java.time.LocalDate;

public class Controller {

    private View view;
    private final NurseryService service;

    public Controller(NurseryService model) {
        this.service = model;
    }

    private Boolean checkMonth(String itemMonth) {

        return Integer.parseInt(itemMonth) >= 1 &&
                Integer.parseInt(itemMonth) <= 12;

    }

    private Boolean checkDay(String itemDay) {

        return Integer.parseInt(itemDay) >= 1 &&
                Integer.parseInt(itemDay) <= 31;

    }

    public String addItem(String itemName, String itemType, String itemBirthdate) {

        StringBuilder result = new StringBuilder();
        String[] itemBirthdateSplited = itemBirthdate.split("-");

        if (!checkMonth(itemBirthdateSplited[1])) {
            result.append("Неверно введен номер месяца.").append("\n");
        } else if (!checkDay(itemBirthdateSplited[2])) {
            result.append("Неверно введен номер дня.").append("\n");
        } else {
            result.append(service.addAnimal(itemName, itemType, LocalDate.parse(itemBirthdate)));
        }

        return result.toString();

    }

    public String teachCommand(Integer itemId, String commandName) { return service.teachCommand(itemId, commandName); }

    public String deleteItem(Integer itemId) { return service.deleteAnimal(itemId); }

    public String showItem(Integer itemId) { return service.showAnimal(itemId); }

    public String createRegistry() { return service.createRegistry(); }

    public String showRegistry() {
        return service.showRegistry();
    }

    public String saveRegistry() { return service.saveNursery(); }

    public String restoreRegistry() { return service.restoreNursery(); }

}
