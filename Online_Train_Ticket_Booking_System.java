package com.ottbs;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

class UserId_password {                                         //create class UserId_password
    int userid_password() {                                    //create method userid_password()
        String str1 = "Chandu123", str2 = "Rawat#12345";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name:-");
        str1 = input.nextLine();
        System.out.println("Enter your password:-");
        str2 = input.nextLine();
        do {
            if (str1.equals("Chandu123") && str2.equals("Rawat#12345")) {              //check username and password is correcct or not
                return 0;
            } else {
                System.out.println("Your username and password is wrong try again!");
                System.out.println("Enter your user name:-");
                str1 = input.nextLine();
                System.out.println("Enter your password:-");
                str2 = input.nextLine();
            }
        } while (true);                                                      //infinite loop
    }
}
class Select_Stations extends UserId_password{                                        //create class Select_Stations and inherit the class UserId_password
    int select_stations() {                                                          //create method select_stations()
        String current="gwalior",journey="indore";
        Scanner input=new Scanner(System.in);
        System.out.println("**************************************!WELCOME TO ONLINE TRAIN TICKET BOOKING SYSTEM!**************************************");
        System.out.println("Enter your current station:-");
        current = input.nextLine();
        System.out.println("Enter your journey station:-");
        journey = input.nextLine();
        do {                                                                                                                                            //only two stations are available GWALIOR & INDORE
            if (current.equals("gwalior") && journey.equals("indore") || current.equals("indore") && journey.equals("gwalior")) {                      //check stations are available or not
                return 0;
            } else {
                System.out.println("Not available -> Enter available station");
                System.out.println("Enter your current station:-");
                current = input.nextLine();
                System.out.println("Enter your journey station:-");
                journey = input.nextLine();
            }
        }while(true);                                                                   //infinite loop
    }
}
class Choose_journey extends Select_Stations{                                                         //create class Choose_journey and inherit the class Select_Stations
    static char choice;
    void choose_journey() {                                                                          //create choose_journey() method
        System.out.println("These trains are running between these two stations :-");
        do{
            int train;
            Scanner input=new Scanner(System.in);
            System.out.println("==========================================================================");
            System.out.println("||                S.No.    Train No.    Train Name                      ||");
            System.out.println("||                1.       21116        Intercity Express               ||");
            System.out.println("||                2.       45768        Ratlam-jhansi Express           ||");
            System.out.println("||                3.       56398        Taj Express                     ||");
            System.out.println("||                4.       86723        Jhelum Express                  ||");
            System.out.println("==========================================================================");
            System.out.println("Select the serial number you want:-");
            train = input.nextInt();
            switch (train) {                                                                     //switch case start
                case 1:
                    System.out.println("21116-Intercity Express!");
                    System.out.println("Timing => 8:00 pm to 8:00 am");
                    System.out.println("Fare => ₹320");
                    selectDate();                                                               //call selectDate() method
                    selectSeat();                                                               //call selectSeat() method
                    break;
                case 2:
                    System.out.println("45678-Ratlam Jhansi Express!");
                    System.out.println("Timing => 6:30 pm to 6:30 am");
                    System.out.println("Fare => ₹220");
                    selectDate();                                                             //call selectDate() method
                    selectSeat();                                                             //call selectSeat() method
                    break;
                case 3:
                    System.out.println("56398-Taj Express!");
                    System.out.println("Timing => 6:50 pm to 6:50 am");
                    System.out.println("Fare => ₹300");
                    selectDate();                                                            //call selectDate() method
                    selectSeat();                                                            //call selectSeat() method
                    break;
                case 4:
                    System.out.println("86723-Jhelum Express!");
                    System.out.println("Timing => 7:15 pm to 6:00 am");
                    System.out.println("Fare => ₹350");
                    selectDate();                                                          //call selectDate() method
                    selectSeat();                                                         //call selectSeat() method
                    break;
                default:
                    System.out.println("Invalid serial no.");                            //if you enter wrong case number then print invalid serial no.
            }
            System.out.println();
            System.out.println("Do you want to continue,if yes then press (y) or (Y) otherwise press (n) or (N)!");
            choice=input.next().charAt(0);
        }while(choice=='y'||choice=='Y');                                                //infinite loop
    }
    void selectDate() {                                                                  //create selectDate() method
        Scanner input=new Scanner(System.in);                                            //create Scanner class to take input from user
        System.out.println("Enter the date");
        do{
            String date = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");       //create object for DateTimeFormatter class
            try {                                                                         //try block
                formatter.parse(date);                                                    //call DateTimeFormatter class
                break;
            } catch (Exception e) {                                                      //if you enter invalid date then execute catch block
                System.out.print("Invalid date ");
                System.out.println("-> Enter the valid date");
            }
        }while(true);                                                               //infinite loop
    }
    void selectSeat() {                                                       //create selectSeat() method
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println("Which berth do you want?");
        System.out.println("UPPER  ||  MIDDLE  ||  LOWER");
        String seat = input.nextLine();
        System.out.println("Enter the seat number! -> GREATER than 0 and SMALLER than or equal to 30");
        int no = input.nextInt();
        if (no > 0 && no < 30)                                                   //sitting arrangement
            if (no % 8 == 1 || no % 8 == 4) {                                   // you can enter only 1 to 30 seat number
                System.out.println("Seat no.= " + no);
                System.out.println("You got lower berth!");
                System.out.print(name+" ");
                current_time();                                                 //call current_time() method
            }
            else if (no % 8 == 2 || no % 8 == 5) {
                System.out.println("Seat no.= " + no);
                System.out.println("You got middle berth!");
                System.out.print(name+" ");
                current_time();                                                 //call current_time() method
            }
            else if (no % 8 == 3 || no % 8 == 6) {
                System.out.println("Seat no.= " + no);
                System.out.println("You got upper berth!");
                System.out.print(name+" ");
                current_time();                                                  //call current_time() method
            }
            else if (no % 8 == 7) {
                System.out.println("Seat no.= " + no);
                System.out.println("You got side lower berth!");
                System.out.print(name+" ");
                current_time();                                                //call current_time() method
            }
            else {
                System.out.println("Seat no.= " + no);
                System.out.println("You got side upper berth!");
                System.out.print(name+" ");
                current_time();                                                //call current_time() method
            }
        else {
            System.out.println("Seat no.= " + no);
            System.out.println("Invalid seat number!");                   //if you enter smaller than 0 and greater than 30 then print invalid seat number
        }
    }
    void current_time() {                                                //create current_time() method
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy - h:mm a");    //create object for SimpleDateFormat class
        Date date=new Date();                                                       //create object for Date class
        System.out.print("your ticket has *******BOOKED******* at this date and time -> ");
        System.out.println(sdf.format(date));                                       //print date and time format
    }
}
public class Online_Train_Ticket_Booking_System {
    public static void main(String[] args) {                         //main method
        Choose_journey object=new Choose_journey();                //create Choose_journey object and call methods through object reference
        object.userid_password();
        object.select_stations();
        object.choose_journey();
    }
}