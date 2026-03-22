public class Personagem {
    String nome;
    String raca;
    String classe;
    int hp, hpMax, mp, mpMax, defesa, forca, agilidade, inteligencia;

    public Personagem(String nome, String raca, String classe, int hp, int mp, int forca, int agilidade, int inteligencia) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.hp = hp;
        this.hpMax = hp;
        this.mp = mp;
        this.mpMax = mp;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.defesa = 10 + agilidade; // Defesa baseada na agilidade
    }
}