package student_yan.lesson_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class PlaneTicket {

    Calendar calendar = new GregorianCalendar();
    

    public String airport_of_departure;
    public String airport_of_arrival;
    private double time_of_departure;
    private double time_of_arrival;

    public PlaneTicket(String airport_of_departure, String airport_of_arrival,double time_of_departure, double time_of_arrival) {

        this.airport_of_departure = airport_of_departure;
        this.airport_of_arrival = airport_of_arrival;
        this.time_of_departure = time_of_departure;
        this.time_of_arrival = time_of_arrival;
    }



}
