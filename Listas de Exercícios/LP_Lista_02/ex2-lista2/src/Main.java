import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        System. out.print ("Digite qualquer número: ");
        int num = scanner.nextInt() ;

        System.out.println("0 quadrado do número informado é:" + (num * num) ) ;
    }
}