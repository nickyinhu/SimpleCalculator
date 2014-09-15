import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController(CalculatorModel model, CalculatorView view){
		this.model = model;
		this.view = view;
		this.view.addCalculationListener(new AddListener());

		this.view.minusCalculationListener(new MinusListener());

		this.view.divideCalculationListener(new divideListener());

		this.view.multiCalculationListener(new multiListener());
	}
	
	class AddListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.add(firstNumber, secondNumber);
				view.setCalcSolution(model.getValue());
				
			}catch (NumberFormatException ex){
				System.out.println(ex);
			}
		}
		
	}
	class MinusListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.minus(firstNumber, secondNumber);
				view.setCalcSolution(model.getValue());
				
			}catch (NumberFormatException ex){
				System.out.println(ex);
			}
		}		
	}
	class multiListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.multiple(firstNumber, secondNumber);
				view.setCalcSolution(model.getValue());
				
			}catch (NumberFormatException ex){
				System.out.println(ex);
			}
		}
		
	}
	class divideListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();				
				model.divide(firstNumber, secondNumber);
				view.setCalcSolution(model.getValue());				
			}catch (NumberFormatException ex){
				System.out.println(ex);
			}
		}		
	}
}
