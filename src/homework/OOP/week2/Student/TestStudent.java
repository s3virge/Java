package homework.oop.week2.student;

import homework.oop.week2.Address;

/**
 * Created by Vit on 05.07.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        Subject oBiology         = new Subject("Biology", 56);
        Subject oMathematics     = new Subject("Mathematics", 80);
        Subject oPhysics         = new Subject("Physics", 70);
        Subject oChemistry       = new Subject("Chemistry", 34);
        Subject oPhysicalCulture = new Subject("PhysicalCulture", 40);

        Student student1 = new Student("Ivan",
                new Address("ua", "Megacity", "Megastreet", "142", "66"));

        student1.addSubject(oBiology);
        student1.showInfo();

        student1.addSubject(oMathematics);
        student1.addSubject(oPhysics);

        System.out.println("------------------------------------");
        student1.showInfo();
        student1.showSubjectsInfo();

        System.out.println("------------------------------------");
        System.out.printf("Average score %.2f\n", student1.averageScore());

        System.out.println("------------------------------------");
        student1.delLastSubject();
        student1.showSubjectsInfo();

        System.out.println("------------------------------------");
        student1.delLastSubject();
        student1.showSubjectsInfo();

        System.out.println("------------------------------------");
        student1.delLastSubject();
        student1.showSubjectsInfo();

        System.out.println("------------------------------------");
        student1.study(oPhysicalCulture, 45);

        student1.addSubject(oBiology);
        student1.addSubject(oMathematics);
        student1.addSubject(oPhysics);

        student1.study(oBiology, 2);
        student1.study(oMathematics, 7);
        student1.study(oPhysics, 34);

        System.out.println("------------------------------------");
        student1.showSubjectsInfo();

        System.out.println("--------------------------------------");
        Subject.passExam(student1, oBiology, 5);
        Subject.passExam(student1, oMathematics, 2);
        Subject.passExam(student1, oChemistry, 4);

        System.out.println("------------------------------------");
        System.out.printf("Average score %.2f\n", student1.averageScore());

        System.out.println("------------------------------------");
        student1.showSubjectsInfo();
    }
}
