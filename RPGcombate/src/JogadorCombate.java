import java.util.Random;
import java.util.Scanner;

public class JogadorCombate {
    static int ataqueUsurio() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("escolaha seu ataqeu: ");
        System.out.println("escolaha seu Soco: ");
        System.out.println("escolaha seu Especial: ");
        return leitor.nextInt();
    }

    static int ataqueComputador() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;// Returna numero entre 1 ate 3
    }

    static void imprimeHP(int hqUsuario, int hqComputador, int contagemEspecial) {
        System.out.println("==================");
        System.out.println("-- HP Usuario: " + hqUsuario);
        System.out.println("-- HP Inimigo: " + hqComputador);
        System.out.println("Contagem Especiais: " + contagemEspecial);
        System.out.println("==================");
    }

    static void batalha() {
        int hqUsuario = 150;
        int hqComputador = 1;
        int contagemEspecial = 5;
        int escolahaAtaque;
        int i = 1;

        while (hqUsuario > 0) {
            hqComputador = 10 + i;

            System.out.println("=-=-=-=-=-=-=-=-=-=");
            System.out.println("Inimigo " + i);
            System.out.println("=-=-=-=-=-=-=-=-=-=\n");

            while (hqUsuario > 0 && hqComputador > 0) {
                imprimeHP(hqUsuario, hqComputador, contagemEspecial);
                escolahaAtaque = ataqueUsurio();
                switch (escolahaAtaque) {
                    case 1:
                        System.out.println("Usuario deu um soco.");
                        hqComputador -= 7;
                        break;
                    case 2:
                        System.out.println("Usuario usou o ESPECIAL. ");
                        hqComputador -= 20;
                        contagemEspecial--;
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
                if (hqComputador > 0) // Verifica se o inimigo ainda tem HP para atacar
                {
                    escolahaAtaque = ataqueComputador();
                    switch (escolahaAtaque) {
                        case 1:
                            System.out.println("inimigo deu um soco.");
                            hqUsuario -= 2 + (int) (i / 10);
                            break;
                        case 2:
                            System.out.println("inimigo deu um chute.");
                            hqUsuario -= 3 + (int) (i / 10);
                            break;
                        case 3:
                            System.out.println("inimifo usou o ESPECIAL!!!");
                            hqUsuario -= 4 + (int) (i / 20);
                            break;
                    }
                } else {
                    System.out.println("Inimigo DERROTADO");
                }
            }
            // Verifica se o inimigo foi derrotado e se o usuario ainda tem HP para
            // continuar:
            if (hqComputador > 0) {
                hqUsuario += 5;
                if (hqComputador > 150) {
                    hqUsuario = 150;
                }
                if (i % 10 == 0) {
                    contagemEspecial++;
                    if (contagemEspecial > 5) {
                        contagemEspecial = 5;
                    }
                }
                if (hqUsuario <= 0) {
                    System.out.println("VOCÊ FOI DERROTADO");
                }

            }
            i++; // Incrementa o numero do inimigo a cada batalha
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int continua = 1;
        while (continua == 1) {

            batalha();

            System.out.println("Fim de jogo. Deseja continua? (1) Sim (2) Não");
            continua = leitor.nextInt();
        }
    }
}