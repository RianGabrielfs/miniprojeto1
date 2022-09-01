import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner escaneador = new Scanner(System.in);
        PersonagemMini2 jof = new PersonagemMini2("jof", 100);
        PersonagemMini2 vett = new PersonagemMini2("vett", 100);

        // capitulo 1
        capitulo capitulo1 = new capitulo("O sonho sombrio", 
        " Olá Jof sou o Vett, você está dentro de um sonho sombrio. Você deseja acordar desse sonho? Para acordar basta tomar a pilula roxa e você voltará a realidade." +
        " Para continuar no sonho e ver onde isso vai dar, tome a pilula vermelha.", 
        vett, 
        0, 
        "roxa",
        "vermelha",
        escaneador);
    
        capitulo1.mostrar();
        capitulo1.escolher();
        int escolha = capitulo1.escolher();

        if (escolha == 1)
        {
            // capitulo 2

            capitulo capitulo2 = new capitulo(" O fim.", 
            " Ao escolher a pilula roxa Jof acordou na sua cama sem entender nada." +
            " Logo quando percebeu que era apenas um sonho respirou fundo e ficou calmo." +
            " Após isso se levantou e foi fazer suas taferas do dia totalmente tranquilo após acordar e perceber que tudo não passava apenas de um sonho!", 
           jof, 
             -100,
            null, 
            null,
            escaneador);
        
            capitulo2.mostrar();
            
        }
        
        else if (escolha == 2)
        {
            // capitulo 3
            capitulo capitulo3 = new capitulo("O FINAL DO SONHO SOMBRIO", "Jof caminhava por uma floresta, quando de repente avistou uma entrada, era uma caverna."
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
            " A segunda opção jof pode tentar se esonder, porém com a quantidade de morcego que irá sair algum dos morcegos podem morder ele. E esses morcegos são morcegos raros, que possuem veneno, então com uma mordida Jof morre.",
           jof, 
            -20, 
            "primeira opcao", 
            "segunda opcao",
            escaneador);
            
            capitulo3.mostrar();
            capitulo3.escolher();

            if (escolha == 1) 
            
            {
                // capitulo 4
                capitulo capitulo4 = new capitulo("A QUEDA DE JOFF E O FIM.", "Jof escolhe sair de fininho da caverna, ele percorre um caminho com pedras soltas e molhadas, "
                +
                "a caverna está um pouco escura, mas jof tem ajuda de vett que está ilumindando o caminho, a escolha de jof está dando certo, ele está conseguindo sair devagar e em silencio da caverna, "
                +
                "quase perto da saída jof escorrega em uma rocha e escorrega, logo ap[os escorregar ele cai no chão se arranhando um pouco, jof não fez barulho suficente para os morcegos acordarem, "
                +
                " então ele se levanta devagar e consegue sair da caverna. Logo após ele agradece a vett e volta a vida real, acordando do seu sonho sombrio."
                +
                "\n" + "FIM", 
                jof, 
                +20, 
                null, 
                null,
                escaneador);
                
                
                capitulo4.mostrar();
            }

            else if (escolha == 2) 
            {
                // capitulo 5
                capitulo capitulo5 = new capitulo("O MORDIDA FATAL.", 
                "Após jof escolher fazer barulho para os morcegos sairém da caverna, ele não consegue, "
                        + "\n" +
                        " se esconder direito e alguns morcegos vão em sua direção, dois morcegam mordem jof no braço esquerdo e no pescoço, logo jof cai, e teve um fim tragico."
                        +
                        "Logo após o final do sonho jof acorda e vê que tudo está normal e realmente não passava de um sonho. "
                        +
                        "Fim.",
                        jof, 
                         -100, 
                         null, 
                         null, 
                         escaneador);
                         
                
                         capitulo5.mostrar();
            }

    }
    escaneador.close();
}

}