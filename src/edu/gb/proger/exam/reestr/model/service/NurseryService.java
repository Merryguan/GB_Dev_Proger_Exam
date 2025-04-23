package edu.gb.proger.exam.reestr.model.service;

import edu.gb.proger.exam.reestr.model.animal.*;
import edu.gb.proger.exam.reestr.model.counter.Counter;
import edu.gb.proger.exam.reestr.model.nursery.Nursery;
import edu.gb.proger.exam.reestr.model.writer.FileHandler;

import java.io.IOException;
import java.time.LocalDate;

public class NurseryService {

    private Nursery<Animal> nursery;
    private Integer id;
    FileHandler<Nursery<Animal>> fileHandler;

    public NurseryService() {

        this.nursery = new Nursery<>();
        this.fileHandler = new FileHandler<>();
        this.id = 0;

    }

    public String addAnimal(String animalName, String animalType, LocalDate animalBirthday) {

        StringBuilder result = new StringBuilder();
        Animal animal;

        try (Counter counter = new Counter()) {
            switch (animalType) {
                case ("Верблюд"):
                    id = id + 1;
                    animal = new Camel(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                case ("Кошка"):
                    id = id + 1;
                    animal = new Cat(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                case ("Собака"):
                    id = id + 1;
                    animal = new Dog(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                case ("Осел"):
                    id = id + 1;
                    animal = new Donkey(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                case ("Хомяк"):
                    id = id + 1;
                    animal = new Hamster(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                case ("Лошадь"):
                    id = id + 1;
                    animal = new Horse(id, animalName, animalBirthday);
                    nursery.addNote(animal);
                    counter.add();
                    result.append("Животное ").append(animal).append(" добавлено в реестр. ")
                            .append("Всего животных в реестре: ").append(counter.getCounter()).append("\n");
                    break;
                default:
                    result.append("Введен неверный тип животного. Повторите ввод данных.").append("\n");
            }
        } catch (IOException e) {
            System.out.println("Неверное состояния счетчика...");
            e.printStackTrace();
        }

        return result.toString();

    }

    public String teachCommand(Integer animalId, String commandName) { return nursery.addCommand(animalId, commandName); }

    public String showAnimal(Integer animalId) {

        return nursery.showNote(animalId); }

    public String deleteAnimal(Integer animalId) {

        StringBuilder result = new StringBuilder();

        try (Counter counter = new Counter()) {
            counter.sub();
            result.append(nursery.deleteNote(animalId));
        } catch (IOException e) {
            System.out.println("Неверное состояния счетчика...");
            e.printStackTrace();
        }

        return result.toString();

    }

    public String createRegistry() {

        StringBuilder result = new StringBuilder();
        Integer animalId = 0;

        animalId = animalId + 1;
        result.append(addAnimal("Fido", "Собака", LocalDate.parse("2020-01-01")));
        result.append(teachCommand(animalId, "Sit"));
        result.append(teachCommand(animalId, "Stay"));
        result.append(teachCommand(animalId, "Fetch"));

        animalId = animalId + 1;
        result.append(addAnimal("Buddy", "Собака", LocalDate.parse("2018-12-10")));
        result.append(teachCommand(animalId, "Sit"));
        result.append(teachCommand(animalId, "Paw"));
        result.append(teachCommand(animalId, "Bark"));

        animalId = animalId + 1;
        result.append(addAnimal("Bella", "Собака", LocalDate.parse("2019-11-11")));
        result.append(teachCommand(animalId, "Sit"));
        result.append(teachCommand(animalId, "Stay"));
        result.append(teachCommand(animalId, "Roll"));

        animalId = animalId + 1;
        result.append(addAnimal("Whiskers", "Кошка", LocalDate.parse("2019-05-15")));
        result.append(teachCommand(animalId, "Sit"));
        result.append(teachCommand(animalId, "Pounce"));

        animalId = animalId + 1;
        result.append(addAnimal("Smudge", "Кошка", LocalDate.parse("2020-02-20")));
        result.append(teachCommand(animalId, "Sit"));
        result.append(teachCommand(animalId, "Pounce"));
        result.append(teachCommand(animalId, "Scratch"));

        animalId = animalId + 1;
        result.append(addAnimal("Oliver", "Кошка", LocalDate.parse("2020-06-30")));
        result.append(teachCommand(animalId, "Meow"));
        result.append(teachCommand(animalId, "Scratch"));
        result.append(teachCommand(animalId, "Jump"));

        animalId = animalId + 1;
        result.append(addAnimal("Hammy", "Хомяк", LocalDate.parse("2021-03-10")));
        result.append(teachCommand(animalId, "Roll"));
        result.append(teachCommand(animalId, "Hide"));

        animalId = animalId + 1;
        result.append(addAnimal("Peanut", "Хомяк", LocalDate.parse("2021-08-01")));
        result.append(teachCommand(animalId, "Roll"));
        result.append(teachCommand(animalId, "Spin"));

        animalId = animalId + 1;
        result.append(addAnimal("Thunder", "Лошадь", LocalDate.parse("2015-07-21")));
        result.append(teachCommand(animalId, "Trot"));
        result.append(teachCommand(animalId, "Canter"));
        result.append(teachCommand(animalId, "Gallop"));

        animalId = animalId + 1;
        result.append(addAnimal("Storm", "Лошадь", LocalDate.parse("2014-05-05")));
        result.append(teachCommand(animalId, "Trot"));
        result.append(teachCommand(animalId, "Canter"));

        animalId = animalId + 1;
        result.append(addAnimal("Blaze", "Лошадь", LocalDate.parse("2016-02-29")));
        result.append(teachCommand(animalId, "Trot"));
        result.append(teachCommand(animalId, "Jump"));
        result.append(teachCommand(animalId, "Gallop"));

        animalId = animalId + 1;
        result.append(addAnimal("Sandy", "Верблюд", LocalDate.parse("2016-11-03")));
        result.append(teachCommand(animalId, "Walk"));
        result.append(teachCommand(animalId, "Carry Load"));

        animalId = animalId + 1;
        result.append(addAnimal("Dune", "Верблюд", LocalDate.parse("2018-12-12")));
        result.append(teachCommand(animalId, "Walk"));
        result.append(teachCommand(animalId, "Sit"));

        animalId = animalId + 1;
        result.append(addAnimal("Sahara", "Верблюд", LocalDate.parse("2015-08-14")));
        result.append(teachCommand(animalId, "Walk"));
        result.append(teachCommand(animalId, "Run"));

        animalId = animalId + 1;
        result.append(addAnimal("Eeyore", "Осел", LocalDate.parse("2017-09-18")));
        result.append(teachCommand(animalId, "Walk"));
        result.append(teachCommand(animalId, "Carry Load"));
        result.append(teachCommand(animalId, "Bray"));

        animalId = animalId + 1;
        result.append(addAnimal("Burro", "Осел", LocalDate.parse("2019-01-23")));
        result.append(teachCommand(animalId, "Walk"));
        result.append(teachCommand(animalId, "Bray"));
        result.append(teachCommand(animalId, "Kick"));

        result.append("\n")
                .append("Реестр животных питомника создан. ").append("\n");

        return  result.toString();

    }

    public String showRegistry() {

        StringBuilder result = new StringBuilder();

        if (nursery.toString().isEmpty()) {
            result.append("Реестр животных в питомнике пуст.").append("\n");
        } else {
            result.append("Реестр животных в питомнике:").append("\n").append(nursery.toString()).append("\n");
        }

        return result.toString();

    }

    public String saveNursery() {

        StringBuilder result = new StringBuilder();

        fileHandler.saveToFile(nursery,"Nursery.txt");

        result.append("Реестр животных сохранен в файл: ").append("Nursery.txt").append("\n");

        return result.toString();
    }

    public String restoreNursery() {

        StringBuilder result = new StringBuilder();

        try (Counter counter = new Counter()) {
            nursery = fileHandler.restoreFromFile("Nursery.txt");

            id = nursery.getRegistryLength();
            counter.setCounter(nursery.getRegistryLength());

            result.append("Реестр животных загружен из файла: ").append("Nursery.txt")
                    .append(". Всего записей: ").append(counter.getCounter()).append("\n");

        } catch (IOException e) {
            System.out.println("Неверное состояния счетчика...");
            e.printStackTrace();
        }

        return result.toString();
    }

}
