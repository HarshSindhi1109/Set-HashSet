package org.example;

import java.util.HashSet;
import java.util.Set;

public class NewHashSet {
    public void getNewHashSet() {
        Set set = new HashSet();
        for (int i = 50; i > 0; i--) {
            set.add(i);
        }
        System.out.println(set);
    }
}
