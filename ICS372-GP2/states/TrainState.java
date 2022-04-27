package states;

public abstract class TrainState {
	
	public abstract void enter();
	
	public abstract void exit();
	
	/**
	   * Process clock tick Generates the timer runs out event
	   */
	  public void onTimerTick(int timerValue) {

	  }

	  /**
	   * Process clock ticks Generates the timer runs out event
	   */
	  public void onTimerRunsOut() {

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
