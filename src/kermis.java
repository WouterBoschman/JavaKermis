import java.util.Scanner;
import java.util.Random;

public class kermis {
    public static void main(String[] args) throws Exception {
    	Random randomNum = new Random();
    	for (int i=0 ; i < 10; i++) {
    		//int loops = 1+ 	randomNum.nextInt(6);
    		//System.out.println(loops);
    	
        int getal;
        System.out.println("Typ een getal");
        Scanner sc = new Scanner(System.in);
        getal = sc.nextInt();
        if (getal==1) {
        	Botsauto.botsAuto();
        	Botsauto.Botskaartjes();
        	        }
        if (getal==2) {
        	Spin.spIN();
        	Spin.Spinkaartjes();;
        	
        }
        if (getal==3) {
        	Spookhuis.spookHuis();
        	Spookhuis.Spookkaartjes();
        	
        }
        if (getal==4) {
        	Spiegelpaleis.spiegelPaleis();
        	Spiegelpaleis.Spiegelkaartjes();
        	
        }
        if (getal==5) {
        	Hawaii.haWaii();
        	Hawaii.Hakaartjes();
        }
        if (getal==6) {
        	Ladderklimmen.ladderKlimmen();
        	Ladderklimmen.Ladderkaartjes();
        }
        
    	Botsauto Botsauto = new Botsauto();
    	Botsauto.prijs = 2.50;
    	Spin Spin = new Spin();
    	Spin.prijs = 2.25;
    	Spookhuis Spookhuis = new Spookhuis();
    	Spookhuis.prijs = 2.75;
    	Spiegelpaleis Spiegelpaleis = new Spiegelpaleis();
    	Spiegelpaleis.prijs = 3.20;
    	Hawaii Hawaii = new Hawaii();
    	Hawaii.prijs = 2.90;
    	Ladderklimmen Ladderklimmen = new Ladderklimmen();
    	Ladderklimmen.prijs = 5.00;
    	
    	
    	Botsauto.omzet = Botsauto.prijs*Botsauto.botskaartjes;
    	Spin.omzet = Spin.prijs*Spin.spinkaartjes;
    	Spookhuis.omzet = Spookhuis.prijs*Spookhuis.spookkaartjes;
    	Spiegelpaleis.omzet = Spiegelpaleis.prijs*Spiegelpaleis.spiegelkaartjes;
    	Hawaii.omzet = Hawaii.prijs*Hawaii.hakaartjes;
    	Ladderklimmen.omzet = Ladderklimmen.prijs*Ladderklimmen.ladderkaartjes;
    	System.out.println(Botsauto.omzet);
    	System.out.println(Spin.omzet);
    	System.out.println(Spookhuis.omzet);
    	System.out.println(Spiegelpaleis.omzet);
    	System.out.println(Hawaii.omzet);
    	System.out.println(Ladderklimmen.omzet);
    	
    	
    	}
    	
    	
        }
}

class Attractie{
	double prijs;
	double omzet;
	int kaartjes;
	
}
class Botsauto extends Attractie{
	static int botskaartjes;
	static void botsAuto() {
		System.out.println("Botsauto draait");	
	}
	static int Botskaartjes() {
		return botskaartjes++;
	}
}
class Spin extends Attractie{
	static int spinkaartjes;
	static void spIN() {
		System.out.println("Spin draait");	
	}
	static int Spinkaartjes() {
		return spinkaartjes++;
	}
}

class Spiegelpaleis extends Attractie{
	static int spiegelkaartjes;
	static void spiegelPaleis() {
		System.out.println("Spiegelpaleis draait");
	}
	static int Spiegelkaartjes() {
		return spiegelkaartjes++;
	}
}
class Spookhuis extends Attractie{
	static int spookkaartjes;
	static void spookHuis() {
		System.out.println("Spookhuis draait");
	}
	static int Spookkaartjes() {
			return spookkaartjes++;
	}
}
class Hawaii extends Attractie{
	static int hakaartjes;
	static void haWaii() {
		System.out.println("Hawaii draait");
	}
	static int Hakaartjes() {
		return hakaartjes++;
	}
}
class Ladderklimmen extends Attractie{
	static int ladderkaartjes;
	static void ladderKlimmen() {
		System.out.println("Ladderklimmen draait");
	}
	static int Ladderkaartjes() {
		return ladderkaartjes++;
		
	}
}


