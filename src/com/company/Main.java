package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("Birinchi set: " + set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Ekinchi set: " + set1);
        symmetricDifference(set, set1);

    }

    public static Set<Integer> symmetricDifference(Set<Integer> set, Set<Integer> set1) {
        Set<Integer> symmetricDiff = new HashSet<>(set);
        symmetricDiff.removeAll(set1);
        set1.removeAll(set);
        symmetricDiff.addAll(set1);
        System.out.println("Eki settin symmetriyalyk aiyrmasy: " + symmetricDiff);
        return symmetricDiff;
    }
}
