import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (parametrosinvalidos exception) {
            // Imprimir a mensagem da exceção
            System.out.println(exception.getMessage());
        } finally {
            terminal.close(); // Fecha o Scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws parametrosinvalidos {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new parametrosinvalidos("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realizar o for para imprimir os números com base na contagem
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
		
    }
}
;



