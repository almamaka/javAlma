public class Feladatok {
    //programozás gyakorlat 02. óra dokunetum feladatai

    private int alma = 10;

    public Feladatok() {
        hetedikFeladatEgy();
        hetedikFeladatKetto();
        hetedikFeladatHarom();
        hetedikFeladatNegy();
        hetedikFeladatOt();
        hetedikFeladatHat();
    }

    public void hetedikFeladatEgy() {
        System.out.println("1. feladat:");
        System.out.println(alma);
        System.out.println("alma");
    }

    public void hetedikFeladatKetto() {
        System.out.println("2. feladat:");
        System.out.println(alma * 2);
        System.out.println(alma + alma);
    }

    public void hetedikFeladatHarom() {
        System.out.println("3. feladat:");
        System.out.println(alma - 2);
        System.out.println(10 -2);
    }

    public void hetedikFeladatNegy() {
        System.out.println("4. feladat:");
        System.out.println(alma / 2);
    }

    public void hetedikFeladatOt() {
        System.out.println("5. feladat:");
        double almaNegyzet = Math.pow((Double.valueOf(alma)), 2);
        System.out.println(almaNegyzet);
        double haha = (double)alma - 0.5;
        System.out.println(haha);
    }

    public void hetedikFeladatHat() {
        System.out.println("6.feladat:");
        double maradek1 = alma % 2;
        double maradek2 = alma % 3;
        double maradek3 = alma % 5;
        System.out.println("A változónk 2-vel való osztási maradéka: " + maradek1);
        System.out.println("A változónk 3-mal való osztási maradéka: " + maradek2);
        System.out.println("A változónk 5-tel való osztási maradéka: " + maradek3);
    }

}
