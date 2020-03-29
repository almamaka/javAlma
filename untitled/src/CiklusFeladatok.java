import java.util.Scanner;

public class CiklusFeladatok {
    //ciklusos feladatok Programozás gyakorlat 08. óra

    private int bekertSzam;
    private Scanner sc;
    private int szorzatEredmeny = 1;

    public CiklusFeladatok() {
        elsoFeladatok();
    }

    public void elsoFeladatok() {
        System.out.println("Kérlek adj meg egy egész számot!");
        sc = new Scanner(System.in);
        bekertSzam = sc.nextInt();
        while (bekertSzam != 0) {
            szorzatEredmeny = szorzatEredmeny * bekertSzam;
            System.out.println("A szorzat: " + szorzatEredmeny);
            System.out.println("Kérlek adj meg egy egész számot!");
            sc = new Scanner(System.in);
            bekertSzam = sc.nextInt();
        }
        System.out.println("Nullát adtál meg!");
    }

    public void masodikFeladat() {

    }

}
