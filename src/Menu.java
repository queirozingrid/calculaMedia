import java.util.Scanner;

public class Menu {
    public void escolher(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int opcao;

        System.out.println("******************** MENU *******************");
        System.out.println("Qual destes é você?");
        System.out.println("[1] Professor");
        System.out.println("[2] Aluno");
        System.out.println("[3] Sair");

        opcao = scan.nextInt();

        if(opcao==1){
            Professor professor = new Professor();
            professor.escolher();
        }
        else if (opcao==2){
            System.out.println("Digite seu nome");
            String nome = scan2.nextLine();

            System.out.println("Digite sua matrícula");
            int matricula = scan.nextInt();

            CadastroUser cadastro = new CadastroUser();
            cadastro.getList();
            System.out.println(cadastro.getList().get(1));

        }
    }
}
