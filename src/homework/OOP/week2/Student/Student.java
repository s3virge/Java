package homework.oop.week2.student;

import homework.oop.week2.Address;

import java.util.Arrays;

/**
 * Написать основные классы Студент, Предмет, если нужно будет дописывать новые

    Студент
        поля:
        Имя
        Адрес
        Предметы

        методы:
        учиться
        добавить предмет
        удалить предмет из списка последний
        показать всю информацию о предметах
        получить средний бал за все предметы
 */

public class Student {

    private String sName;            //Name
    private Address oAddress;        //Address
    private Subject[] arrSubjects;   //Subject

    public Student(String sName, Address oAddress) {
        this.sName = sName;
        this.oAddress = oAddress;
        this.arrSubjects = null; //no subjects yet
    }

    //study
    public void study(Subject oSubj, int iHours){

        if (arrSubjects != null) {
            //the student can not study the subject
            for (int i = 0; i < arrSubjects.length; i++) {
                if (arrSubjects[i].getName().equals(oSubj.getName())) {
                    //increase the number of hours worked a student
                    oSubj.setWorkingHours(oSubj.getWorkingHours() + iHours);
                    return;
                }
            }
        }

        System.out.printf(">>>  This student does not study the subject %s  <<<\n", oSubj.getName());
    }

    //add subject
    public void addSubject(Subject newSubject){

        //создать новый массив с длиной болшей на 1
        Subject[] newArrOfSubj;

        //скопировать в него все значения из arrSubjects
        if (arrSubjects == null){
            newArrOfSubj = new Subject[1];
        }
        else{
            newArrOfSubj = Arrays.copyOf(arrSubjects, arrSubjects.length + 1);
        }

        //добавить в массив новое значение
        newArrOfSubj[newArrOfSubj.length - 1] = newSubject;

        //arrSubjects ссылается на новый массив
        arrSubjects = newArrOfSubj;

        return;
    }

    //remove the last item from the list
    public void delLastSubject(){

        //создать новый массив
        Subject[] newArrOfSubj = null;

        //скопировать в него все значения из arrSubjects
        if (arrSubjects != null && arrSubjects.length - 1 != 0){
            newArrOfSubj = Arrays.copyOf(arrSubjects, arrSubjects.length - 1);
        }

        //arrSubjects ссылается на новый массив
        arrSubjects = newArrOfSubj;

        return;
    }

    //show all information about subjects
    public void showSubjectsInfo(){

        if (arrSubjects != null){
            //show the studied subjects
            for (int i = 0; i < arrSubjects.length; i++) {
                arrSubjects[i].showInfo();
            }
        }
        else{
            System.out.println("No subjects to be studied");
        }
    }

    //receive an average score for all subjects
    public double averageScore(){

        double dScore = 0.0;
        int iCounter = 0;

        if (arrSubjects != null){
            int assessment = 0;

            for (int i = 0; i < arrSubjects.length; i++) {
                assessment = arrSubjects[i].getAssessment();
                dScore += assessment;

                if (assessment != 0){ //Zero is not considered
                    iCounter++;
                }
            }

            if (iCounter == 0){
                return dScore; //exclude NaN
            }

            dScore /= iCounter;
        }

        return dScore;
    }

    //show student info
    public void showInfo(){

        System.out.printf("student name: %s\n", this.sName);

        this.oAddress.showInfo();
    }

    public Subject[] getSubjects() {
        return arrSubjects;
    }

    public String getName() {
        return this.sName;
    }
}