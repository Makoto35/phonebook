package ru.netology;

import java.util.Map;
import java.util.HashMap;

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

    public static void main(String[] args) {

    }
}