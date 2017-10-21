package de.wurzlersteffen.bmi;

import java.util.Scanner;

import de.wurzlersteffen.bmi.controller.BMI;
import de.wurzlersteffen.bmi.controller.BMICalculator;
import de.wurzlersteffen.bmi.controller.BMICalculatorFactory;
import de.wurzlersteffen.bmi.model.Cat;
import de.wurzlersteffen.bmi.model.Fish;
import de.wurzlersteffen.bmi.model.LivingThing;

/**
 * Main Class to start BMI-Calculator
 * 
 * @since 1.0.0
 * @see java.util.Scanner
 *
 */
public class App {
	private Scanner scanner = new Scanner(System.in);
	private LivingThing livingThing;
	private String[] results = new String[BMI.MAX_COUNT];
	private int index = -1;

	public static void main(String[] args) {
		new App();
	}
	
	private App() {
		System.out.println("BMI [Program Start]");
		boolean again = true;
		while (again && index < BMI.MAX_COUNT) {
			System.out.print("BMI [1-Input 2-Play 3-Eat 4-Process 5-Output 6-End Program] >");
			int selection = scanner.nextInt();
			switch (selection) {
			case 1: 
				input();
				break;
			case 2: 
				livingThing.play();
				break;
			case 3: 
				livingThing.eat();
				break;
			case 4: 
				process();
				break;
			case 5: 
				output();
				break;
			case 6: 
				again = false;
				break;
			default:
				System.out.println("Wrong input!");
			}
		}
		scanner.close();
		System.out.println("BMI [Program End]");
	}

	private void input() {
		while(true) {
			System.out.print("BMI [1=Cat 2=Fish] >");
			int livingThingType = scanner.nextInt();
			if (livingThingType == 1) {
				livingThing = new Cat();
				break;
			} else if (livingThingType == 2) {
				livingThing = new Fish();
				break;
			}
			System.out.println("BMI [Wrong input!]");
		}
		
		if (livingThing instanceof Cat) {
			System.out.println("BMI [Cat]");
		} else if (livingThing instanceof Fish) {
			System.out.println("BMI [Fish]");
		}
		
		System.out.print("BMI [Input name] >");
		String name = scanner.next();
		livingThing.setName(name);
		
		System.out.print("BMI [Input size[m]] >");
		double size = scanner.nextDouble();
		livingThing.setSize(size);
		
		System.out.print("BMI [Input weight[kg]] >");
		double weight = scanner.nextDouble();
		livingThing.setWeight(weight);
	}
	
	private void process() {
		int selection = 0;
		while (true) {
			System.out.print("BMI [1-Winter 2-Summer] >");
			selection = scanner.nextInt();
			if (selection == 1 || selection == 2) {
				break;
			}
		}
		BMICalculator calculator = BMICalculatorFactory.createInstance(selection);
		results[++index] = calculator.check(livingThing);
	}
	
	private void output() {
		int i = -1;
		System.out.println(livingThing);
		for (String result : results) {
			if (++i > index) {
				break;
			}
			System.out.println("BMI [Result " + result + "]");
		}
	}
	
}
