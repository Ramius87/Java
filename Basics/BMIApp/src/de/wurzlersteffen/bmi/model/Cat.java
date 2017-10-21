package de.wurzlersteffen.bmi.model;

/**
 * Datatype which represents all cats
 * 
 * @since 1.0.0
 *
 */
public class Cat extends LivingThing {

	/** 
	 * {@inheritDoc}
	 * <p>Adds 0.1 kg to the weight of a cat</p>
	 */
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 0.1);
	}

	/** 
	 * {@inheritDoc}
	 * <p>Reduces the weight of a cat by 0.1 kg</p>
	 */
	@Override
	public void play() {
		super.setWeight(super.getWeight() - 0.1);
	}
}
