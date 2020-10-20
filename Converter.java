/**
 *Rio Gwyneth Soliva
 *ITCC 11 B
 *Midterm Exam
**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Dolar to Peso Converter
class Converter {
	private JFrame frame; 
	private JPanel panel;
	private JLabel labRate;
	private JLabel labConvert;
	private JLabel labOutput;
	private JTextField textRate;
	private JTextField textConvert;
	private JTextField textOutput;
	private	ActListener MyActionListener;
	 double displayText1;
	 double displayText2;
	 double total;
	private Font font;
	
	
	public Converter() {
		//creates actionListener
		MyActionListener= new ActListener();

		//creates windows
		frame = new JFrame("Converter");
		 frame.setResizable(false);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(220,250);
		
		//creates panel
		panel = new JPanel();
		
		//creates label and textfield for Curent Rate 
		labRate = new JLabel("Curent Rate:");
		textRate = new JTextField(10);
	
		
		//creates label and textfield for Amount to Convert
		labConvert = new JLabel("Amount to Convert:");
		textConvert = new JTextField(10);
		
		
		//creates label and textfield for Output 
		labOutput = new JLabel("Output");
		textOutput = new JTextField(10);
		
		
		//makes output textfield not editable
		textOutput.setEditable(false);
		
		//font for textfield
		font = new Font("Serif",Font.PLAIN,24);
		textRate.setFont(font);
		textConvert.setFont(font);
		textOutput.setFont(font);
		
		//add actionlistener
		textRate.addActionListener(MyActionListener);
		textConvert.addActionListener(MyActionListener);
		textOutput.addActionListener(MyActionListener);
		
		//add to frame
		panel.add(labRate);
		panel.add(textRate);
		panel.add(labConvert);
		panel.add(textConvert);
		panel.add(labOutput);
		panel.add(textOutput);
		frame.add(panel);
		
		//set frame to be visible
		frame.setVisible(true);
	}


	 public static void main(String[] args) {
		 Converter c = new Converter();
	 }
		 class ActListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent event) {
			 
			 try {
				 String displayText1 = textRate.getText();
				 String displayText2 = textConvert.getText();
				 
				 
				 double TextRate = Double.parseDouble(displayText1);
				 double TextConvert =Double.parseDouble(displayText2);
				 
				 double total = TextRate * TextConvert;
				 
				 textOutput.setText(String.valueOf(total));
				 
				//if inputs are non-numeric 
			 }catch(NumberFormatException error) {
				 textOutput.setText("Invalid input");
			 }
		 }
	 }
		 
	
}