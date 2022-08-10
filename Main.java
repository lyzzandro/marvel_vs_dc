import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner heroi = new Scanner(System.in);
        int numeroHeroi;

        System.out.println(
                "---------------------------------------\n Escolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "---------------------------------------\n Batman - 1\n Homem Aranha - 2\n Homem de Ferro - 3\n Mulher Maravilha - 4\n Thor - 5\n Superman - 6\n Hulk - 7\n Flash - 8\n ---------------------------------------\n");

        System.out.printf("Informe um numero:\n");
        numeroHeroi = heroi.nextInt();

        switch (numeroHeroi) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;

            default:
                System.out.println("Numero informado invalido");
                break;
        }

    }

}
