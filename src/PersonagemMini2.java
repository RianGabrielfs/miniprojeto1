public class PersonagemMini2 {
    String nome;
    int energia;

    PersonagemMini2(String nome, int energia) {
        this.nome = nome;
        this.energia = 100;
    }

    void alteracaoEnergia(int alteração) {
        this.energia = this.energia + alteração;

        if (alteração > 0) {

            System.out.println("Devido a essa ação escolhida, " +
                    this.nome + " recupera " + alteração + " pontos de energia.");

        }

        else {

            System.out.println("Devido a essa ação escolhida, " +
                    this.nome + " perde " + alteração + " pontos de energia.");

        }

        if (this.energia > 100) {

            this.energia = 100;

        } else if (this.energia < 0) {

            this.energia = 0;
            System.out.println("Sua energia se esgosta. " +
                    this.nome + "E ele acorda.");

        }
    }
}
