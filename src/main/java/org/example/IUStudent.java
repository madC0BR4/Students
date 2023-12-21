package org.example;

public class IUStudent extends Student{
    public IUStudent(String name, int year, int mark) {
        super(name, year, mark);
    }
    @Override
    public void writeExam() {
        System.out.println("Студент факультета ИУ: " + getName());
        System.out.println("Пишет экзамен");
    }

}
