import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }

    }
    private static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; contagem >= i; i ++) {
            System.out.println(i);
        }

    }

    private static class ParametrosInvalidosException extends RuntimeException {
        public ParametrosInvalidosException(String msg) {
            super(msg);
        }

    }

}
