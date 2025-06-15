public class Main {
    public static void main(String[] args) {
        for (int c = -80; c <= 80; c += 10) {
            double f = ( 9.0 / 5.0 ) * c + 32;
            System.out.println(c + "ºC = " + f + "ºF");
        }
    }
}