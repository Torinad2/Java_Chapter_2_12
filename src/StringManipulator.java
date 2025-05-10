

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cityName;
        Scanner keyboard = new Scanner(System.in);
        cityName = keyboard.next();

        System.out.println(cityName.length());
        System.out.println(cityName.toUpperCase());
        System.out.println(cityName.toLowerCase());
        System.out.println(cityName.charAt(0));
    }
}