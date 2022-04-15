package states;

/**
 * Represents the door opened state
 *
 */
public class DoorsOpened extends TrainState {
	private static DoorsOpened instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsOpened() {
		instance = this;
	}

	public static DoorsOpened getInstance() {
		if (instance == null) {
			instance = new DoorsOpened();
		}
		return instance;
	}

	@Override
	public void enter() {
	//	TrainStateContext.getInstance().showDoorsOpened();

	}

	@Override
	public void exit() {
		// TrainStateContext.getInstance().showDoorsClosed();

	}

}
