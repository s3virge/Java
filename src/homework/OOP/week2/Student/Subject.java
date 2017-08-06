package homework.oop.week2.student;

/**
 * Написать основные классы Студент, Предмет, если нужно будет дописывать новые
 *
     Предмет содержит поля:
     имя
     количество часов в семестре
     количество проработанных часов студентом
     оценка студента за предмет

     методы:
     сдать экзамен
     показать информацию о предмете
     получить оценку студента за предмет
     */

public class Subject {

    private String sName;           //имя
    private int iHoursPerSemester;  //количество часов в семестре
    private int iWorkingHours;      //количество проработанных часов студентом
    private int iAssessment;        //оценка студента за предмет

    public Subject(String sName, int iHoursPerSemester) {
        this.sName = sName;
        this.iHoursPerSemester = iHoursPerSemester;
        this.iWorkingHours = 0;
        this.iAssessment = 0;     //no evaluation yet
    }

    public int getWorkingHours() {
        return iWorkingHours;
    }

    public String getName() {
        return sName;
    }

    public void setWorkingHours(int iWorkingHours) {
        this.iWorkingHours = iWorkingHours;
    }

    public void setAssessment(int iAssessment) {
        this.iAssessment = iAssessment;
    }

    //сдать экзамен
    public static void passExam(Student oStudent, Subject oSubj, int inAssessment){

        Subject[] aStudentSubjects = oStudent.getSubjects();

        boolean bFound = false;

        for (int i = 0; i < aStudentSubjects.length; i++) {

            if (oSubj.getName().equals(aStudentSubjects[i].getName())) {
                aStudentSubjects[i].setAssessment(inAssessment);

                bFound = true;
            }
        }

        if (!bFound){
            System.out.printf(">>>> student %s does not study the subject %s  <<<<\n",
                    oStudent.getName(), oSubj.getName());
        }

        return;
    }

    //показать информацию о предмете
    public void showInfo(){

        System.out.printf("Name: %s\n" +
                "Hours per semester: %d\n" +
                "The number of working hours of student: %d\n" +
                "student assessment for the subject: %d\n",
                this.sName,
                this.iHoursPerSemester,
                this.iWorkingHours,
                this.iAssessment);
    }

    //получить оценку студента за предмет
    public int getAssessment(){
        return iAssessment;
    }
}
