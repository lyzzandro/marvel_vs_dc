import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String heroisMarvel[] = { "Homem Aranha", "Capitao America", "Homem de Ferro", "Hulk", "Doutor Estranho" };
        int forcaHeroisMarvel[] = { 100, 100, 150, 300, 50 };

        String heroisDC[] = { "Super Man", "Mulher Maravilha", "Aquaman", "Batman", "Flash" };
        int forcaHeroisDC[] = { 300, 200, 100, 100, 50 };

        // imprimindo heróis antes da batalha
        System.out.println("NOME | FORCA");
        System.out.println("Imprimindo Todos os herois da Marvel");
        for (int i = 0; i < heroisMarvel.length; i++) {
            int v = i + 1;
            System.out.println(v + " | " + heroisMarvel[i] + " | " + forcaHeroisMarvel[i]);
        }

        System.out.println("");
        System.out.println("NOME | FORCA");
        System.out.println("Imprimindo Todos os herois da DC");
        for (int i = 0; i < heroisDC.length; i++) {
            int v = i + 1;
            System.out.println(v + " | " + heroisDC[i] + " | " + forcaHeroisDC[i]);
        }

        boolean entrada = true;
        while (entrada == true) {

            // Informando dois heróis que irão lutar

            Scanner input = new Scanner(System.in);

            System.out.print("Informe o numero de um heroi da Marvel: ");
            int marvel = input.nextInt() - 1;

            System.out.print("Informe o numero de um heroi da DC: ");
            int dc = input.nextInt() - 1;

            // Lógica para descobrir vencedor
            if (forcaHeroisMarvel[marvel] < forcaHeroisDC[dc]) {
                heroisMarvel[marvel] = "Is dead";
                forcaHeroisMarvel[marvel] = 0;
            } else {
                heroisDC[dc] = "Is dead";
                forcaHeroisDC[dc] = 0;
            }

            // Switch de opcao para continuar a batalha
            System.out.print("Digite 'c' para continuar a batalha ou 'p' para parar: ");
            String opcao = input.next();

            switch (opcao) {
                case "c":
                    entrada = true;
                    break;

                case "p":
                    entrada = false;
                    input.close();
                    break;

                default:
                    break;
            }

        }

        // imprimindo heróis depois da batalha
        System.out.println("NOME | FORCA");
        System.out.println("Imprimindo Todos os herois da Marvel");
        for (int i = 0; i < heroisMarvel.length; i++) {
            System.out.println(heroisMarvel[i] + " | " + forcaHeroisMarvel[i]);
        }

        System.out.println("");
        System.out.println("NOME | FORCA");
        System.out.println("Imprimindo Todos os herois da DC");
        for (int i = 0; i < heroisDC.length; i++) {
            System.out.println(heroisDC[i] + " | " + forcaHeroisDC[i]);
        }
    }
    // usado para implementacão futura para imprimir vetores
    // public static void imprimirHeroisMarvel(String heroisMarvel[], int
    // forcaHeroisMarvel[]) {
    // }
    // public static void imprimirHeroisDC(String heroisDC[], int forcaHeroisDC[]) {
    // }
}