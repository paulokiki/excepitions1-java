package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) { // Testa se a data de saida é menor que a data de entrada
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            //Reservation reservation = new Reservation(number, new Date(), checkOut); // Instanciado com o momento da data
            System.out.println("Reservation" + reservation);
            System.out.println();

            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            Date now = new Date();

               String error = reservation.updateDate(checkIn, checkOut);
               if (error!= null){
                   System.out.println("Erro in reseration: " + error);
               }else {
                   System.out.println("Reservation: " + reservation) ;
               }
               
            }

        }

    }


