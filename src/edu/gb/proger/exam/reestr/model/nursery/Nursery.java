package edu.gb.proger.exam.reestr.model.nursery;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Nursery<T extends RegistryItem> implements Serializable {

    List<T> registry;

    public Nursery() { registry = new ArrayList<>(); }

    public List<T> getRegistry() { return registry; }

    public Integer getRegistryLength() { return registry.size(); }

    public void addNote(T item) { registry.add(item); }

    private Integer searchById(Integer id) {

        for (int i = 0; i < registry.size(); i++) {
            if (registry.get(i).getId().equals(id)) {
                return i;
            }
        }

        return -1;

    }

    public String addCommand(Integer noteId, String commandName) {

        StringBuilder result = new StringBuilder();
        Integer foundId = searchById(noteId);

        if (foundId.equals(-1)) {
            result.append("Запись таким ID не найдена в реестре. Введите другой ID.").append("\n");
        } else {
            registry.get(foundId).addCommand(commandName);
            result.append("Животное ")
                    .append(registry.get(foundId).toString())
                    .append(" выучило команду: ").append(commandName).append("\n");
        }

        return result.toString();

    }

    public String deleteNote(Integer noteId) {

        StringBuilder result = new StringBuilder();
        Integer foundId = searchById(noteId);

        if (foundId.equals(-1)) {
            result.append("Запись таким ID не найдена в реестре. Введите другой ID.").append("\n");
        } else {
            result.append("Животное ").append(registry.get(foundId)).append(" было удалено из реестра.").append("\n");
            registry.remove((int)foundId);
        }

        return result.toString();

    }

    public String showNote(Integer noteId) {

        StringBuilder result = new StringBuilder();
        Integer foundId = searchById(noteId);

        if (foundId.equals(-1)) {
            result.append("Запись таким ID не найдена в реестре. Введите другой ID.").append("\n");
        } else {
            result.append("Информация о животном:").append("\n")
                    .append(registry.get(foundId).info()).append("\n");
        }

        return result.toString();

    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        if (registry.isEmpty()) {
            return "";
        }

        result.append("Nursery{").append("\n");
        for (T item : registry) {
            result.append(item).append("\n");
        }
        result.append('}');

        return result.toString();

    }
}
