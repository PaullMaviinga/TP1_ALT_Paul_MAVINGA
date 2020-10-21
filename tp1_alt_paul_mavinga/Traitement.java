
package tp1_alt_paul_mavinga;

import java.lang.*;
import java.util.*;
/**
 *
 * @author PAUL
 */
public class Traitement {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    
      
    zone sherif = new zone(1,2,"ACTIF");
    centrale horslaloi = new centrale(4,"INACTIF");
    decodeur sherif_horslaloi = new decodeur(8,666);
    
    ArrayList liste = new ArrayList<zone>();
    liste.add(sherif);
    liste.add(horslaloi);
    liste.add(sherif_horslaloi); 
    
    for (Object pers : liste) {
    System.out.println(pers.toString());

    
    }
}
}
