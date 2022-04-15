package states;

/**
 * Represents the door opening state
 *
 */
public class DoorsOpening extends TrainState {
	private static DoorsOpening instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsOpening() {
		instance = this;
	}

	public static DoorsOpening getInstance() {
		if (instance == null) {
			instance = new DoorsOpening();
		}
		return instance;
	}

	@Override
	public void enter() {
//		some code

	}

	@Override
	public void exit() {
		//some code

	}

}
