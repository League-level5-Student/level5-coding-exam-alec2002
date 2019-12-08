package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		String num = JOptionPane.showInputDialog("Number of robots?");
		int numm = Integer.parseInt(num);
		
		String colorr = JOptionPane.showInputDialog("Do you want red, green or blue?");
		
		
		String numSides = JOptionPane.showInputDialog("How many sides?");
		int nummm = Integer.parseInt(numSides);

Thread[] t = new Thread[numm];

for (int i = 0; i < t.length; i++) {
	int x = i*200;
		t[i] = new Thread(()-> {
		
		
			Robot r = new Robot(x, 300);
		
			
			
			if (colorr.equals("red")) {
				r.setPenColor(Color.RED);
			}
			else if (colorr.equals("green")) {
				r.setPenColor(Color.GREEN);
			}
			else {
				r.setPenColor(Color.BLUE);
			}
			
			r.penDown();
		   r.setSpeed(10);
		   
		   
		  
		   for (int k = 0; k < nummm; k++) {
			   r.move(100);
			   r.turn(360/nummm);
		}
			   
			
		
			
			
		
		
		
		} );
		
}
		
		for (int l = 0; l < t.length; l++) {
			t[l].start();
		}
		
	}
}
