package states;

public abstract class TrainState {
	
	public abstract void enter();
	
	public abstract void exit();
	
	public void onTimerTick(int timerValue) {
		
	}
	
	public void onAccelerate() {
		
	}
	
	public void onDeccelerate() {
		
	}
	
	public void onDoorsOpened() {
		
	}
	
	public void onDoorsClosed() {
		
	}
	
	public void onDoorsClosing() {
		
	}
	
	public void onDoorsOpening() {
		
	}
	
	public void onFullSpeed() {
		
	}
	
	public void onStopped() {
		
	}
}
