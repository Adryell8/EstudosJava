package pooAtividades.Domain;

public class Retangulo {
	public double a;
	public double l;

	public double CaculaArea() {
		double area = this.a * this.l;
		return area;
	}

	public double CalculaPerimetro() {
		double P = 2 * (this.a * this.l);
		return P;
	}

	public double CaculaDiametro() {
		double D = Math.sqrt((this.a * this.a) + (this.l * this.l));
		return D;
	}

	public void Resultados() {
		System.out.println("Valor da area: " + CaculaArea());

		System.out.println("Valor da perimetro: " + CalculaPerimetro());

		System.out.println("Valor da diagonal: " + String.format("%.2f", +CaculaDiametro()));
	}
}