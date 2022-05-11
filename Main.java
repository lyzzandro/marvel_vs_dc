class Main {
    public static void main(String[] args) {;
        String heroisMarvel[] = {"Homem Aranha", "Capitão América", "Homem de Ferro", "Hulk", "Doutor Estranho"};
        int forcaHeroisMarvel[] = {100, 100, 50, 300, 50};

        String heroisDC[] = {"Super Man", "Mulher Maravilha", "Aquaman", "Batman", "Flash"};
        int forcaHeroisDC[] = {300, 200, 100, 100, 50};

        System.out.println("NOME | FORCA");
        System.out.println("Imprimindo Todos os herois da Marvel");
        for(int i = 0; i < heroisMarvel.length; i++){
            System.out.println(heroisMarvel[i] + " | " + forcaHeroisMarvel[i]);
        };

        System.out.println("");
        System.out.println("Imprimindo Todos os herois da DC");
        for(int i = 0; i < heroisDC.length; i++){
            System.out.println(heroisDC[i] + " | " + forcaHeroisDC[i]);
        };
    }
}