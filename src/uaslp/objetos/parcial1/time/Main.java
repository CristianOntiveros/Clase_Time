package uaslp.objetos.parcial1.time;

public class Main {

    public static void main(String[] args) {
	    Time time= new Time(0,35,28);
        System.out.println(time.toString());
        System.out.println(" ");

        time.addSecond(362);
        System.out.println(time.toString());
        System.out.println(" ");
        time.addMinute(120);
        System.out.println(time.toString());
        System.out.println(" ");
        time.addHour(48);
        System.out.println(time.toString());
        System.out.println(" ");
    }
}
