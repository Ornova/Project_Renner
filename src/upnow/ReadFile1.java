package upnow;

import java.io.*;

/**
 * @author Julian Helfenstein
 * @author Christopher Hilfing
 * @author Christopf Bodschwinna
 * @author Daniel Blättler
 * @since 18.01.2018
 * @version 0.5
 * @depreceated false
 */
class ReadFile1 {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ReadFile1 prog = new ReadFile1();
        LinkedList neueListe = new LinkedList();
        prog.leseStartliste(neueListe);
        prog.leseMessresultat(neueListe);

        // Ausgabe der Linkliste
        neueListe.init();
        if (neueListe.getErsterKnoten().getMessresultat() != null) { // Nicht immer existiered
            System.out.print(neueListe.getErsterKnoten().getStartNr() + "\t");
            System.out.print(neueListe.getErsterKnoten().getKategorie() + "\t");
            System.out.print(neueListe.getErsterKnoten().getName() + "\t");
            if (neueListe.getErsterKnoten().getVorname() != null) { // Nicht immer existierend
                System.out.print(neueListe.getErsterKnoten().getVorname() + "\t");
            }
            if (neueListe.getErsterKnoten().getMessresultat() != null) { // Nicht immer existierend
                System.out.print(neueListe.getErsterKnoten().getMessresultat());
            }
        }
        System.out.print("\n");
        while (neueListe.next() != null) {
            if (neueListe.getAktuellerKnoten().getMessresultat() != null) {
                System.out.print(neueListe.getAktuellerKnoten().getStartNr() + "\t");
                System.out.print(neueListe.getAktuellerKnoten().getKategorie() + "\t");
                System.out.print(neueListe.getAktuellerKnoten().getName() + "\t");
                if (neueListe.getAktuellerKnoten().getVorname() != null) {
                    System.out.print(neueListe.getAktuellerKnoten().getVorname() + "\t");
                }
                if (neueListe.getAktuellerKnoten().getMessresultat() != null) {
                    System.out.print(neueListe.getAktuellerKnoten().getMessresultat());
                }
                System.out.print("\n");
            }
        }

    }

    /**
     *
     * @param neueListe
     */
    public void leseStartliste(LinkedList neueListe) {
        FileReader fr = null;
        try {
            fr = new FileReader("src/upnow/ressources/startliste.txt"); // Je nach Dektop neuen Path setzen
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        ReadFile1 read = new ReadFile1();
        String zeile1 = " ";
        boolean listeGehtWeiter = true;
        String info = "";

        int start_Nr;
        int kategorie;
        String name;
        String vorname_zahl = "";

        boolean hatvornamen = false;
        // Sachen wegen verkettete Liste

        // liest komplette Startliste ein
        while (listeGehtWeiter == true) {
            hatvornamen = false;
            try {
                zeile1 = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (zeile1 == null) {
                // wenn es keinen eintrag gibt
                listeGehtWeiter = false;
            } else {
                // wenn es einen eintrag gibt
                // entfernt die ersten Leerzeichen
                for (int i = 0; i < 2; i++) {
                    char einchar = zeile1.charAt(0);
                    if (einchar == ' ') {
                        zeile1 = zeile1.substring(1, zeile1.length());
                    }
                }

                // wählt ersten info aus (Start NR )
                char einchar = zeile1.charAt(1);
                if (einchar == '\t') {
                    info = zeile1.substring(0, 1);
                    zeile1 = zeile1.substring(2, zeile1.length());
                } else {
                    einchar = zeile1.charAt(2);
                    if (einchar == '\t') {
                        info = zeile1.substring(0, 2);
                        zeile1 = zeile1.substring(3, zeile1.length());
                    } else {
                        einchar = zeile1.charAt(3);
                        if (einchar == '\t') {
                            info = zeile1.substring(0, 3);
                            zeile1 = zeile1.substring(4, zeile1.length());
                        }
                    }
                }

                // speichert ersten info (Start NR )
                start_Nr = Integer.parseInt(info);

                // wählt zweite info aus und speichert sie (kategorie)
                info = zeile1.substring(0, 1);
                kategorie = Integer.parseInt(info);
                zeile1 = zeile1.substring(2, zeile1.length());

                // wählt dritte info aus (Namen) und speichert ihn
                int tabIndex = zeile1.indexOf("\t");
                if (tabIndex != -1) {
                    info = zeile1.substring(0, tabIndex);
                    name = info;
                    zeile1 = zeile1.substring(tabIndex + 1, zeile1.length());
                    hatvornamen = true;
                } else {
                    name = zeile1;
                }

                // speichert vornamen / zahl
                if (hatvornamen == true) {
                    vorname_zahl = zeile1;

                } else {
                    vorname_zahl = "";
                }

                // kreiert neues objekt
                neueListe.insert(start_Nr, kategorie, name, vorname_zahl, null);

                // System.out.println(start_Nr +"\t"+kategorie +"\t"+name +"\t"+vorname_zahl);
            }
        }

        try {
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        neueListe.init();
    }

    /**
     *
     * @param neueListe
     */
    public void leseMessresultat(LinkedList neueListe) {
        FileReader fr2 = null;
        try {
            fr2 = new FileReader("src/upnow/ressources/messresultate.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader br2 = new BufferedReader(fr2);
        ReadFile1 read = new ReadFile1();
        String zeile1 = " ";
        boolean listeGehtWeiter = true;
        String info = "";

        int start_Nr2;
        String laufzeit;

        listeGehtWeiter = true;
        // liest komplette Messresultat ein
        while (listeGehtWeiter == true) {
            try {
                zeile1 = br2.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (zeile1 == null) {
                // wenn es keinen eintrag gibt
                listeGehtWeiter = false;
            } else {
                // wenn es einen eintrag gibt
                // entfernt die ersten Leerzeichen
                for (int i = 0; i < 2; i++) {
                    char einchar = zeile1.charAt(0);
                    if (einchar == ' ') {
                        zeile1 = zeile1.substring(1, zeile1.length());
                    }
                }
                // ausw�hlen und speichern von start_Nr + laufzeit
                int tabIndex = zeile1.indexOf(" ");
                info = zeile1.substring(0, tabIndex);
                start_Nr2 = Integer.parseInt(info);
                laufzeit = zeile1.substring(tabIndex + 1, zeile1.length());
                // ausgabe aller daten der messresultat Liste

                // kreiert neues objekt
                /*
                 * hier eingeben
                 */
                neueListe.init();
                if (neueListe.getErsterKnoten().getStartNr() == start_Nr2) {
                    neueListe.insert(neueListe.getErsterKnoten().getStartNr(), neueListe.getErsterKnoten().getKategorie(),
                            neueListe.getErsterKnoten().getName(), neueListe.getErsterKnoten().getVorname(), laufzeit);
                }

                while (neueListe.next() != null) {

                    if (neueListe.getAktuellerKnoten().getStartNr() == start_Nr2) {
                        neueListe.insert(neueListe.getAktuellerKnoten().getStartNr(),
                                neueListe.getAktuellerKnoten().getKategorie(), neueListe.getAktuellerKnoten().getName(),
                                neueListe.getAktuellerKnoten().getVorname(), laufzeit);
                    }
                }
            }
        }

        try {
            br2.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        neueListe.init();
    }
}
