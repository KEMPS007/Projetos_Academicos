package programa;

import entities.Resevation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Room Number");
        int number = sc.nextInt();
        System.out.print("check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(),dd);
        System.out.print("check-in date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(),dd);

        LocalDate now = LocalDate.now();

        if(checkIn.isBefore(now) || checkOut.isBefore(now)){
            System.out.println("Reservation dates for update must be future dates");
        }
        else if(!checkOut.isAfter(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else{
            Resevation resevation = new Resevation(number,checkIn,checkOut);
        System.out.println("Resevation: " + resevation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(),dd);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(),dd);

            String error = resevation.updateDates(checkIn,checkOut);
            if(error != null){
                System.out.println("Error in reservation" + error);
            }
            else{
                resevation.updateDates(checkIn,checkOut);
                System.out.println("Reservation: " + resevation);
            }





        }




        sc.close();

    }
}
