package com.company;

public class SlytherinStudent extends HogwartsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int powerLast;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int powerLast) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.powerLast = powerLast;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getPowerLast() {
        return powerLast;
    }

    public void setPowerLast(int powerLast) {
        this.powerLast = powerLast;
    }

    public int ability() {
        return cunning + determination + ambition + ingenuity + powerLast;
    }

    public void compareSlytherin (SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), slytherinStudent.getName());
        }else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n", slytherinStudent.getName(), getName());
        }else {
            System.out.printf("Student %s same as student %s%n", slytherinStudent.getName(), getName());

        }
    }

    @Override
    public String toString() {
        return String.format("%s; cunning: %d; determination: %d; ambition: %d; ingenuity: %d, lust for power: %d",
                super.toString(),
                cunning, determination, ambition, ingenuity, powerLast);
    }
}
