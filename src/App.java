import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("A CAVERNA DESCONHECIDA");

        PersonagemMini2 jof = new PersonagemMini2("jof", 100);
        PersonagemMini2 vett = new PersonagemMini2("vett", 100);

        // capitulo 1
        String nomeCapitulo1 = " O sonho sombrio";
        String textoCapitulo1 = " Olá Jof sou o Vett, você está dentro de um sonho sombrio. Você deseja acordar desse sonho? "
                +
                " Para acordar basta tomar a pilula roxa e você voltará a realidade." +
                " Para continuar no sonho e ver onde isso vai dar, tome a pilula vermelha.";

        String escolha1Capitulo1 = "roxa";
        String escolha2Capitulo1 = "vermelha";

        System.out.println("\n. . .\n");
        System.out.println(nomeCapitulo1);
        System.out.println("- - - - - - - - -");
        System.out.println(textoCapitulo1);
        System.out.println(" - " + escolha1Capitulo1);
        System.out.println(" - " + escolha2Capitulo1);

        Scanner escaneador = new Scanner(System.in);
        String escolha = escaneador.nextLine();

        if (escolha.equals(escolha1Capitulo1)) {
            // capitulo 2
            String nomeCapitulo2 = " O fim do pesadelo.";
            String textoCapitulo2 = " Ao escolher a pilula roxa Jof acordou na sua cama sem entender nada." +
                    " Logo quando percebeu que era apenas um sonho respirou fundo e ficou calmo." +
                    " Após isso se levantou e foi fazer suas taferas do dia totalmente tranquilo após acordar e perceber que tudo não passava apenas de um sonho!"
                    + "\n" +
                    "FIM.";

            System.out.println("\n. . . . .\n");
            System.out.println(nomeCapitulo2);
            System.out.println("- - - - - - - - ");
            System.out.print(textoCapitulo2);

        }

        else if (escolha.equals(escolha2Capitulo1)) {
            // capitulo 3
            String nomeCapitulo3 = "O FINAL DO SONHO SOMBRIO";
            String textoCapitulo3 = "Jof caminhava por uma floresta, quando de repente avistou uma entrada, era uma caverna."
                    +
                    " Jof ficou bastante curioso, e foi olhar mais de perto, assim que ele chega na entrada da caverna ele logo avista milhares de morcegos."
                    +
                    " E então ele fica muito tenso, pois Jof tem pavor de morcegos!" +
                    " Logo vett aparece para ajudar Jof, que está em uma situação delicada." +
                    " Então jof pergunta a vett, oque fazer?" + "logo vett lhe da duas opções." +
                    " A primeira opção é tentar sair de fininho sem fazer barulho para não acordar os mocegos." + "\n" +
                    " A segunda opção é fazer barulho para os morcegos saírem da caverna, mas jof tem que se esconder."
                    + "\n" +
                    " As duas ideias tem riscos, pois a primeira opção jof pode escorregar e cair, pois as pedras estão muito soltas."
                    +
                    " A segunda opção jof pode tentar se esonder, porém com a quantidade de morcego que irá sair algum dos morcegos podem morder ele. E esses morcegos são morcegos raros, que possuem veneno, então com uma mordida Jof morre.";

            String escolha1Capitulo3 = "primeira opcao";
            String escolha2Capitulo3 = "segunda opcao";

            System.out.println("\n- - - - - - -\n");
            System.out.println(nomeCapitulo3);
            System.out.println("\n. . . . . .\n");
            System.out.println(textoCapitulo3);
            System.out.println(" - " + escolha1Capitulo3);
            System.out.println(" - " + escolha2Capitulo3);
            jof.alteracaoEnergia(-20);

            Scanner escaneadorr = new Scanner(System.in);
            escolha = escaneadorr.nextLine();

            if (escolha.equals(escolha1Capitulo3)) {
                // capitulo 4
                String nomeCapitulo4 = "A QUEDA DE JOFF.";
                String textoCapitulo4 = "Jof escolhe sair de fininho da caverna, ele percorre um caminho com pedras soltas e molhadas, "
                        +
                        "a caverna está um pouco escura, mas jof tem ajuda de vett que está ilumindando o caminho, a escolha de jof está dando certo, ele está conseguindo sair devagar e em silencio da caverna, "
                        +
                        "quase perto da saída jof escorrega em uma rocha e escorrega, logo ap[os escorregar ele cai no chão se arranhando um pouco, jof não fez barulho suficente para os morcegos acordarem, "
                        +
                        " então ele se levanta devagar e consegue sair da caverna. Logo após ele agradece a vett e volta a vida real, acordando do seu sonho sombrio."
                        +
                        "\n" + "FIM";

                System.out.println(nomeCapitulo4);
                System.out.println("\n. . . . . .\n");
                System.out.println(textoCapitulo4);
                jof.alteracaoEnergia(+20);
            }

            else if (escolha.equals(escolha2Capitulo3)) {
                // capitulo 5
                String nomeCapitulo5 = "O MORDIDA FATAL.";
                String textoCapitulo5 = "Após jof escolher fazer barulho para os morcegos sairém da caverna, ele não consegue, "
                        + "\n" +
                        " se esconder direito e alguns morcegos vão em sua direção, dois morcegam mordem jof no braço esquerdo e no pescoço, logo jof cai, e teve um fim tragico."
                        +
                        "Logo após o final do sonho jof acorda e vê que tudo está normal e realmente não passava de um sonho. "
                        +
                        "Fim.";

                System.out.println(nomeCapitulo5);
                System.out.println("\n. . . . . .\n");
                System.out.println(textoCapitulo5);
                jof.alteracaoEnergia(-100);

            }

        }
        escaneador.close();
    }
}