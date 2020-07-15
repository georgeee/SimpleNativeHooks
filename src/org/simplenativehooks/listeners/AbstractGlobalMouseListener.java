package org.simplenativehooks.listeners;

import org.simplenativehooks.events.NativeMouseEvent;
import org.simplenativehooks.utilities.Function;

public abstract class AbstractGlobalMouseListener implements GlobalListener {

	protected Function<NativeMouseEvent, Boolean> mousePressed;
	protected Function<NativeMouseEvent, Boolean> mouseReleased;
	protected Function<NativeMouseEvent, Boolean> mouseMoved;
	protected Function<NativeMouseEvent, Boolean> mouseScrolled;

	protected AbstractGlobalMouseListener() {
		mousePressed = Function.<NativeMouseEvent>trueFunction();
		mouseReleased = Function.<NativeMouseEvent>trueFunction();
		mouseMoved = Function.<NativeMouseEvent>trueFunction();
		mouseScrolled = Function.<NativeMouseEvent>trueFunction();
	}

	public final void setMousePressed(Function<NativeMouseEvent, Boolean> mousePressed) {
		this.mousePressed = mousePressed;
	}
	public final void setMouseReleased(Function<NativeMouseEvent, Boolean> mouseReleased) {
		this.mouseReleased = mouseReleased;
	}
	public final void setMouseMoved(Function<NativeMouseEvent, Boolean> mouseMoved) {
		this.mouseMoved = mouseMoved;
	}
	public final void setMouseScrolled(Function<NativeMouseEvent, Boolean> mouseScrolled) {
		this.mouseScrolled = mouseScrolled;
	}
}
