package demo;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class click {

	private static Robot clicker;

	public static void main(String[] args) throws InterruptedException {

		try {
			clicker = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		Thread.sleep(2000); // waiting to put mouse in the right place

		Point mousePos = new Point();
		mousePos = MouseInfo.getPointerInfo().getLocation();
		double mouseX = mousePos.getX();
		double mouseY = mousePos.getY();

		// long startTime = System.currentTimeMillis();

		while (mouseX <= MouseInfo.getPointerInfo().getLocation().getX() + 10
				&& mouseX >= MouseInfo.getPointerInfo().getLocation().getX() - 10
				|| mouseY <= MouseInfo.getPointerInfo().getLocation().getY() + 10
						&& mouseY >= MouseInfo.getPointerInfo().getLocation().getY() - 10) {
			clicker.mousePress(MouseEvent.BUTTON1_MASK);
			clicker.mouseRelease(MouseEvent.BUTTON1_MASK);
			clicker.delay(2);
		}
	}

}
