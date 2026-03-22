import java.util.Scanner;

public class CriaçãodeFicha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---CRIAÇÃODE PERSONAGEM---");
        System.out.print("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        // Seleção de Raça
        System.out.println("\nEscolha sua Raça:");
        for (int i = 0; i < Raca.values().length; i++) {
            System.out.println((i + 1) + " - " + Raca.values()[i] + " (" + Raca.values()[i]);
        }
        Raca racaEscolhida = Raca.values()[sc.nextInt()];

        // Seleção de Classe
        System.out.println("\nEscolha sua Classe:");
        for (int i = 0; i < Classe.values().length; i++) {
            System.out.println((i + 1) + " - " + Classe.values()[i] + " (" + Classe.values()[i] + ")");
        }
        Classe classeEscolhida = Classe.values()[sc.nextInt()];

        // Distribuição de Atributos
        int pontos = 15;
        int forca = 0, agilidade = 0, inteligencia = 0;

        System.out.println("pontos para distribuir: " + pontos + "em Força, Agilidades e Inteligência.");
        System.out.println("Pontos para Força: ");
        int pontosForçã = sc.nextInt();
        forca += pontosForçã;
        pontos -= pontosForçã;
        System.out.println("Pontos para Agilidade: (restam " + pontos + " pontos)");
        int pontosAgilidade = sc.nextInt();
        agilidade += pontosAgilidade;
        pontos -= pontosAgilidade;
        System.out.println("Pontos para Inteligência: (restam " + pontos + " pontos) ");
        int pontosInteligencia = sc.nextInt();
        inteligencia += pontosInteligencia;
        pontos -= pontosInteligencia;

        ;
        // Calculo dos Atributos Finais (base + pontos + Bonus de Raça)
        int forcaFinal = forca + racaEscolhida.bnsFor;
        int agilidadeFinal = agilidade + racaEscolhida.bnsAgi;
        int inteligenciaFinal = inteligencia + racaEscolhida.bnsInt;

        int vidaFinal = classeEscolhida.vidaBase + forcaFinal * 5;
        int manaFinal = classeEscolhida.manaBase + inteligenciaFinal * 5;
        int danoFisicoFinal = 10 + (forcaFinal * 2) + agilidadeFinal;
        int danoMagicoFinal = 10 + (inteligenciaFinal * 2) + agilidadeFinal;
        int danoFinal = danoFisicoFinal + danoMagicoFinal;
        // Exibição da Ficha Final
        System.out.println("\n==============================");
        System.out.println("📜 STATUS DE " + nome.toUpperCase());
        System.out.println("🧬 Raça: " + racaEscolhida);
        System.out.println("👑 Classe: " + classeEscolhida);
        System.out.println("❤️ Vida: " + vidaFinal);
        System.out.println("💧 Mana: " + manaFinal);
        System.out.println("⚔️ Dano: " + danoFinal);
        System.out.println("🛡️ Defesa: " + (10 + agilidadeFinal));
        System.out.println("🧠 Inteligência: " + inteligenciaFinal);
        System.out.println("==============================");
    }
}
