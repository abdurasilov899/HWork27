package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Box> box = new ArrayList<>();
        box.add(new Box(12, "KDM", 899));
        box.add(new Box(24, "KSL", 99821));
        Box.method(box);

    }
}
