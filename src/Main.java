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

        op.validaNota(nome);
    }

}
