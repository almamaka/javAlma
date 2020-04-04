import java.util.Arrays;

public class DVD extends Film {

    private String [] nyelvek;

    public String[] getNyelvek() {
        return nyelvek;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nyelvek=" + Arrays.toString(nyelvek) +
                '}';
    }
}
