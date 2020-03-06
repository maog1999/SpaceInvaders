package Model;

public abstract class personaje  {
		
		protected int posx;
		protected int posy;
		protected int Tamanno;
		
		public personaje(int posX,int posY) {
			posx=posX;
			posy=posY;
			Tamanno=50;
			
		}

		public int getPosx() {
			return posx;
		}

		public void setPosx(int posx) {
			this.posx = posx;
		}

		public int getPosy() {
			return posy;
		}

		public void setPosy(int posy) {
			this.posy = posy;
		}

		public int getTamanno() {
			return Tamanno;
		}

		public void setTamanno(int tamanno) {
			Tamanno = tamanno;
		}

		public void mover2() {
			
			
			
		}
		
		
		
		
	}

