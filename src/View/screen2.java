package View;

import processing.core.PApplet;
import processing.core.PConstants;
import Controlador.conScreen2;

public class screen2 {
	private PApplet app2;
	private int posX;
	private int posY;
	conScreen2 CS2;
	
	
public screen2(PApplet app2) {
	this.app2 = app2;
	this.posX = app2.width/2;
	this.posY = posY;
	this.CS2 = new conScreen2(app2);
	
}

public void drawInterface() {
	app2.background(50);
	drawHeroe();
	drawEnemy();
	drawBullet();
}

public void drawHeroe() {
	app2.fill(0,0,255);
	app2.rectMode(PConstants.CENTER);
	app2.rect(posX,app2.height-30,40,20);
}
public void drawEnemy() {
	app2.fill(255,0,0);
	app2.ellipseMode(PConstants.CENTER);
	app2.ellipse(posX,100,50,50);
}
public void drawBullet() {
	app2.fill(255,255,0);
	app2.ellipseMode(PConstants.CENTER);
	app2.ellipse(posX,469,15,15);
}

public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

}
