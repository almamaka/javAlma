public class Film {

    private String cim;
    private int korhatar;

    public String getCim() {
        return cim;
    }

    public int getKorhatar() {
        return korhatar;
    }

    public boolean getAjanlott(int kor) {
        return kor >= korhatar ? true : false;
    }

    @Override
    public String toString() {
        return "Film{" +
                "cim='" + cim + '\'' +
                ", korhatar=" + korhatar +
                '}';
    }
}
