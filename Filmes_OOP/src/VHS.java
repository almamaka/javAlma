public class VHS extends Film {

    private int szalagHossz;

    public int getSzalagHossz() {
        return szalagHossz;
    }

    @Override
    public String toString() {
        return "VHS{" +
                "szalagHossz=" + szalagHossz +
                '}';
    }
}
