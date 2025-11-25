import java.util.Scanner;  // Importa o Scanner para ler entrada do teclado

public class SenhaCorreta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria o leitor de entrada

    // Usuário e senha fixos  
    String usuarioCorreto = "Denis"; 
    String senhaCorreta = "1234";

    // Variáveis que vão guardar o que o usuário digitar
    String usuarioDigitado;
    String senhaDigitada;

    // Repete enquanto o usuário OU a senha estiverem errados
    do{
        System.out.println("Digite o usuario: ");
        usuarioDigitado = input.nextLine();


        System.out.println("Digite a senha: ");
        senhaDigitada = input.nextLine();

        // Verifica se o usuário ou a senha estão incorretos
        if (!usuarioDigitado.equals(usuarioCorreto) || !senhaDigitada.equals(senhaCorreta)) {
           System.out.println("Usuário ou senha incorretos. Tente novamente.");

            
        }

     // Continua repetindo enquanto o usuário OU a senha estiverem incorretos
    } while (!usuarioDigitado.equals(usuarioCorreto) || !senhaDigitada.equals(senhaCorreta));
    

     // Se sair do laço, é porque ambos estão corretos
    System.out.println("Acesso Liberado");

    input.close(); // Fecha o scanner

    }
}