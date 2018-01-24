package upnow;

/**
 * @author Julian Helfenstein
 * @author Christopher Hilfing
 * @author Christopf Bodschwinna
 * @author Daniel Blättler
 * @since 18.01.2018
 * @version 0.1
 * @depreceated false
 */
public class Knoten {

    // Variables
    private Knoten successor = null;
    private Knoten predessor = null;
    private int startNr;
    private int kategorie;
    private String name = null;
    private String vorname = null;
    private String messresultat = null;
    private Teilnehmer tn1 = new Teilnehmer(startNr, kategorie, name, vorname, messresultat);

    // Programm Code
    /**
     *
     * @param successor
     * @param predessor
     * @param startNr
     * @param kategorie
     * @param name
     * @param vorname
     * @param messresultat
     */
    public Knoten(Knoten successor, Knoten predessor, int startNr, int kategorie, String name, String vorname, String messresultat) {
        this.successor = successor;
        this.predessor = predessor;
        this.startNr = startNr;
        this.kategorie = kategorie;
        this.name = name;
        this.vorname = vorname;
        this.messresultat = messresultat;
    }

    /**
     *
     * @return
     */
    public Knoten getSuccessor() {
        return this.successor;
    }

    /**
     *
     * @param knoten
     */
    public void setSuccessor(Knoten knoten) {
        this.successor = knoten;
    }

    /**
     *
     * @param knoten
     */
    public void setPredessor(Knoten knoten) {
        this.predessor = knoten;
    }

    /**
     *
     * @return
     */
    public int getStartNr() {
        return this.startNr;
    }

    /**
     *
     * @return
     */
    public int getKategorie() {
        return this.kategorie;
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

}
