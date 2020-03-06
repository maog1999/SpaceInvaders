package Model;

import View.screen2;
import processing.core.PApplet;

public class Logic extends PApplet {
	int mov;
	screen2 SC;
	
	public static void main(String[] args) {
		PApplet.main("Model.Logic");
	}
	public void setup() {
		SC = new screen2(this);
		mov = 5;
	}

	public void anadirbalas() {
		
	}

	public void Move(int i) {
		
	}
	public void Moveder() {
		mov += SC.getPosX();
		System.out.println("entro");
	}



}
