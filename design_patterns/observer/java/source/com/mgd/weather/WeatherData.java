public class WeatherData{
	private float temperature;
	private float humidity;
	private float pressure;


	public WeatherData(float temperature, float humidity, 
			float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public void setTemperature (float temp) { this.temperature = temp; }
	public void setHumidity (float humidity) { this.humidity = humidity; }
	public void setPressure (float pressure) { this.pressure = pressure; }

	public float getTemperatureInCelcius(){
		return temperature;
	}

	public float getHumidityInPascal(){
		return humidity;
	}

	public float getPressureInGramsPerFeet(){
		return pressure;
	}
}
