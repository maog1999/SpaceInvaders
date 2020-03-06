package Model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logic{
	PApplet app5;
	private int posx;
	//screen2 SC;
	ArrayList<personaje> Perso;
	private int posYe=100;
	private int posXe=10;
	
	public  Logic(PApplet app5) {
		Perso = new ArrayList <personaje>();
		crearArreglo();
		posx=Perso.get(0).getPosx();
	}

	private void crearArreglo() {
		for(int i = 0;i<21;i++) {
			if(i==0) {
				Perso.add(new heroe(250,670));
			}else {
				Perso.add(new enemigo(posXe,posYe));
				posXe+=posXe+30;
				posYe+=posYe+30;
			}
		}
		
	}
public void Move(int i) {
		if(posx>40 && posx<660) {
			posx=posx+i;
		}
		if(posx>=660 & i==-25) {
			posx=posx+i;
		}
		if(posx<=25 && i==25) {
			posx=posx+i;
		}
	}
	public int getPosX() {
		return posx;
	}
	public void anadirbalas() {
		
	}
	
	
	






}
