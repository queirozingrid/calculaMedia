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
        for (i = 0; i < nome.length(); i++) {
            if(Character.isDigit(nome.charAt(i))) {
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

}
