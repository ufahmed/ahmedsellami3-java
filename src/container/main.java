package container;

public class main {
	public static void main(String[] args) 
	{
		Salaire[] tabsalaire=new Salaire[5];
		Employe e1=new Employe(12345,"Walid",2002,15,4);
		Vendeur v1=new Vendeur(23445,"Yessine",2007,1000,0.1);
		Vendeur v2=new Vendeur(65478,"Nassime",2000,700,0.1);
		Employe e2=new Employe(87698,"Aymen ",2003,19,5);
		Employe e3=new Employe(12345,"Khaled",2008,7,4);
        
		tabsalaire[0]=e1;
		tabsalaire[1]=v1;
		tabsalaire[2]=v2;
		tabsalaire[3]=e2;
		tabsalaire[4]=e3;
		
        for(int i=0;i<tabsalaire.length;i++) {
        	if(tabsalaire[i] instanceof Employe ) {
        		tabsalaire[i].affiche();
        	}
        }
		
        
        for(int i=0;i<tabsalaire.length;i++) {
        	if(tabsalaire[i] instanceof Vendeur ) {
        		tabsalaire[i].affiche();
        	}
        }
        Salaire rmin=tabsalaire[0];
        for(int i = 1;i<tabsalaire.length;i++) {
        	if(rmin.getrecrutement() < tabsalaire[i].getrecrutement()) {
        		rmin=tabsalaire[i];
        		
        	}
        	
        	
        }
        
        Salaire smax=null;
        for(int i=0;i<tabsalaire.length;i++) {
        	if (tabsalaire[i] instanceof Vendeur ) {
        		if(smax==null) {
        			smax=tabsalaire[i];
        		}
        		else {
        			if(smax.salaire()<tabsalaire[i].salaire()) {
        				smax=tabsalaire[i];
        			}
        		}
        		
        	}
        	
        }
	}
	
	
	
	
	

}
