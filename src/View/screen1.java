package View;

import processing.core.PApplet;
import processing.core.PConstants;

public class screen1 {
	private PApplet app;
	private int screen;
	private int w;
	private int h;
	
	public screen1(PApplet app) {
		this.app = app;
		this.w = app.width/2;
		this.h = app.height/2;
	}
	public void drawScreen() {
		app.background(155);
		drawCopy();
		drawButtom();
	}
	public void drawCopy() {
		app.textSize(30);
		app.textAlign(PConstants.CENTER);
		app.fill(255);
		String tex = "THE NEW SPACE INVADERS";
		app.text(tex,w,h);
	}
	public void drawButtom() {
		app.fill(255,0,0);
		app.rectMode(PConstants.CENTER);
		app.rect(w,323,80,30);
		app.textSize(15);
		app.textAlign(PConstants.CENTER);
		app.fill(255);
		app.text("Start",w,330);
	}
	public void inicioJuego() {
		if(app.mouseX>311 && app.mouseX<390 && app.mouseY>306 && app.mouseY<338) {
			screen = 2;
			System.out.println("hola");
		}
	}
	public int getScreen() {
		return screen;
	}
	
	
}
