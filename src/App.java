import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // capitulo 1
        String nomeCapitulo1 = "O sonho sombrio";
        String textoCapitulo1 = "Olá Jof sou o Vett, você está dentro de um sonho sombrio. Você deseja acordar desse sonho?  "
                +
                "\n" + "Para acordar basta tomar a pilula roxa e você voltará a realidade." +
                "\n" + "Para continuar no sonho e ver onde isso vai dar, tome a pilula vermelha.";
        String escolha1Capitulo1 = "roxa";
        String escolha2Capitulo1 = "vermelha";

        System.out.println(". . .");
        System.out.println(nomeCapitulo1);
        System.out.println("- - - - - - - - -");
        System.out.println(textoCapitulo1);
        System.out.println(" - " + escolha1Capitulo1);
        System.out.println(" - " + escolha2Capitulo1);

        Scanner escaneador = new Scanner(System.in);
        String escolha = escaneador.nextLine();

        if (escolha.equals(escolha1Capitulo1)) {
            // capitulo 2
            String nomeCapitulo2 = "O fim do pesadelo.";
            String textoCapitulo2 = "Ao escolher a pilula roxa Jof acordou na sua cama sem entender nada." +
                    "\n" + "Logo quando percebeu que era apenas um sonho respirou fundo e ficou calmo." +
                    "\n"
                    + "Após isso se levantou e foi fazer suas taferas do dia totalmente tranquilo após acordar e perceber que tudo não passava apenas de um sonho!"
                    +
                    "\n" + "FIM.";

            System.out.println(". . . . . ");
            System.out.println(nomeCapitulo2);
            System.out.println("- - - - - - - - ");
            System.out.print(textoCapitulo2);
        }

        else if (escolha.equals(escolha2Capitulo1)) {
            // capitulo 3 // fim
            String nomeCapitulo3 = "O final do final.";
            String textoCapitulo3 = " Jof caminhava por uma floresta, quando de repente avistou uma entrada, era uma caverna."
                    +
                    "\n"
                    + "Jof ficou bastante curioso, e foi olhar mais de perte, assim que ele chega na entrada da caverna ele logo avista milhares de morcegos."
                    +
                    "\n" + "E então ele fica muito tenso, pois Jof tem pavor de morcegos!" +
                    "\n"
                    + "Jof logo pensa em ir embora, mas quando tenta sair de fininho ele escorrega em uma rocha e cai, fazendo muito barulho"
                    +
                    "\n"
                    + "Logo os morcegos acordam e saem voando da caverna, Jof deitado ficou apavorado, mas logo depois ele acorda super assustado "
                    +
                    "\n"
                    + "e assim que ele percebe que era apenas um pesadelo, ele respira fundo e se acalma, mas Jof está muito medo de dormir de novo."
                    +
                    "\n" + "Fim.";

            System.out.println(nomeCapitulo3);
            System.out.println(". . . . . .");
            System.out.println(textoCapitulo3);

            escaneador.close();

        }

    }
}