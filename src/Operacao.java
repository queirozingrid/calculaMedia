public class Operacao {
    public boolean calculaMedia(double n1, double n2){
        double media = ((n1*2)+(n2*3))/5;

        if(media>=4 && media <6){
            System.out.println("Reprovado, vai para final");
            return false;

        }
        else if(media>6){
            System.out.println("Aprovado! Boas férias!!!");
            return true;
        }
        else{
            System.out.println("Reprovado, sem direito de ir para final");
            return false;
        }

    }
}
