package Controlador;

import Model.Logic;
import processing.core.PApplet;
import processing.core.PConstants;

public class conScreen2 {
	private PApplet app3;
	Logic Lo;
	
public conScreen2(PApplet app3) {
	this.app3 = app3;
	this.Lo = new Logic(app3);

}
public void arrow() {
	if(app3.keyCode == 32) {
		Lo.anadirbalas();
	}
	if(app3.keyCode==PConstants.RIGHT) {
		Lo.Move(10);
		System.out.println(getposx());
		System.out.println("entreee");
	}
	if(app3.keyCode==PConstants.LEFT) {
		System.out.println("entreee22");
		Lo.Move(-10);
	}
	
}
public int getposx() {
	return Lo.getPosX();
}

}
