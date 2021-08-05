import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        Operacao op = new Operacao();
        boolean validaNome;

        do{
            System.out.println("Digite seu nome");
            nome = scan.nextLine();
            validaNome = op.validaNome(nome);
        } while (!validaNome);



        System.out.println("Digite sua N1: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite sua N2: ");
        double n2 = scan.nextDouble();

        Menu menu = new Menu();
        menu.escolher(nome, n1, n2);
    }


}
