package states;

public abstract class TrainState {
	public abstract void enter();
	public abstract void exit();
	
	public void onTimerTick(int timerValue) {
		
	}
	
}
