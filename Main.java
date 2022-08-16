import java.util.Scanner;

import dc.Batman;
import dc.Flash;
import dc.MulherMaravilha;
import dc.Superman;
import marvel.HomeDeFerro;
import marvel.HomemAranha;
import marvel.Hulk;
import marvel.Thor;

public class Main {

    public static void main(String[] args) {
        Object herois[] = new Object[2];

        Scanner heroi1 = new Scanner(System.in);
        int numeroHeroi1;
        System.out.println(
                "---------------------------------------\n Escolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "---------------------------------------\n Batman - 1\n Homem Aranha - 2\n Homem de Ferro - 3\n Mulher Maravilha - 4\n Thor - 5\n Superman - 6\n Hulk - 7\n Flash - 8\n ---------------------------------------\n");

        System.out.printf("Informe um numero:\n");
        numeroHeroi1 = heroi1.nextInt();

        switch (numeroHeroi1) {
            case 1:
                Batman batman = new Batman();
                herois[0] = batman;
                System.out.println(herois[0].toString());
                break;
            case 2:
                HomemAranha homemAranha = new HomemAranha();
                herois[0] = homemAranha;
                System.out.println(herois[0].toString());
                break;
            case 3:
                HomeDeFerro homeDeFerro = new HomeDeFerro();
                herois[0] = homeDeFerro;
                System.out.println(herois[0].toString());
                break;
            case 4:
                MulherMaravilha mulherMaravilha = new MulherMaravilha();
                herois[0] = mulherMaravilha;
                System.out.println(herois[0].toString());
                break;
            case 5:
                Thor thor = new Thor();
                herois[0] = thor;
                System.out.println(herois[0].toString());
                break;
            case 6:
                Superman superman = new Superman();
                herois[0] = superman;
                System.out.println(herois[0].toString());
                break;
            case 7:
                Hulk hulk = new Hulk();
                herois[0] = hulk;
                System.out.println(herois[0].toString());
                break;
            case 8:
                Flash flash = new Flash();
                herois[0] = flash;
                System.out.println(herois[0].toString());
                break;

            default:
                System.out.println("Numero informado invalido");
                break;

        }

        Scanner heroi2 = new Scanner(System.in);
        int numeroHeroi2;
        System.out.println(
                "---------------------------------------\n Escolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "---------------------------------------\n Batman - 1\n Homem Aranha - 2\n Homem de Ferro - 3\n Mulher Maravilha - 4\n Thor - 5\n Superman - 6\n Hulk - 7\n Flash - 8\n ---------------------------------------\n");

        System.out.printf("Informe um numero:\n");
        numeroHeroi2 = heroi2.nextInt();

        switch (numeroHeroi2) {
            case 1:
                Batman batman = new Batman();
                herois[1] = batman;
                System.out.println(herois[1].toString());
                break;
            case 2:
                HomemAranha homemAranha = new HomemAranha();
                herois[1] = homemAranha;
                System.out.println(herois[1].toString());
                break;
            case 3:
                HomeDeFerro homeDeFerro = new HomeDeFerro();
                herois[1] = homeDeFerro;
                System.out.println(herois[1].toString());
                break;
            case 4:
                MulherMaravilha mulherMaravilha = new MulherMaravilha();
                herois[1] = mulherMaravilha;
                System.out.println(herois[1].toString());
                break;
            case 5:
                Thor thor = new Thor();
                herois[1] = thor;
                System.out.println(herois[1].toString());
                break;
            case 6:
                Superman superman = new Superman();
                herois[1] = superman;
                System.out.println(herois[1].toString());
                break;
            case 7:
                Hulk hulk = new Hulk();
                herois[1] = hulk;
                System.out.println(herois[1].toString());
                break;
            case 8:
                Flash flash = new Flash();
                herois[1] = flash;
                System.out.println(herois[1].toString());
                break;

            default:
                System.out.println("Numero informado invalido");
                break;

        }

        System.out.println("Heroi 1 eh o/a " + herois[0].toString() + " e o heroi 2 eh o/a " + herois[1].toString());

    }
}
