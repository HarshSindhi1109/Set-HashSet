package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
            Set<String> set = new HashSet<>();
            set.add("Harsh");
            set.add("Souvik");
            set.add("Gautam");
            set.add("Sanskar");
            set.add("Vivek");

            System.out.println(set);

            for (String s : set) {
                System.out.println(s);
            }
            System.out.println(set.contains("Harsh"));

            NewHashSet newHashSet = new NewHashSet();
            newHashSet.getNewHashSet();

            NewLinkedHashSet newSet = new NewLinkedHashSet();
            newSet.newLinkedHashSet();

            NewTreeSet newTreeSet = new NewTreeSet();
            newTreeSet.newTreeSet();
    }
}