package B05InterfaceAndAbstractClass.P6Examples.Example2;

public class Problem {

    public static class Matematik {

        public static void daireAlan (int yaricap) {
            System.out.println("Dairenin alanı : " + Math.PI * yaricap * yaricap);
        }

        public static void ucgeninCevresi (int k1 , int k2 , int k3) {
            System.out.println("Üçgenin çevresi :" + (k1+k2+k3));

        }


    }

    public static class Fizik {
        public static void icCarpim (Vektor v1 , Vektor v2) {
            System.out.println("Vectorel carpim : " + (v1.getI()*v2.getI() + v1.getJ()*v2.getJ() + v1.getK()*v2.getK() ));
        }

    }

}
