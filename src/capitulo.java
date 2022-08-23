public class capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    PersonagemMini2 personagem;
    int alteracaoEnergia;

    capitulo (String nome, 
              String texto,
              String escolha1,
              String escolha2,
              PersonagemMini2 personagem,
              int alteracaoEnergia)
    {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2; 
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    void mostrar ()
    {
        System.out.println("\n. . .\n");
        System.out.println(this.nome);
        System.out.println("- - - - - - - - -");
        System.out.println(this.texto);
        this.personagem.alteracaoEnergia(this.alteracaoEnergia);
        System.out.println(" - " + this.escolha1);
        System.out.println(" - " + this.escolha2);
    }
}


