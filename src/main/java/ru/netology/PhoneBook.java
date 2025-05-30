package ru.netology;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PhoneBook {
    protected final Map<String, String> contacts = new HashMap<>();

    public int add(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        return contacts.size();

    }

    public String findByNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    public String printAllNames() {
        if (contacts.isEmpty()) {
            return "";  // Обрабатываем пустую книгу
        }
        return String.join(", ", new TreeSet<>(contacts.keySet()));
    }

    public static void main(String[] args) {

    }
}