package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String studentName) {
        String mark;
        int a = random.nextInt(5) + 2;
        if (a == 2) {
            mark = "неудовлетворительно";
        } else if (a == 3) {
            mark = "удовлетворительно";
        } else if (a == 4) {
            mark = "хорошо";
        } else {
            mark = "отлично";
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + studentName + " по предмету " + subject + " на оценку " + mark);
    }

}
