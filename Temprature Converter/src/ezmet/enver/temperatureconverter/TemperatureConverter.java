package ezmet.enver.temperatureconverter;

import ezmet.enver.mywindow.MyWindow;

public class TemperatureConverter extends MyWindow {

	public TemperatureConverter() {
		setFontSize(26);
		double f=promtForDouble("Enter degree Fahrenheit");
		print((f-32)*5/9+(" degree Celsius"));
		double c=promtForDouble("Enter degree Celsius");
		print("Fahrenheit= "+(1.8*c+32));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TemperatureConverter();

	}

}
