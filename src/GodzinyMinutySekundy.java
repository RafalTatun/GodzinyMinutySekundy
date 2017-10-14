import java.util.Scanner;
 
public class GodzinyMinutySekundy{
  public static void main(String[] args){
	  
      Scanner odczyt = new Scanner(System.in);
      	int sekundy;
      	int godziny;
      	int minuty;
      	int reszta;
      System.out.println("Podaj ilo�� sekund: ");
      System.out.println("Podaj ilo�� sekund: ");
        sekundy = odczyt.nextInt();
        
        godziny = sekundy/3600;
        sekundy%=3600;
        
        minuty = sekundy/60;
        sekundy%=60;
        
 
      System.out.println("godziny: " + godziny + " mintuy: " + minuty + " sekundy: " + sekundy);
  }
}