package org.example;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
 /*
        String txt = "some 22 of them 36 are 5 numbers -8";
        Scanner scanner = new Scanner(txt);
        int count = 0;
        while (scanner.hasNext()){
            scanner.next();
            if(scanner.hasNextInt()){
                System.out.println(scanner.nextInt() + " was found");
                count++;
            }
        }
        System.out.println("totally " + count + " numbers was found");

         */



       /*
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a binary code to convert to an integer : ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt(2)){
                int bin = scanner.nextInt(2);
            }
            try {

                System.out.println("a binary converted to integer has a value " + bin);
            }catch (InputMismatchException e){
                System.out.println("entered value isn`t a binary");
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("enter a hexadecimal code to convert to an integer : ");
            Scanner scanner = new Scanner(System.in);
            try {
                int bin = scanner.nextInt(16);
                System.out.println("a hexadecimal converted to integer has a value " + bin);
            }catch (InputMismatchException e){
                System.out.println("entered value isn`t a hexadecimal");
            }
        }

        */





        // Scanner scanner = new Scanner(System.in);
//        System.out.println( login("2dfsAaasde"));
//        System.out.println( login("!1Aasdee"));




        /* task 2.2
        String[] code = {"AUD", "GBR", "BYR", "DKK", "USD", "EUR", "KZT"};
        int[] unit = {1, 1, 1000, 10, 1, 1, 100};
        String[] currency = {"Австралійский долар", "Фунт стерлінгів", "Білоруський рубль", "Датська крона", "Долар США", "Євро", "Казахський тенге"};
        double[] equivalent = {23.9883, 45.8429, 19.7716, 25.9192, 27.4643, 31.3695, 15.4654};
        System.out.printf("Код За Одиницю Валюта%22s\n","UAH");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-4s%-11d%-25s%8.4f\n",code[i],unit[i],currency[i],equivalent[i]);
        }
         */



        /* task 2.3
        Scanner scanner = new Scanner(System.in);
        String end = "break";
        int count = 0;
        while (true){
            String txt = scanner.nextLine();
            if(end.equals(txt)){
                break;
            }
            if(txt.isEmpty()){
                count++;
            }
            else{
                System.out.println(txt);
            }
        }
        System.out.println("count of whitespaces " + count);
         */




        String json = new Scanner(new URL("https://api.weatherapi.com/v1/forecast.json?key=64ff7f31d0a241b2b0d62855230809&q=London&days=1&aqi=no&alerts=no")
                .openStream(), StandardCharsets.UTF_8).useDelimiter("\\A").next();
        Pattern rx = Pattern.compile("\"time\":\"(\\d{4}-\\d{2}-\\d{2})\\s"+"\"temp_c\":(\\d{2}\\.\\d)\"text\":\"(\\w*?)\".*?\"chance_of_rain\":(\\d)");
        Matcher matcher = rx.matcher(json);
        if(matcher.find()){
            System.out.println(matcher.group(1) + " " + matcher.group(2) + " °C, " + matcher.group(3)+ ", chance_of_rain " + matcher.group(4));
        } else{
            System.out.println("no found");
        }


    }



//    static String login (String ... log){
//
//        Pattern pattern = Pattern.compile("(?=.*\\d)(?<=.[!#$%])(?=.*[a-zA-Z])(?=.{8,})");
//        for(String check : log){
//            if(pattern.matcher(check).find()){
//                return "valid";
//            } else{
//                return "invalid";
//            }
//        }
//        return null;
//    }
        }

