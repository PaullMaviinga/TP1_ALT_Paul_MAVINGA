
package tp1_alt_paul_mavinga;

/**
 * 
 * @author PAUL
 */
class zone {
    private int num_zone ;
    private int duree_mise_veille ;
    private String etat_zone ;

        public zone( int num_zone , int duree_mise_veille , String etat_zone) {
        this.num_zone = num_zone ;
        this.duree_mise_veille = duree_mise_veille ;
        this.etat_zone = etat_zone ;
        }
        
        public void setDuree_mise_veille( int duree_mise_veille) {
        this.duree_mise_veille = duree_mise_veille ;    
        }

        public int getDuree(){
        return this.duree_mise_veille;
        }

        public void setEtat_zone( String etat_zone) {
        this.etat_zone = etat_zone ; 
        }

    public String toString(){
    return "num zone: "+this.num_zone+" duree: "+this.duree_mise_veille+" etat: "+this.etat_zone;
}
}

class centrale {
    private int num_centrale ;
    private String etat_centrale ;

        public centrale( int num_centrale , String etat_centrale) {
        this.num_centrale = num_centrale ;
        this.etat_centrale = etat_centrale ;
        }
        
        public void setEtat_centrale( String etat_centrale) {
        this.etat_centrale = etat_centrale ; 
        }

    public String toString(){
    return "num centrale: "+this.num_centrale+" etat: "+this.etat_centrale;
}
}

class decodeur {
    private int num_dec ;
    private int code_secret ;

        public decodeur ( int num_dec , int code_secret ) {
        this.num_dec = num_dec ;
        this.code_secret = code_secret ;
        }

    public String toString(){
    return "num dec: "+this.num_dec+" code secret: "+this.code_secret;
}
}
