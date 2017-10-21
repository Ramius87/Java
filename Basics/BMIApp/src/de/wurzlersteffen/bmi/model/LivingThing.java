package de.wurzlersteffen.bmi.model;

import de.wurzlersteffen.bmi.controller.BMIBody;

/**
 * Superclass for all living things
 * 
 * @since 1.0.0
 *
 */
public abstract class LivingThing implements BMIBody{

	private String name;
	private double size;
	private double weight;

	public LivingThing() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Should be used whenever a living thing eats
	 */
	public abstract void eat();
	
	/**
	 * Should be used whenever a living thing plays
	 */
	public abstract void play();

	@Override
	public String toString() {
		return "LivingThing [name=" + name + ", size=" + size + ", weight=" + weight + "]";
	}

}