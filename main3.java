import java.util.Scanner;

public class main3 {
    public static void main(String[] args ) {
        double n,r,nFaktoriyel = 1,rFaktoriyel=1,n_rFaktoriyel = 1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kisi sayisi giriniz : ");
        n = inp.nextInt();
        System.out.print("Secilecek kisi sayisi giriniz : ");
        r = inp.nextInt();

        for(int i=1;i<=n;i++){
            nFaktoriyel=i*nFaktoriyel;
        }
        for (int i = 1;i<=r;i++){
            rFaktoriyel=i*rFaktoriyel;
        }

        for (int i = 1;i<=n-r;i++){
            n_rFaktoriyel=i*n_rFaktoriyel;
        }

        System.out.println("Kombinasyonu: " + nFaktoriyel/(rFaktoriyel * n_rFaktoriyel));

    }
}
