public class Complexe {
	private double x;
	private double y;

	public Complexe() {
		this(0, 0);
	}

	public Complexe(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Complexe(Complexe c) {
		this(c.x, c.y);
	}

	public static Complexe ajout(Complexe c1, Complexe c2) {
		Complexe c3 = new Complexe(c1);
		c3.ajout(c2);
		return c3;
	}

	public static Complexe multiplication(Complexe c1, Complexe c2) {
		Complexe c3 = new Complexe(c1);
		c3.multiplication(c2);
		return c3;
	}

	public String coord() {
		// ( longueur vecteur (r); angle (a) )
		// x = r * cos(a)
		// a = acos(x / r)
		// r = sqrt(x² + y²)
		double r = Math.sqrt(x * x + y * y);
		// double a = Math.acos(x / r);
		double a = Math.atan2(x, y);
		return "(" + r + ";" + a + ")";
	}


	public void oppose() {
		x *= (-1);
		y *= (-1);
	}

	public void ajout(Complexe c) {
		this.x += c.x;
		this.y += c.y;
	}

	public void multiplication(Complexe c) {
		// (this.x + this.y * i) * (c.x + c.y * i)
		// this.x * c.y - this.y * c.y + i * (this.x * c.y + this.y * c.x)
		double oldX=x;
		x = x * c.x - y * c.y;
		y = oldX * c.y + y * c.x;
	}

	public void normage() {
		double norme = Math.sqrt(x * x + y * y);
		if(norme != 0) {
			this.x /= norme;
			this.y /= norme;
		}
	}


	public String toString() {
		return x + (y >= 0 ? " + " : " ") + y + " * i";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}


}