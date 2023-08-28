package Clock;

public class Clock {

    int sec, min, hours;

    Clock(){
    }

    Clock(int nSec) {
        hours = nSec / 3600;
        min = (nSec % 3600) / 60;
        sec = (nSec % 3600) % 60;
    }

    Clock(int nSec, int nMin, int nHours){
        sec = nSec;
        min = nMin;
        hours = nHours;
    }

    public int seconds(){
        int summSec =sec + min * 60 + hours * 3600;
        return summSec;
    }

    public String time(){
        return (sec + " " + min + " " + hours);
    }

}
