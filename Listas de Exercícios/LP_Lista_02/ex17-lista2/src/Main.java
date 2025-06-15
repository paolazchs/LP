import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        System. out. println("Informe a velocidade inicial: ");
        double vI = scanner . nextDouble () ;
        System.out.println("Informe a aceleração: ");
        double aceleracao = scanner. nextDouble() ;
        System. out. println("Informe tempo de percurso: ");
        double tempo = scanner . nextDouble ();

        double Velocidade = vI + aceleracao * tempo;
        System.out.println("A velocidade é : " + Velocidade) ;
    }
}