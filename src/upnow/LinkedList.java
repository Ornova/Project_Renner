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
public class LinkedList {

    // Variables
    private Knoten aktuellerKnoten = null;
    private Knoten letzterKnoten = null;
    private Knoten ersterKnoten = null;

    // Programm Code
    /**
     *
     * @param data
     * @param data2
     * @param data3
     * @param data4
     */
    public void insert(int data, int data2, String data3, String data4, String data5) {
        // 1.Fall: Die Liste ist leer
        if (aktuellerKnoten == null) {
            aktuellerKnoten = new Knoten(null, null, data, data2, data3, data4, data5);
            ersterKnoten = aktuellerKnoten;
        } else {
            // 2.Fall Wir h�ngen einen Knoten hinten an
            if (aktuellerKnoten.getSuccessor() == null) {
                aktuellerKnoten.setSuccessor(new Knoten(null, aktuellerKnoten, data, data2, data3, data4, data5));
                letzterKnoten = aktuellerKnoten.getSuccessor();
                aktuellerKnoten = letzterKnoten;
            } else {
                // 3.Fall Wir f�gen eine Knoten zwischen zwei existierenden
                // Knoten ein.
                Knoten tempSuccessor = aktuellerKnoten.getSuccessor();
                aktuellerKnoten.setSuccessor(new Knoten(tempSuccessor, aktuellerKnoten, data, data2, data3, data4, data5));
                tempSuccessor.setPredessor(aktuellerKnoten.getSuccessor());
                aktuellerKnoten = aktuellerKnoten.getSuccessor();
            }
        }
    }

    /**
     *
     * @return
     */
    public Knoten next() {
        if (aktuellerKnoten.getSuccessor() != null) {
            aktuellerKnoten = aktuellerKnoten.getSuccessor();
            return aktuellerKnoten;
        } else {
            return null;
        }
    }

    /**
     *
     * @return
     */
    public Knoten getErsterKnoten() {
        return ersterKnoten;
    }

    /**
     *
     */
    public void init() {
        aktuellerKnoten = ersterKnoten;
    }

    /**
     *
     * @return
     */
    public Knoten getAktuellerKnoten() {
        return aktuellerKnoten;
    }
}
