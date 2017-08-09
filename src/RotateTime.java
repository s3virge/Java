/**
 * Created by S3ViRGE on 09.08.2017.
 */
public class RotateTime {
    private static final double circumference = 296.8; //длина окружности моего колеса в см

    public static void main(String[] args) {

        //пусть колосе делает полный оборот за 1 секу, тогда я проеду 296.8 сантиметров.
        //за какое время должно делать оборот колесо что-бы двигаться со скоростью 20 км/ч

        double speedPerHour; //km/h
        double cmPerSecond;
        double rotateTime;
        double rotatePerSecond;

        for (int i = 10; i < 30; i++) {
            speedPerHour = i;
            cmPerSecond      = convertToCentimeterPerSecond(speedPerHour);
            rotateTime       = circumference / cmPerSecond;
            rotatePerSecond  = cmPerSecond / circumference;

            System.out.format("При обороте колеса за %.2f сек" +
                    " скорость будет равна %.2f км в час. ", rotateTime, speedPerHour);

            System.out.format("Колесо будет делать %.2f оборотов в секунду\n", rotatePerSecond);
        }
    }

    //конвертируем км/ч в см/с
    private static double convertToCentimeterPerSecond(double speedPerHour) {
        return ((speedPerHour * 1000) * 100) / 3600;
    }

    //конвертим км/ч в м/с
    private static double convertKMPerHourToMeterPerSecond(double speedPerHour) {
        return (speedPerHour * 1000) / 3600;
    }
}

