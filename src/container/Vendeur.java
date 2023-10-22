package container;

public class Vendeur extends Salaire{
	private double vente;
	private double pourcentage;
	
	Vendeur(int mat, String nom,double recru,double vente, double pourcentage){
		super(mat,nom,recru);
		this.vente=vente;
		this.pourcentage=pourcentage;
	}
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	public double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	public String toString1() {
		return super.toString()+"vente"+vente+"pourcentage"+pourcentage;
	}
	public void affiche() {
		System.out.println(this.toString1());
		System.out.println(this.getClass());
	}
	
	public double salaire() {
		return super.salaire()+vente*pourcentage;
		}

}
