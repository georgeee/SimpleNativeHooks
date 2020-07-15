package org.simplenativehooks.events;

public class NativeMouseEvent {
	public enum State {
		UNKNOWN,
		MOVED,
		PRESSED,
		RELEASED,
		SCROLLED;
	}

	// Provided x and y correspond to the values returned by
	// java.awt.PointerInfo.getPointerInfo().getLocation().
	private int x;
	private int y;

	private State state;

	// Button is one of the following.
	// java.awt.event.InputEvent.BUTTON1_DOWN_MASK
	// java.awt.event.InputEvent.BUTTON2_DOWN_MASK
	// java.awt.event.InputEvent.BUTTON3_DOWN_MASK
	private int button;

	// Scroll delta
	private int delta;

	private NativeMouseEvent(int x, int y, State state, int button, int delta) {
		this.x = x;
		this.y = y;
		this.state = state;
		this.button = button;
		this.delta = delta;
	}

	public static NativeMouseEvent of(int x, int y, State state, int button) {
	    return of(x, y, state, button, 0);
    }
	public static NativeMouseEvent of(int x, int y, State state, int button, int delta) {
		return new NativeMouseEvent(x, y, state, button, delta);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public State getState() {
		return state;
	}

	public int getButton() {
		return button;
	}

	public int getDelta(){
		return delta;
	}
}
