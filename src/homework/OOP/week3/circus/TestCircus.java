package homework.OOP.week3.circus;

/**
 * Вы наконец-то решили заняться чем-то полезным и открыть личное дело.
 В голову пришла гениальная идея купить газельку и создать цирк на колесах.
 Вы наняли в труппу пару "артистов" и даете концерты для психичесики неуравновешенных людей.

 Вам, как владельцу цирка, доступны следующие действия:
 1) посмотреть список артистов.
 2) нанять на работу нового циркача.
 3) уволить самого пьющего акробата.
 4) Отправить кого-то выступать (каждый выступает по разному)
 5) Узнать сколько раз выступал каждый из сотрудников
 6) Выплалить зарплату артисттам (канатоходцам доп % за риски)
 7) переехать на другое место
 */
public class TestCircus {
    public static void main(String[] args) {

        Circus circus = new Circus();

        circus.printListOfArtists();

        Clown clown = new Clown("Pan");
        Ropewalker ropewalker = new Ropewalker("Rope");
        Acrobat acrobat = new Acrobat("Acrob");

        System.out.println();
        System.out.println("circus.recruit(clown, 5000) = " + circus.recruit(clown, 4444));
        System.out.println("circus.recruit(ropewalker, 5000) = " + circus.recruit(ropewalker, 5000));
        System.out.println("circus.recruit(acrobat, 5000) = " + circus.recruit(acrobat, 5000));
        System.out.println("circus.recruit(new Acrobat(\"Qwerty\"), 5000) = " + circus.recruit(new Acrobat("Qwerty"), 5000));
        System.out.println("circus.recruit(new Clown(\"Qwerty\"), 5000) = " + circus.recruit(new Clown("Pupok"), 4000));

        System.out.println("ropewalker.setPercentageForTheRisk(5) = " + ropewalker.setPercentageForTheRisk(5));

        System.out.println();
        circus.printListOfArtists();

        System.out.println();
        clown.Performance();
        ropewalker.Performance();
        ropewalker.Performance();

        System.out.println();
        circus.printListOfArtists();

        System.out.println();
        System.out.println("circus.fire(acrobat) = " + circus.fire(acrobat));

        System.out.println();
        circus.printListOfArtists();

        Artist circusArtist = circus.getArtist(3);

        if (circusArtist != null){

            System.out.println("\ncircusArtist.setCountOfPerformance(7) = " + circusArtist.setCountOfPerformance(7));

            System.out.println();
            System.out.printf("Artist %s made %d times\n", circusArtist.getName(), circus.getPerformance(circusArtist));
        }

        circusArtist = circus.getArtist(2);

        if (circusArtist != null){
            System.out.printf("Artist %s made %d times\n", circusArtist.getName(), circus.getPerformance(circusArtist));
        }

        System.out.println();
        circus.printListOfArtists();
    }
}
