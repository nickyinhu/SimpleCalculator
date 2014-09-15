public class CalculatorModel {
	private double calculationValue;
	public void add(double a, double b){
		calculationValue = a+b;
	}
	public void minus(double a, double b){
		calculationValue = a-b;
	}
	public void multiple(double a, double b){
		calculationValue = a*b;
	}
	public void divide(double a, double b){
		calculationValue = (double) a/ (double) b;
	}
	public double getValue(){
		return calculationValue;
	}
}
