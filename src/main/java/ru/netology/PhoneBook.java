package ru.netology;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {

    private final Map<String, String> nameToNumber = new HashMap<>();
    private final Map<String, String> numberToName = new HashMap<>();
    private final TreeSet<String> sortedNames = new TreeSet<>();

    public int add(String name, String number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
            sortedNames.add(name);
        }
        return 0;    }

        }
