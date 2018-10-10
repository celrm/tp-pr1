package p1;

public class Sunflower {
	private int x;
	private int y;
	private int vida;
	private Game juego;
	
	private int nacimiento;
	
	public static final int VIDA = 1;
	public static final int HARM = 0;
	public static final int PRODUCE_SOLES = 10;
	public static final int COSTE = 20;
	
	public Sunflower(int x, int y, Game juego) {
		this.x = x;
		this.y = y;
		this.vida = Sunflower.VIDA;
		this.juego = juego;
		this.nacimiento = juego.getCiclos();
	}
	
	public int vida() {
		return this.vida;
	}
	
	public void serDanado(int dano) {
		this.vida -= dano;
	}
	
	public boolean tocaGenerar() {
		return this.nacimiento % 2 == this.juego.getCiclos() % 2;		
	}
	
	public int posx(){
		return this.x;
	}
	public int posy(){
		return this.y;
	}
	
}
