package edu.gb.proger.exam.reestr.view;

import edu.gb.proger.exam.reestr.controller.Controller;

import java.util.Scanner;

public class ConsoleUI implements View {

    private final Controller controller;
    private final Scanner scanner;
    private final MainMenu mainMenu;
    private boolean work;

    public ConsoleUI(Controller controller) {

        this.controller = controller;
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;

    }

    @Override
    public void start() {

        int menuPoint;
        while (work) {
            System.out.println(mainMenu.menu());
            menuPoint = scanner.nextInt();
            scanner.nextLine();
            mainMenu.execute(menuPoint);
        }

    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    public void addAnimal() {

        System.out.println("Введите имя животного:");
        String animalName = scanner.nextLine();
        System.out.println("Введите вид (Верблюд, Кошка, Собака, Осел, Хомяк, Лошадь) животного:");
        String animalType = scanner.nextLine();
        System.out.println("Введите день рождения животного:");
        //LocalDate animalBirthdate = ;
        String animalBirthdate = scanner.nextLine();
        printResult(controller.addItem(animalName, animalType, animalBirthdate));

    }

    public void teachCommand() {

        System.out.println("Введите id животного:");
        Integer animalId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название команды:");
        String commandName = scanner.nextLine();
        printResult(controller.teachCommand(animalId, commandName));

    }

    public void deleteAnimal() {

        System.out.println("Введите id животного:");
        Integer animalId = scanner.nextInt();
        scanner.nextLine();
        printResult(controller.deleteItem(animalId));

    }

    public void showAnimal() {

        System.out.println("Введите id животного:");
        Integer animalId = scanner.nextInt();
        scanner.nextLine();
        printResult(controller.showItem(animalId));

    }

    public void createRegistry() { printResult(controller.createRegistry()); }

    public void showRegistry() {
        printResult(controller.showRegistry());
    }

    public void saveNursery() { printResult(controller.saveRegistry()); }

    public void restoreNursery() { printResult(controller.restoreRegistry()); }

    public void stop() {
        work = false;
    }

}
