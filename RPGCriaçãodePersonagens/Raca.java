public enum Raca {
    HUMANO("Versátil", 1, 1, 1),      // +1 em tudo
    ELFO("Ágil/Mágico", 0, 2, 1),     // +2 Agilidade, +1 Inteligência
    ANAO("Resistente", 2, 0, 0),      // +2 Força/Defesa
    HALFLING("Sorte/Furtivo", 0, 2, 0),// +2 Agilidade
    DRACONATO("Imponente", 2, 0, 1);  // +2 Força, +1 Inteligência

    final String descricao;
    final int bnsFor, bnsAgi, bnsInt;

    Raca(String desc, int f, int a, int i) {
        this.descricao = desc;
        this.bnsFor = f;
        this.bnsAgi = a;
        this.bnsInt = i;
    }
}