package container;

public class Salaire {
	private int matricule ;
	private String nom;
	private double recrutement;
	
	Salaire(int mat, String nom , double recru){
		this.matricule = mat;
		this.nom = nom;
		this.recrutement = recru;
		
	}
	
	
	int getmat() {
		return this.matricule;
		
	}
	
	String getnom() {
		return this.nom;
	}
	
	double getrecrutement() {
		return this.recrutement;
	}
	
	
	public void setmat(int x) {
		this.matricule=x;
	}
	
	public void setnom(String y) {
		this.nom=y;
	}
	
	public void setrecrutement(double z) {
		this.recrutement=z;
	}
	
	public void affiche() {
		System.out.println("matricule:"+matricule+"nom:"+nom+"recrutement:"
	    +recrutement);
	}
	
	public String toString() {
		return "mat"+matricule+"nom"+nom+"recrutement"+recrutement;
	}
	public double salaire() {
		if(this.recrutement<2005) {
			return 400;	
		}
		else {
			return 280;
		}
		
	}

}
