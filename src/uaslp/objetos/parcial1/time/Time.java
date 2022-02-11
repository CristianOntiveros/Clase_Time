package uaslp.objetos.parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta){
        int aux=24,conte;
        conte=delta%aux;
        hour+=conte;
        if (hour>=24){
            hour=hour-24;
        }
    }

    public void addMinute(int delta){
        int aux=60,conte;
        if(delta/aux==0){
            minute+=delta;
            if (minute>=60){
                minute=minute-60;
                addHour(1);
            }
        }else{
            addHour(delta/aux);
            minute+=delta%aux;
            if (minute>=60){
                minute=minute-60;
                addHour(1);
            }
        }
    }

    public void addSecond(int delta){
        int aux=60,conte;
        if(delta/aux==0){
            second+=delta;
            if (second>=60){
                second=second-60;
                addMinute(1);
            }
        }else{
            addMinute(delta/aux);
            second+=delta%aux;
            if (second>=60){
                second=second-60;
                addMinute(1);
            }
        }
    }

    public String toString(){
        return String.format("%02d: %02d: %02d", hour, minute, second);
    }
}
