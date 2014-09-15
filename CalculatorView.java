import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNumber = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JButton addButton = new JButton("Add");
	private JButton minusButton = new JButton("Minus");
	private JButton multipleButton = new JButton("Mutiple");
	private JButton divideButton = new JButton("Divide");
	private JTextField calcSolution = new JTextField(10);

	private JLabel equalsLabel = new JLabel("=");
	
	
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		calcPanel.add(firstNumber);

		calcPanel.add(addButton);
		calcPanel.add(minusButton);
		calcPanel.add(multipleButton);
		calcPanel.add(divideButton);
		calcPanel.add(secondNumber);
		calcPanel.add(equalsLabel);
		calcPanel.add(calcSolution);
		
		
		
		this.add(calcPanel);
	}
	public int getFirstNumber(){
		return Integer.parseInt(firstNumber.getText());
	}
	public int getSecondNumber(){
		return Integer.parseInt(secondNumber.getText());
	}
	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(double solution){
		String value = String.format("%.5f", solution);
		calcSolution.setText(value);
	}
	
	void addCalculationListener(ActionListener listenForCalcButton){
		addButton.addActionListener(listenForCalcButton);
	}
	void minusCalculationListener(ActionListener listenForCalcButton){
		minusButton.addActionListener(listenForCalcButton);
	}
	void divideCalculationListener(ActionListener listenForCalcButton){
		divideButton.addActionListener(listenForCalcButton);
	}
	void multiCalculationListener(ActionListener listenForCalcButton){
		multipleButton.addActionListener(listenForCalcButton);
	}
	void displayError(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
