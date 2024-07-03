import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.err.println(e.getMessage());

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O parâmetro dois deve ser maior que o parâmetro um");
        }

        int contagem = parametroDois - parametroUm;
        for (int base = 0; base <= contagem; base++) {
            System.out.println("Imprimindo número " + (parametroUm + base));

        }
    }
}