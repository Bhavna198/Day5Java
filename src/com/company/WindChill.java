package com.company;

public class WindChill {
    public static void main(String[] args){
        double Temperature=Double.parseDouble(args[0]);
        double Speed=Double.parseDouble(args[1]);
        double Windchill=35.74 +0.6215*Temperature +(0.4275*Temperature - 35.75)*Math.pow(Speed,0.16);
        System.out.println("Temperature =" +Temperature+"Fahrenheit ");
        System.out.println("Wind Speed =" +Speed+"mph");
        System.out.println("Wind Chill =" +Windchill);
    }
}

