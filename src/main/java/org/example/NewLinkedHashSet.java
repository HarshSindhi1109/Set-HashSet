package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class NewLinkedHashSet {
    public void newLinkedHashSet() {
        Set set = new LinkedHashSet();
        for (int i = 0; i < 10; i++) {
            set.add("A"+i);
        }
        for(Object o : set) {
            System.out.println(o);
        }
    }
}
