public class App{
	public static void main(String [] args){
		WeatherStation station = new WeatherStation();

		Display currentDisplay = new CurrentConditionDisplay(station);
		Display displayB = new CurrentConditionDisplay(station);
		
		currentDisplay.registerAsObserver();
		displayB.display();

		station.setMeasurements(10, 10, 10);
		
		currentDisplay.display();

		station.setMeasurements(10, 5, 5);

		currentDisplay.display();
	}
}
