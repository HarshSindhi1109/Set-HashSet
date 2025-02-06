package org.example;

import java.util.Set;
import java.util.TreeSet;

public class NewTreeSet {
    public void newTreeSet() {
        Set<String> set = new TreeSet<>();

        for (int i = 30; i >= 0; i--) {
            set.add("A"+i);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
