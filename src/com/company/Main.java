package com.company;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GriffindorStudent harry = new GriffindorStudent("Harry Potter", generate(),generate(),generate(),generate(),generate());
        GriffindorStudent ron = new GriffindorStudent("Ron Weasley", generate(),generate(),generate(),generate(),generate());
        RavenclawStudent luna = new RavenclawStudent("Luna Lovegood", generate(),generate(),generate(),generate(),generate(), generate());
        SlytherinStudent draco = new SlytherinStudent("Draco Malfoy", generate(),generate(),generate(),generate(),generate(), generate(),generate());
        HuffelpuffStudent cedric = new HuffelpuffStudent("Cedric Diggory", generate(),generate(),generate(),generate(),generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        System.out.println(cedric);

        harry.compareHogwarts(draco);
        harry.compareGriffindor(ron);
    }

    private static int generate(){
        return RANDOM.nextInt(100);
    }
}
