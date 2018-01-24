package upnow;

/**
 * @author Julian Helfenstein
 * @author Christopher Hilfing
 * @author Christopf Bodschwinna
 * @author Daniel Blättler
 * @since 18.01.2018
 * @version 0.2
 * @depreceated false
 */
public class Teilnehmer /*implements Comparable*/ {

    // Variables
    private int startNr;
    private int kategorie;
    private String name;
    private String vorname;
    private String messresultat;

    // Programm Code
    /**
     *
     * @param startNr
     * @param kategorie
     * @param name
     */
    public Teilnehmer(int startNr, int kategorie, String name) {
        this.startNr = startNr;
        this.kategorie = kategorie;
        this.name = name;
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param name
     * @param vorname
     */
    public Teilnehmer(int startNr, int kategorie, String name, String vorname) {
        this.startNr = startNr;
        this.kategorie = kategorie;
        this.name = name;
        this.vorname = vorname;
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param name
     * @param vorname
     * @param messresultat
     */
    public Teilnehmer(int startNr, int kategorie, String name, String vorname, String messresultat) {
        this.startNr = startNr;
        this.kategorie = kategorie;
        this.name = name;
        this.vorname = vorname;
        this.messresultat = messresultat;
    }

    /**
     *
     * @param messresultat
     */
    public void setMessresultat(String messresultat) {
        this.messresultat = messresultat;
    }

    /**
     *
     * @return
     */
    public int getStartNr() {
        return startNr;
    }

    /**
     *
     * @return
     */
    public int getKategorie() {
        return kategorie;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getVorname() {
        return vorname;
    }

    /**
     *
     * @return
     */
    public String getMessresultat() {
        return messresultat;
    }

    /**
     *
     */
    public void compareTo() {

    }

    /**
     *
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here

    }
     */
}
