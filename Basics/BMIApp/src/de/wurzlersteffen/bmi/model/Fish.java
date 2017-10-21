package de.wurzlersteffen.bmi.model;

/**
 * Datatype which represents all fish
 * 
 * @since 1.0.0
 *
 */
public class Fish extends LivingThing {

	/** 
	 * {@inheritDoc}
	 * <p>Adds 0.001 kg to the weight of a fish</p>
	 */
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 0.001);
	}

	/** 
	 * {@inheritDoc}
	 * <p>Reduces the weight of a fish by 0.001 kg</p>
	 */
	@Override
	public void play() {
		super.setWeight(super.getWeight() - 0.001);
	}
}
