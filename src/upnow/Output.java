package upnow;

import java.io.File;

/**
 * @author Julian Helfenstein
 * @author Christopher Hilfing
 * @author Christoph Bodschwinna
 * @author Daniel Blättler
 * @since 24.01.2018
 * @version 0.1
 * @depreceated false
 */
public class Output {

    /**
     *
     */
    public void createFile() {

        if (("src/upnow/output/frauen.txt").equals(this)) {
            File frauen = new File("src/upnow/output/frauen.txt");
        }

        if (("src/upnow/output/maenner.txt").equals(this)) {
            File maenner = new File("src/upnow/output/maenner.txt");
        }

        if (("src/upnow/output/profi.txt").equals(this)) {
            File profi = new File("src/upnow/output/profi.txt");
        }

        if (("src/upnow/output/namen.txt").equals(this)) {
            File namen = new File("src/upnow/output/namen.txt");
        }
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param messresultat
     * @param name
     * @param vorname
     */
    public void outputFrauen(int startNr, int kategorie, String messresultat, String name, String vorname) {
        if (kategorie == 1) {
            Sorts sort = new Sorts(1);

        }
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param messresultat
     * @param name
     * @param vorname
     */
    public void outputMaenner(int startNr, int kategorie, String messresultat, String name, String vorname) {
        if (kategorie == 2) {
            Sorts sort = new Sorts(1);

        }
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param messresultat
     * @param name
     * @param vorname
     */
    public void outputProfi(int startNr, int kategorie, String messresultat, String name, String vorname) {
        if (kategorie == 3) {
            Sorts sort = new Sorts(1);

        }
    }

    /**
     *
     * @param startNr
     * @param kategorie
     * @param messresultat
     * @param name
     * @param vorname
     */
    public void outputNamen(int startNr, int kategorie, String messresultat, String name, String vorname) {
        Sorts sort = new Sorts(0);
    }
}
