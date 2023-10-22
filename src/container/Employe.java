package container;

public class Employe extends Salaire{
	private double Hsupp;
	private double PHsupp;
	
	Employe(int mat, String nom, double recru,double hsupp,double phsupp){
		super(mat,nom,recru);
		this.Hsupp=hsupp;
		this.PHsupp=phsupp;
	}

	public double getHsupp() {
		return this.Hsupp;
	}

	public void setHsupp(double hsupp) {
		this.Hsupp = hsupp;
	}

	public double getPHsupp() {
		return this.PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		this.PHsupp = pHsupp;
	}
	
	public String toString() {
		return super.toString()+"hsupp"+Hsupp+"phsupp"+PHsupp;
	}
	public void affiche() {
		System.out.println(this.toString());
		System.out.println(this.getClass());
	}

	
	public double salaire() {
		return super.salaire()+Hsupp*PHsupp;
		}
		
	
	
}
