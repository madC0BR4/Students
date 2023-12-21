package org.example;

public class Student {
    private String name;
    private int year;
    private int mark;
    public Student(String name, int year, int mark) {
        this.name = name;
        this.year = year;
        this.mark = mark;
    }
    public String getName() {return name;}
    public int getYear() {return year;}
    public int getMark() {return mark;}
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public void writeExam() {
        System.out.println("Студент: " + name);
        System.out.println("Пишет экзамен");
    }
    public void displayInfo() {
        System.out.println("Студент: " + name);
        System.out.println("Курс: " + year);
        System.out.println("Оценка за экзамен: " + mark);
    }
}
