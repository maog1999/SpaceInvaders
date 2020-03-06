package View;

import processing.core.PApplet;
import View.screen1;
import View.screen2;
import View.screen3;

public class mainScreen extends PApplet {
int pantalla;
screen1 S1;
screen2 S2;
screen3 S3;


	public static void main(String[] args) {
		PApplet.main("View.mainScreen");
	}
public void settings() {
	size(700,500);
}
public void setup() {
	pantalla=1;
	S1 = new screen1(this);
	S2 = new screen2(this);
	S3 = new screen3();
}
public void draw() {
	background(255,0,0);
	
	switch(pantalla) {
	case 1:
	S1.drawScreen();
	

	
	break;
	
	case 2:
		//background(0,0,255);
		S2.drawInterface();
		
		/*fill(255);
		textSize(30);
		text("X: "+ mouseX + " Y: "+mouseY,mouseX,mouseY);*/
	break;
	
	case 3:
	
	break;
	}
}

public void mouseClicked() {
	switch (pantalla) {
	case 1:
		S1.inicioJuego();
		pantalla = S1.getScreen();
		break;
	case 2:
		
		break;
	
		}
}
public void keyPressed() {
	switch(pantalla) {
	case 2:
		S2.arrows();
		break;
	}
}

}
