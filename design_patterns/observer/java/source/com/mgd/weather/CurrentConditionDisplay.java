public class CurrentConditionDisplay implements Observer, Display{
	private float temperature;
	private float humidity;
	private float pressure;

	private Subject subject; 

	public CurrentConditionDisplay(Subject subject){
		this.subject = subject;
	}

	public void registerAsObserver(){
		subject.addObserver(this);
	}

	@Override
	public void update(WeatherData data){
		this.temperature = data.getTemperatureInCelcius();
		this.humidity = data.getHumidityInPascal();
		this.pressure = data.getPressureInGramsPerFeet();
	}

	@Override
	public void display(){
		System.out.println(
				"\ntemperature: " + temperature +
				"\nhumidity: " + humidity +
				"\npressure: " + pressure); 
	}
}
