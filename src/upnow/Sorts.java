package upnow;

/**
 * @author Julian Helfenstein
 * @since 24.01.2018
 * @version 0.1
 * @depreceated false
 */
public class Sorts {

    int choose;

    public Sorts(int choose) {
        this.choose = choose;
    }

    public void chosen() {
        if (choose == 0) {
            sortByName();
        } else if (choose == 1) {
            sortByTime();
        }
    }

    public void sortByName() { // choose 0

    }

    public void sortByTime() { // choose 1

    }
}
