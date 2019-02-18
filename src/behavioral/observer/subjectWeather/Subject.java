package behavioral.observer.subjectWeather;

import behavioral.observer.observerDisplay.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
