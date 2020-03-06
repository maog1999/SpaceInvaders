package Controlador;

import Model.Logic;
import processing.core.PApplet;
import processing.core.PConstants;

public class conScreen2 {
	private PApplet app3;
	Logic Lo;
	
public conScreen2(PApplet app3) {
	this.app3 = app3;
	this.Lo = new Logic();

}

public void keyPressed() {
	if(app3.keyCode == 32) {
		Lo.anadirbalas();
	}
	if(app3.keyCode == PConstants.RIGHT) {
		Lo.Moveder();
		System.out.println("entro");
	}
	/*if(app3.keyCode == PConstants.LEFT) {
		Lo.Move(-1);
	}*/
}

}
