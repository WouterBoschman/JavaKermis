import java.util.Scanner;
import java.util.Random;

public class kermis {
    public static void main(String[] args) throws Exception {
    	Random randomNum = new Random();
    	int tellerSpin = 0;
    	int tellerHawaii = 0;
    	int belastingCounter = 0;
    	
    	for (int i=0 ; i < 100; i++) {
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
        	tellerSpin++;
        	if(tellerSpin>5) {
        		RiscoRijkeAttractie.RiscoAttractie = "Spin";
        		RiscoRijkeAttractie.draaiLimiet();        		
        		tellerSpin=0;
        	}
        	else{
        		Spin.spIN();
        		Spin.Spinkaartjes();
        	
        	}	
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
        	tellerHawaii++;
        	if(tellerHawaii>10) {
        		RiscoRijkeAttractie.RiscoAttractie = "Hawaii";
        		RiscoRijkeAttractie.draaiLimiet(); 
        		tellerHawaii=0;
        	}
        	
        	else{
        		Hawaii.haWaii();
        		Hawaii.Hakaartjes();
        	}
        }
        if (getal==6) {
        	Ladderklimmen.ladderKlimmen();
        	Ladderklimmen.Ladderkaartjes();
        	belastingCounter++;
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
    	Ladderklimmen.omzet = Ladderklimmen.prijs*belastingCounter;
    	double ladderklimmenwinst=Ladderklimmen.omzet;
    	int totaalkaarten = Botsauto.botskaartjes+Spin.spinkaartjes+Spookhuis.spookkaartjes+Spiegelpaleis.spiegelkaartjes+Hawaii.hakaartjes+Ladderklimmen.ladderkaartjes;
    	double totaalomzet = Botsauto.omzet+Spin.omzet+Spookhuis.omzet+Spiegelpaleis.omzet+Hawaii.omzet+ladderklimmenwinst;
 //kassa   	
    	System.out.println("'k' voor kaartjes en 'o' voor omzet");
    	char kassa = sc.next().charAt(0);
    	if (kassa == 'k') {
    		System.out.println(Botsauto.botskaartjes);
        	System.out.println(Spin.spinkaartjes);
        	System.out.println(Spookhuis.spookkaartjes);
        	System.out.println(Spiegelpaleis.spiegelkaartjes);
        	System.out.println(Hawaii.hakaartjes);
        	System.out.println(Ladderklimmen.ladderkaartjes);
        	System.out.println("Totale kaarverkoop ="+ totaalkaarten );
    	}
    	if (kassa == 'o') {
        	System.out.println(Botsauto.omzet);
        	System.out.println(Spin.omzet);
        	System.out.println(Spookhuis.omzet);
        	System.out.println(Spiegelpaleis.omzet);
        	System.out.println(Hawaii.omzet);
        	System.out.println(ladderklimmenwinst);
        	System.out.println("Totale omzet =" +totaalomzet);
    	}
    	if (kassa == 'b') {
    		Ladderklimmen.kansSpelBelastingBetalen();
    		ladderklimmenwinst=0.7*Ladderklimmen.omzet; 
    		
    		belastingCounter=0;
    	}

     	}	
        }
}

class Attractie{
	double prijs;
	double omzet;
	int kaartjes;
}
class RiscoRijkeAttractie extends Attractie{
	static String RiscoAttractie;
	static void draaiLimiet() {
		System.out.println(RiscoAttractie+"heeft een onderhouds beurt nodig");
	}

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
class Spin extends RiscoRijkeAttractie{
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
class Hawaii extends RiscoRijkeAttractie{
	static int hakaartjes;
	static void haWaii() {
		System.out.println("Hawaii draait");
	}
	static int Hakaartjes() {
		return hakaartjes++;
	}
}
class Ladderklimmen extends Attractie implements GokAttractie{
	
	public void kansSpelBelastingBetalen() {
				
	}
	static int ladderkaartjes;
	static void ladderKlimmen() {
		System.out.println("Ladderklimmen draait");
	}
	static int Ladderkaartjes() {
		return ladderkaartjes++;
		
	}
}
interface GokAttractie{
	public static void kansSpelBelastingBetalen() {
		
		
	}
}


