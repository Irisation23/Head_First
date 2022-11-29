package observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float currentPressure = 29.92F;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // 디스플레이 코드
        System.out.println("최근 온도: " + currentPressure);
        System.out.println("마지막 온도 : " + lastPressure);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
