import java.util.Scanner;

public class LerPalavra {
    public static void verificandoPalavra() {
                
        Scanner scan = new Scanner(System.in);
        int estado = 0;
        System.out.printf("Digitar palavra-> ");
        String palavra = scan.nextLine(); // variavel para efetuar os teste, com mudanças de palavbras
        System.out.println("");

        for (int i = 0; i < palavra.length(); i++){

            if (estado == 0){
                if (palavra.charAt(i) == 'a'){
                    estado = 0;
                }else if(palavra.charAt(i) == 'b'){
                    estado = 1;
                }else{
                    System.out.println("caractere não aceito");
                    break;
                }
                 
            }

            else if (estado == 1) {
                
                if (palavra.charAt(i) == 'b'){
                    estado = 2;
                }else{
                    System.out.println("caractere não aceito");
                    break;
                } 
            }

            else if (estado == 2) {

                if (palavra.charAt(i) == 'c'){
                    estado = 1;
                }else{
                    System.out.println("caractere não aceito");
                break;
                } 
            }
        
        }
        if (estado == 2) 
            System.out.println("Palavra aceita");
        else 
            System.out.println("Palavra não aceita");
        scan.close();
    }        
}
