import java.util.*;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            validarParametros(numero1, numero2);
            contarNumeros(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validarParametros(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    private static void contarNumeros(int numero1, int numero2) {
        for (int i = numero1; i <= numero2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
