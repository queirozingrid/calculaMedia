import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("Já tem cadastro?");
        System.out.println("[1] Para 'sim, já tenho'");
        System.out.println("[2] Para 'não, não tenho'");
        System.out.println("[3] Cancelar");

        opcao = scan.nextInt();

        if(opcao==1){
            Menu menu = new Menu();
            menu.escolher();
        }
        if(opcao==2){
            CadastroUser cadastro = new CadastroUser();
            cadastro.cadastrar();
        }
    }
}
