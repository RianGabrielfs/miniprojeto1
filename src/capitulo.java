import java.util.Scanner;

public class capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    PersonagemMini2 personagem;
    int alteracaoEnergia;
    Scanner escaneador;
   

    capitulo (String nome, 
              String texto,
              
              PersonagemMini2 personagem,
              int alteracaoEnergia,
              String escolha1,
              String escolha2,
              Scanner escaneador)
    {
        this.nome = nome;
        this.texto = texto;
        
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.escaneador = escaneador; 
    }

    void mostrar ()
    {
        System.out.println(". . .");
        System.out.println(this.nome);
        System.out.println("- - - - - - - - -");
        System.out.println(this.texto);
        this.personagem.alteracaoEnergia(this.alteracaoEnergia);
       
       if(this.escolha1 != null)
       {
        System.out.println(" - " + this.escolha1);
       }

        if(this.escolha2 != null)
        {
            System.out.println(" - " + this.escolha2);
        }
        
    }
    int escolher()
    {
        int escolha = 0;

        
        if(escolha1 != null && escolha2 != null )
        {
            Scanner escaneador = new Scanner(System.in);
            String escolhaa = escaneador.nextLine();

         if(escolhaa.equals(escolha1))
        {
            escolha = 1;
        }   
        else if(escolhaa.equals(escolha2))
        {
            escolha = 2;
        }

        }
        return escolha;
        
    }
}


