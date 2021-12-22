/*Esse programa le um array unidimensional contendo 6 letras
identifica o número de letras digitadas e o número de consoantes
digitdas.
 */

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if
            ( ! letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u")){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;


        }while(count < consoantes.length);

        System.out.println("As consoantes digitadas foram: ");
        for ( String consoante : consoantes){
            if ( consoante != null)
                System.out.println(consoante + "");

        }
        System.out.println("A quantidade de consoantes digitadas é: " + quantidadeConsoantes);
        System.out.println("O número total de letras digitadas é: " + consoantes.length);

    }

}
