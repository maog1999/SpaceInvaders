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
	private int contador = 0;
	
	public  Logic(PApplet app5) {
		Perso = new ArrayList <personaje>();
		crearArreglo();
		posx=Perso.get(0).getPosx();
	}

	private void crearArreglo() {
		Perso.add(new heroe(250,670));
		for(int i = 1;i<25;i++) {
			
			
				Perso.add(new enemigo(posXe,posYe));
				posXe=posXe+50;
				contador +=1;
				
				if(contador == 6) {
					posYe=posYe+50;
					posXe=10;
					contador=0;
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
	
	
	public void posyenemy(int posy) {
		posYe=Perso.get(posy).getPosy();
	}
	
	
	public int posYe() {
		return posYe;
	}
	
	
	public void posxenemy(int posx2) {
		posXe=Perso.get(posx2).getPosx();
	}
	
	
	public int posXe() {
		return posXe;
	}
	
	
	
	public void ahiVa() {
		for(int i=1;i<25;i++) {
			Perso.get(i).mover2();
		}
		
	}
	public void anadirbalas() {
		
	}
	
	
	






}
