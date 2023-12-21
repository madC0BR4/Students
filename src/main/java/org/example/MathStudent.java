package org.example;
public class MathStudent extends Student{
    public MathStudent(String name, int year, int mark) {
        super(name, year, mark);
    }
    @Override
    public void writeExam() {
        System.out.println("Студент факультета ФН: " + getName());
        System.out.println("Пишет экзамен");
    }
}
