package display;

public interface TrainDisplay {
	/**
	 * Displays the cook time remaining
	 * 
	 * @param time remaining time
	 */
	public void showTrainStopped(int time);

	/**
	 * Indicate that the train is speeding up
	 */
	public void showTrainAccelerating();

	/**
	 * Indicate that the train is slowing down
	 */
	public void showTrainDecelerating();

	/**
	 * Indicate that train is going full speed
	 */
	public void showTrainFullSpeed();

	/**
	 * Indicate that the door is now open
	 */
	public void showDoorOpened();

	/**
	 * indicate that door is opening
	 */
	public void showDoorOpening();

	/**
	 * indicate that door is closed
	 */
	public void showDoorClosed();

	/**
	 * indicate that door is closing
	 */
	public void showDoorCLosing();

	/**
	 * indicate that door is obstructed
	 */
	public void showDoorObstruction();

	/*
	 * indicate remaining time.
	 */
	public void showTimeLeft(int time);
}
