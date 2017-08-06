package homework.OOP.week3.circus;

import java.util.ArrayList;

/**
 * /**
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

public class Circus {

    private ArrayList<Artist> listOfArtists;

    public Circus() {
        this.listOfArtists = new ArrayList<Artist>();
    }

    public void printListOfArtists () {

        if (listOfArtists.size() > 0) {
            System.out.printf("%-15s%-15s%-15s%-15s\n", "name", "profession", "salary", "performance");
            System.out.println("------------------------------------------------------");

            for (Artist artist : listOfArtists) {
                System.out.printf("%-15s%-15s%-15.2f%-15d\n", artist.getName(), artist.getProfession(),
                        artist.getSalary(), artist.getCountOfPerformance());
            }
        }
        else {
            System.out.println(">>>   No artists   <<<");
        }
    }

    public boolean recruit(Artist artist, int salary) {

        artist.setSalary(salary);

        return listOfArtists.add(artist);
    }

    public boolean fire(Artist artist){

        artist.setSalary(0);

        return listOfArtists.remove(artist);
    }

    public Artist getArtist(int id) {

        if (id < 0 && id >= listOfArtists.size() - 1) {
            return null;
        }

        Artist artist = listOfArtists.get(id);

        return artist;
    }

    public int getPerformance(Artist artist) {
        return artist.getCountOfPerformance();
    }
}
