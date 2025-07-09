import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";
        boolean startGame = false;

        System.out.println("Bem vindo ao jogo!.");
        System.out.println("Para iniciar o jogo, digite 'start'");

        response = sc.nextLine();

        if (response.equals("start")) {
            startGame = true;
        }

        while (startGame){
            int potuacao = 0;
            int numberRandom = new Random().nextInt(100);
            boolean gameOver = false;
            int numberInput = 0;

            System.out.println("Encontre o um número entre 0 e 100!");
            System.out.println("Você tem 5 tentativas. Qual número entre 0 e 100? (tentativa 01)");
            for (int i = 1; i <= 5; i++) {
                numberInput = sc.nextInt();

                if(i == 5 && numberRandom != numberInput){
                    gameOver = true;
                    System.out.println("Fim de jogo!");
                    break;
                }

                if (numberInput == numberRandom) {
                    switch (i) {
                        case 1: {
                            System.out.println("Parabéns! Isso é impressionante");
                            System.out.println("Você recebeu +10 pontos!");
                            potuacao += 10;
                            break;
                        }
                        case 2: {
                            System.out.println("Parabéns! Você mandou bem demais");
                            System.out.println("Você recebeu +8 pontos!");
                            potuacao += 8;
                            break;
                        }
                        case 3: {
                            System.out.println("Parabéns! Você acertou o número");
                            System.out.println("Você recebeu +6 pontos!");
                            potuacao += 6;
                            break;
                        }
                        case 4: {
                            System.out.println("Parabéns!");
                            System.out.println("Você recebeu +4 pontos!");
                            potuacao += 4;
                            break;
                        }
                        case 5: {
                            System.out.println("Essa foi por pouco, em?");
                            System.out.println("Você recebeu +1 pontos!");
                            potuacao += 1;
                            break;
                        }

                    }

                    break;
                } else if (numberInput > numberRandom) {
                    System.out.println("Hmmm passou um cadinho!");
                    System.out.println("Dica: O número é menor que " + numberInput);
                } else {
                    System.out.println("Bota mais dez centavos de números que tá faltando!");
                    System.out.println("Dica: O número é maior que " + numberInput);
                }


            }

            if (gameOver){
                System.out.println("Sua pontuação: " + potuacao);
                System.out.println("Deseja recomeçar o jogo? (S/N)!");

                for (int i = 0; i <= 1; i++) {
                    String reset = sc.nextLine().toLowerCase();

                    if (reset.equals("n")) {
                        startGame = false;
                    }
                }

            }


        }

    }
}