import java.util.Scanner;

import dc.Batman;
import dc.Flash;
import dc.MulherMaravilha;
import dc.Superman;
import generics.Batalha;
import generics.Personagem;
import marvel.HomemDeFerro;
import marvel.HomemAranha;
import marvel.Hulk;
import marvel.Thor;

public class Main {

    public static void main(String[] args) {
        /* Criando vetor para adicionar os personagens */
        Personagem herois[] = new Personagem[2];

        /* Abrindo um novo scanner e mostrando lista e personagens */
        Scanner heroi1 = new Scanner(System.in);
        int numeroHeroi1;
        System.out.println(
                "---------------------------------------\n Escolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "---------------------------------------\n Batman - 1\n Homem Aranha - 2\n Homem de Ferro - 3\n Mulher Maravilha - 4\n Thor - 5\n Superman - 6\n Hulk - 7\n Flash - 8\n ---------------------------------------\n");

        System.out.printf("Informe um numero:\n");
        numeroHeroi1 = heroi1.nextInt();

        /*
         * Instanciando Heroi e adicionando no vetor(posicao 0), de acordo com o heroi
         * informado no scanner
         */
        switch (numeroHeroi1) {
            case 1:
                Personagem batman = new Batman(100, 1000);
                herois[0] = batman;
                System.out.println(herois[0].toString());
                break;
            case 2:
                Personagem homemAranha = new HomemAranha(120, 900);
                herois[0] = homemAranha;
                System.out.println(herois[0].toString());
                break;
            case 3:
                Personagem homemDeFerro = new HomemDeFerro(100, 1200);
                herois[0] = homemDeFerro;
                System.out.println(herois[0].toString());
                break;
            case 4:
                Personagem mulherMaravilha = new MulherMaravilha(180, 1000);
                herois[0] = mulherMaravilha;
                System.out.println(herois[0].toString());
                break;
            case 5:
                Personagem thor = new Thor(150, 1100);
                herois[0] = thor;
                System.out.println(herois[0].toString());
                break;
            case 6:
                Personagem superman = new Superman(150, 1200);
                herois[0] = superman;
                System.out.println(herois[0].toString());
                break;
            case 7:
                Personagem hulk = new Hulk(180, 1200);
                herois[0] = hulk;
                System.out.println(herois[0].toString());
                break;
            case 8:
                Personagem flash = new Flash(90, 1000);
                herois[0] = flash;
                System.out.println(herois[0].toString());
                break;

            default:
                System.out.println("Numero informado invalido");
                break;

        }

        /* Abrindo um novo scanner e mostrando lista e personagens */
        Scanner heroi2 = new Scanner(System.in);

        int numeroHeroi2;
        System.out.println(
                "---------------------------------------\n Escolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "---------------------------------------\n Batman - 1\n Homem Aranha - 2\n Homem de Ferro - 3\n Mulher Maravilha - 4\n Thor - 5\n Superman - 6\n Hulk - 7\n Flash - 8\n ---------------------------------------\n");

        System.out.printf("Informe um numero:\n");
        numeroHeroi2 = heroi2.nextInt();

        /*
         * Instanciando Heroi e adicionando no vetor(posicao 0), de acordo com o heroi
         * informado no scanner
         */
        switch (numeroHeroi2) {
            case 1:
                Personagem batman = new Batman(100, 1000);
                herois[1] = batman;
                System.out.println(herois[1].toString());
                break;
            case 2:
                Personagem homemAranha = new HomemAranha(120, 900);
                herois[1] = homemAranha;
                System.out.println(herois[1].toString());
                break;
            case 3:
                Personagem homemDeFerro = new HomemDeFerro(100, 1200);
                herois[1] = homemDeFerro;
                System.out.println(herois[1].toString());
                break;
            case 4:
                Personagem mulherMaravilha = new MulherMaravilha(180, 1000);
                herois[1] = mulherMaravilha;
                System.out.println(herois[1].toString());
                break;
            case 5:
                Personagem thor = new Thor(150, 1100);
                herois[1] = thor;
                System.out.println(herois[1].toString());
                break;
            case 6:
                Personagem superman = new Superman(150, 1200);
                herois[1] = superman;
                System.out.println(herois[1].toString());
                break;
            case 7:
                Personagem hulk = new Hulk(180, 1200);
                herois[1] = hulk;
                System.out.println(herois[1].toString());
                break;
            case 8:
                Personagem flash = new Flash(90, 1000);
                herois[1] = flash;
                System.out.println(herois[1].toString());
                break;

            default:
                System.out.println("Numero informado invalido");
                break;

        }

        System.out.println("--------------------------------------------------");

        System.out.println("Heroi 1 eh o/a " + herois[0].toString() + " e o heroi 2 eh o/a " + herois[1].toString());

        Batalha.batalhar(herois[0], herois[1]);

        heroi1.close();
        heroi2.close();

    }
}
