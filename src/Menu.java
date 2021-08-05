import java.util.Scanner;

public class Menu {
    public void escolher(String nome, double n1, double n2){
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("O que gostaria de fazer?");
        System.out.println("[1] Visualizar dados");
        System.out.println("[2] Calcular média");
        System.out.println("[3] Sair");
        opcao = scan.nextInt();
        Operacao op = new Operacao();
        double media = op.calculaMedia(n1, n2);

        if(opcao==1){
            System.out.println("******* DADOS *******");
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            op.retornaSituacao(media);
        }

        else if(opcao==2){
            System.out.println("Média: " + media);
        }
        else if(opcao==3){
            System.exit(0);
        }

    }
}
