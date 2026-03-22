public enum Classe {
    GUERREIRO(120, 20),
    MAGO(70, 120),
    LADINO(90, 40),
    CLERIGO(100, 50);

    final int vidaBase;
    final int manaBase;

    Classe(int hp, int mp) {
        this.vidaBase = hp;
        this.manaBase = mp;
    }
}
