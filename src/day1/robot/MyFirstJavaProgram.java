package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot cookie = new Robot ();
		cookie.penDown();
for(int i=0;i<4;i++){
cookie.turn(90);
cookie.move(150);
}

	}
}
