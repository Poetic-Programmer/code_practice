import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Subject{
	private List<Observer> observers;
	private WeatherData weatherData;

	public WeatherStation(){
		observers = new ArrayList<>();
		weatherData = new WeatherData(10, 10, 10);
	}

	public void setMeasurements(float temp, float humid, float pres){
		weatherData.setTemperature(temp);
		weatherData.setHumidity(humid);
		weatherData.setPressure(pres);
		notifyObservers();
	}

	@Override
	public void addObserver(Observer o){
		System.out.println("observer added");
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o){
		int index = observers.indexOf(o);

		System.out.println("observer " + (index + 1) + " removed");

		observers.remove(index);
	}
	@Override 
	public void notifyObservers(){
		for(Observer o : observers){
			o.update(weatherData);
		}
	}
}
