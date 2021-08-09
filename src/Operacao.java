import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operacao {
    public double calculaMedia(double n1, double n2) {
        double media = ((n1 * 2) + (n2 * 3)) / 5;
        return media;

    }

    public void retornaSituacao(double media) {
        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public boolean validaNome(String nome) {
        int i;
        int contNum = 0;

        if(nome.isEmpty() || nome.isBlank()){
            return false;
        }
        for (i = 0; i < nome.length(); i++) {
            if(Character.isDigit(nome.charAt(i)) || !Character.isAlphabetic(nome.charAt(i))) {
                contNum++;
            }
        }
        if(contNum>0){
            System.out.println("Digite apenas letras!!");
            return false;
        }
        else {
            return true;
        }
    }
    public void validaNota(String nome){
        double n1 = 0, n2 = 0;
        double nota;
        int i = 0;

        while(i<2){
            System.out.println("Digite sua N" + (i+1));
            try{
                Scanner scan = new Scanner(System.in);
                nota = scan.nextDouble();
                if(nota > 10 || nota<0){
                    System.out.println("Digite apenas números entre 0 e 10!!!");
                    System.out.println("Vamos do começo!!");
                    i=0;
                }
                else {
                    if(i==0){
                        n1 = nota;
                    }
                    else {
                        n2 = nota;
                    }
                    i++;
                }

            } catch (InputMismatchException e){
                System.out.println("Digite apenas números!");
                i = 0;
            }
        }
        Menu menu = new Menu();
        menu.escolher(nome, n1, n2);
    }

}
