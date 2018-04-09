package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double PoleProstokąta(double a,double b){
        return a*b;
    }
    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double ObwodProstokąta(double a,double b){
        return (2*a)+(2*b);
    }
    /**
     * Metoda statyczna obliczająca pole kwadratu
     */
    public static double PoleKawadratu(double aa){
        return aa*aa;
    }
    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double ObwódKwadratu(double a){
        
        return 4*a;
    }
    /**
     * Metoda statyczna obliczająca pole stożka
     */
    public static double PoleStożka(double r,double l){
        return (Math.PI*(r*r))+(Math.PI*r*l);
    }
    /**
     * Metoda statyczna obliczająca objetosc stożka
     */
    public static double VStożka(double r,double h){
        return (1/3)*((Math.PI *(Math.pow(r, 2)))*h);
    }
    /**
     * Metoda statyczna obliczająca pole walca
     */
    public static double PoleWalca(double r,double h){
        return (2*(Math.PI*(Math.pow(r, 2))))+(2*Math.PI*r*h);
    }
    /**
     * Metoda statyczna obliczająca v walca
     */
    public static double VWalca(double r,double H){
        return Math.PI*(Math.pow(r, 2))*H;
    }
    
}
