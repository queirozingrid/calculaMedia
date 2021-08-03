import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUser {

    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professors = new ArrayList<>();

    public void cadastrar(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Você é:");
        System.out.println("[1] Professor");
        System.out.println("[2] Aluno");
        System.out.println("[3] Cancelar");

        int opcao = scan.nextInt();

        System.out.println("Digite seu nome");
        String nome = scan2.nextLine();

        System.out.println("Digite seu numero de matricula");
        int matricula = scan.nextInt();

        if(opcao==1){
            Aluno aluno = new Aluno();
            aluno.setNomne(nome);
            aluno.setMatricula(matricula);
            alunos.add(aluno);
        }
        else if(opcao==2){
            Professor professor = new Professor();
            professor.setNomne(nome);
            professor.setMatricula(matricula);
            professors.add(professor);
        }
        Menu menu = new Menu();
        menu.escolher();

    }

    public List<Aluno> getList(){
        return(alunos);
    }
}
