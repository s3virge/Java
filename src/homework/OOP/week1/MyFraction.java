package homework.oop.week1;

import java.util.Scanner;

/**
 3. Написать класс дробь
 - сложение дробей
 - вычитание
 - умножение
 - деление
 - приведение к строке
 - вывод
 - метод для сравнения с другой дробью
 */

public class MyFraction {

    private int iChislitel;
    private int iZnamenatel;

    private int iOtherChislitel;
    private int iOtherZnamanatel;

    public MyFraction() {
        this.iChislitel = 1;
        this.iZnamenatel = 1;
    }

    public MyFraction(int chislitel, int znamenatel) {
        this.iChislitel = chislitel;
        this.iZnamenatel = znamenatel;
    }

    public int getChislitel() {
        return iChislitel;
    }

    public int getZnamenatel() {
        return iZnamenatel;
    }

    public void setChislitel(int iChislitel) {
        this.iChislitel = iChislitel;
    }

    public void setZnamenatel(int iZnamenatel) {
        this.iZnamenatel = iZnamenatel;
    }

    public void setFraction(int iChislitel, int iZnamenatel) {
        this.iChislitel = iChislitel;
        this.iZnamenatel = iZnamenatel;
    }

    public void enterFraction(){
        System.out.println("Enter iChislitel: ");
        Scanner in = new Scanner(System.in);
        this.iChislitel = in.nextInt();

        System.out.println("Enter iZnamenatel: ");
        this.iZnamenatel = in.nextInt();
    }

    public String getRead(){
        //System.out.printf("%d/%d", this.iChislitel, this.iZnamenatel);
        String sFraction = String.format("%d/%d", this.iChislitel, this.iZnamenatel);
        return sFraction;
    }

    //addition
    public MyFraction add(final MyFraction oMyFract){
        /*Чтобы сложить две обыкновенные дроби, следует:
        привести дроби к наименьшему общему знаменателю;
        сложить числители дробей, а знаменатель оставить без изменений;
        сократить полученную дробь;
        Если получилась неправильная дробь преобразовать неправильную дробь в смешанную.
       */

        iOtherChislitel = oMyFract.iChislitel;
        iOtherZnamanatel = oMyFract.iZnamenatel;

        this.iZnamenatel = getLowestCommonDenominator();

        //сложить числители дробей, а знаменатель оставить без изменений;
        this.iChislitel += this.iOtherChislitel;

        //reduce the resulting fraction;
        reduceFraction();

        return new MyFraction(this.iChislitel, this.iZnamenatel);
    }

    //subtraction
    public MyFraction sub(final MyFraction oOtherFraction) {

        iOtherChislitel = oOtherFraction.iChislitel;
        iOtherZnamanatel = oOtherFraction.iZnamenatel;

        //Чтобы вычесть из одной обыкновенной дроби другую, следует:
        //    привести дроби к наименьшему общему знаменателю;
        this.iZnamenatel = getLowestCommonDenominator();

        //    из числителя первой дроби вычесть числитель второй дроби, а знаменатель оставить без изменений;
        this.iChislitel -= this.iOtherChislitel;

        //reduce the resulting fraction;
        reduceFraction();

        return new MyFraction(this.iChislitel, this.iZnamenatel);
    }

    //lowest common denominator
    private int getLowestCommonDenominator(){
        int iLCD = 1;
        int iEnd = 1000;
        int iMnojitel1 = 1; //во сколько раз нужно увеличить первую дробь для приведения к общему знаменателю
        int iMnojitel2 = 1; //во сколько раз нужно увеличить вторую дробь для приведения к общему знаменателю

        //привести дроби к наименьшему общему знаменателю;
        for (int i = 1; i <= iEnd; i++) {
            for (int j = 1; j <= iEnd; j++) {

                if(this.iZnamenatel * i == this.iOtherZnamanatel * j) {
                    iLCD = this.iZnamenatel * i;

                    //вычисляем во сколько раз нужно увеличить дроби
                    //для приведения к общему знаменателю
                    iMnojitel1 = iLCD / this.iZnamenatel;
                    iMnojitel2 = iLCD / this.iOtherZnamanatel;

                    //приводим к общему знаменателю
                    this.iChislitel *= iMnojitel1;
                    this.iZnamenatel *= iMnojitel1;

                    this.iOtherChislitel *= iMnojitel2;
                    this.iOtherZnamanatel *= iMnojitel2;

                    break;
                }
            }

            if(iLCD != 1){
                break;
            }
        }

        return iLCD;
    }

    private void reduceFraction(){
        for (int i = 2; i < 1000; i++) {
            if(this.iChislitel % i == 0 && this.iZnamenatel % i == 0){
                this.iChislitel /= i;
                this.iZnamenatel /= i;
                break;
            }
        }
    }

    public MyFraction mult(final MyFraction oFraction){

        this.iOtherChislitel = oFraction.iChislitel;
        this.iOtherZnamanatel = oFraction.iZnamenatel;

        this.iChislitel *= this.iOtherChislitel;
        this.iZnamenatel *= this.iOtherZnamanatel;

        reduceFraction();

        return new MyFraction(this.iChislitel, this.iZnamenatel);
    }

    public MyFraction div(final MyFraction otherFract){
        //Чтобы разделить одну обыкновенную дробь на другую, отличную от нуля, нужно:
        //числитель первой дроби умножить на знаменатель второй дроби и записать произведение в числитель новой дроби;
        iChislitel *= otherFract.iZnamenatel;

        //знаменатель первой дроби умножить на числитель второй дроби и записать произведение в знаменатель новой дроби
        iZnamenatel *= otherFract.iChislitel;

        reduceFraction();

        return new MyFraction(iChislitel, iZnamenatel);
    }
}
