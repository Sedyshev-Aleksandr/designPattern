package behavioral.observer.observerDisplay;

import behavioral.observer.subjectWeather.Subject;

public class StatisticsDisplay implements Observer, DisplayElement  {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions:" +
                           " temperature - " + temperature +
                           ", humidity - " + humidity +
                           ", pressure - " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
