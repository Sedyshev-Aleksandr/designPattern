package behavioral.observer;

import behavioral.observer.observerDisplay.CurrentConditionDisplay;
import behavioral.observer.observerDisplay.ForecastDisplay;
import behavioral.observer.observerDisplay.StatisticsDisplay;
import behavioral.observer.subjectWeather.WeatherData;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,37.6f);
    }
}
