package states;

/**
 * Represents the door closed state
 *
 */
public class DoorsClosed extends TrainState {
	private static DoorsClosed instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsClosed() {
		instance = this;
	}

	public static DoorsClosed getInstance() {
		if (instance == null) {
			instance = new DoorsClosed();
		}
		return instance;
	}

	@Override
	public void enter() {
		//TrainStateContext.getInstance().showDoorsClosed();

	}

	@Override
	public void exit() {
		//TrainStateContext.getInstance().showDoorsOpened();

	}

}
