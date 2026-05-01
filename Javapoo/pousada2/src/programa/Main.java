package programa;

import model.entities.Resevation;
import model.exeptions.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    try {
        System.out.print("Room Number");
        int number = sc.nextInt();
        System.out.print("check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), dd);
        System.out.print("check-in date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), dd);

        LocalDate now = LocalDate.now();


        Resevation resevation = new Resevation(number, checkIn, checkOut);
        System.out.println("Resevation: " + resevation);

        System.out.println();
        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = LocalDate.parse(sc.next(), dd);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = LocalDate.parse(sc.next(), dd);

        resevation.updateDates(checkIn, checkOut);
        System.out.println("Reservation: " + resevation);
    }
    catch (DomainException e ){
        System.out.println("Invalid date format");
    }
    catch (RuntimeException e ){
        System.out.println("Unexpected error");
    }











        sc.close();

    }
}
