package states;

/**
 * Represents the door closing state
 *
 */
public class DoorsClosing extends TrainState {
	private static DoorsClosing instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsClosing() {
		instance = this;
	}

	public static DoorsClosing getInstance() {
		if (instance == null) {
			instance = new DoorsClosing();
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
