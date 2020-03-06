package Model;

public class enemigo extends personaje {
	private int cambia =5;
	public enemigo(int posX, int posY) {
		super(posX, posY);
	
	}
	public void mover2() {
		posx=posx+cambia;
		if(posx>=660) {
			cambia*=-1;
			posy=posy+5;
		}
		if(posx<=40) {
			cambia*=-1;
			posy=posy+5;
		}
	}
}
