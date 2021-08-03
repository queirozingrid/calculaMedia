import java.util.Scanner;

public class Professor extends User{
    Scanner scan = new Scanner(System.in);

    public void inserirNota(){
        System.out.println("Digite o número de matrícula do aluno");
        int matricula = scan.nextInt();


    }

    public void escolher(){
        int opcao;

        System.out.println("Você deseja...");
        System.out.println("[1] Inserir nota");
        System.out.println("[2] Visualizar todas as informações dos alunos");
        System.out.println("[3] Sair");
        opcao = scan.nextInt();

        if(opcao==1){
            inserirNota();
        }
    }
}
