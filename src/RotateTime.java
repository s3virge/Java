/**
 * Created by S3ViRGE on 09.08.2017.
 */
public class RotateTime {
    private static final double circumference = 296.8; //длина окружности моего колеса в см

    public static void main(String[] args) {
        double rotateTime;
        double cmPerSecond;
        double cmPerHour;
        double kmPerHour;

        for (double i = 0.1; i < 5; i += 0.1) {
            rotateTime = i;
            cmPerSecond = calcLengthPerOneSecond(rotateTime);
            cmPerHour  = calcLengthPerHoure(cmPerSecond);
            kmPerHour  = convertCMtoKM(cmPerHour);

//            System.out.println("При обороте колеса за " + rotateTime + " сек" +
//                    "скорость будет равна " + kmPerHour + " км в час.");

            System.out.format("При обороте колеса за %.2f сек" +
                       " скорость будет равна %.2f км в час.\n", rotateTime, kmPerHour);
        }
    }

    //сколько см колесо проезжает за одну секунду
    private static double calcLengthPerOneSecond(double fullRotateTime){
        return (circumference * 1)/fullRotateTime;
    }

    private static double calcLengthPerHoure(double lengthPerSecond){
        return 3600 * lengthPerSecond;
    }

    private static double convertCMtoKM(double lengthPerHoure){
        int meter = 100; //cm
        int kiloMeter = 1000; //meters

        return lengthPerHoure / (meter * kiloMeter);
    }
}
