import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Escolha uma das opções abaixo: \n");
            System.out.println("1- para consultar um contato da agenda");
            System.out.println("2- para adicionar um contato na agenda");
            int opcao = scan.nextInt();

           if (opcao != 1 && opcao != 2) {
                throw new Exception("Entrada inválida. Por favor, digite 1 para consultar novo contato ou 2 para adicionar um contato.");
           }
        }
        catch (InputMismatchException dadoInvalido) {
            System.out.println("Informe uma opção válida! ");
            scan.nextLine();

                try {
                    System.out.println("Escolha uma das opções abaixo: \n");
                    System.out.println("1- para consultar um contato da agenda");
                    System.out.println("2- para adicionar um contato na agenda");
                    int opcao = scan.nextInt();
                    while (true) {
                        if (opcao == 1 || opcao == 2) {
                            System.exit(0);
                        } else {
                            System.out.println("Escolha uma das opções abaixo: \n");
                            System.out.println("1- para consultar um contato da agenda");
                            System.out.println("2- para adicionar um contato na agenda");
                            opcao = scan.nextInt();
                            throw new IllegalArgumentException("Entrada inválida. Por favor, digite 1 ou 2.");

                        }
                    }
                }
                catch (InputMismatchException e) {
                    scan.nextLine(); // Limpa a entrada inválida
                    System.out.println("Erro: Informe uma opção válida!");
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }



        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
        }
        finally {
            scan.close();
        }
    }

}
