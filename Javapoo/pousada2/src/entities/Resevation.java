package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Resevation {
    private static DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer number;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Resevation(){
    }

    public Resevation(Integer number, LocalDate checkIn, LocalDate checkOut) {
        this.number = number;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = ChronoUnit.DAYS.between(checkIn, checkOut);
        return diff;
    }

    public String updateDates(LocalDate checkIn,LocalDate checkOut){

        LocalDate now = LocalDate.now();
        if(checkIn.isBefore(now) || checkOut.isBefore(now)){
            return "Reservation dates for update must be future dates";
        }
        if (!checkOut.isAfter(checkIn) ){
            return "Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + number
                +", check-in: "
                +dd.format(checkIn)
                +", check-out"
                +checkOut.format(dd)
                +", "
                +duration()
                +" nights";
    }
}


