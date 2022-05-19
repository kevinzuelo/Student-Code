package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {

        // write your code here
        int  i;
        for(i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for(i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int[] forecastTemperatures = new int[5];
        forecastTemperatures[0] = 45;
        forecastTemperatures[1] = 30;
        forecastTemperatures[2] = 26;
        forecastTemperatures[3] = 85;
        forecastTemperatures[4] = 77;

        forecastTemperatures[2] += 10;

        for(i =0; i < forecastTemperatures.length; i++) {
            System.out.println(forecastTemperatures[i]);
        }
        int highestTemperatureValue = forecastTemperatures[0];
        int highestTemperatureIndex = 0;

        for (int j = 0; j < forecastTemperatures.length; j++) {
            if (forecastTemperatures[j] > highestTemperatureValue) {
                highestTemperatureValue = forecastTemperatures[j];
                highestTemperatureIndex = j;
            }
        }
        System.out.println("My Highest temp is: " + highestTemperatureValue);
        System.out.println("That will be the " + (highestTemperatureIndex + 1) + "'th day");




    }
}
