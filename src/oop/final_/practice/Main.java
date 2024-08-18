package oop.final_.practice;

import static oop.final_.practice.WeatherAnalyzer.*;

public class Main {
        public static void main(String[] args) {
            double currentTemperature = 42.5;  // 현재 기온
            double currentPrecipitation = 60.0; // 현재 강수량

            boolean temperatureAlert = WeatherAnalyzer.checkTemperatureAlert(currentTemperature);
            boolean precipitationAlert = checkPrecipitationAlert(currentPrecipitation);

            System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
            System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true
    }
}
