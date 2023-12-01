package Quiz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        Cabecalho cabecalho = new Cabecalho();
        cabecalho.aluno = "Ricardo Rodrigues Vieira";
        cabecalho.professor = "Brenno Pimenta";
        cabecalho.curso = "Engenharia de Software";
        cabecalho.materia = "Algoritmo e Programação II";
        cabecalho.tema = "Esporte";

        System.out.println("   Tema:" + cabecalho.tema);
        System.out.println("   Aluno: " + cabecalho.aluno);
        System.out.println("   Professor: " + cabecalho.professor);
        System.out.println("   Curso: " + cabecalho.curso);
        System.out.println("   Matéria: " + cabecalho.materia);
        System.out.println("_________________________________________");

        System.out.println("      * Teste seus conhecimentos em 15 perguntas. Boa sorte  *      ");
        System.out.println();

        int qtdeAcertos = 0;
        int qtdeErros = 0;

        //Questão 1
        Questoes questao1 = new Questoes();
        questao1.pergunta = "Quem ganhou o prêmio de Melhor em Campo na final da Copa do Mundo de 2014?";
        questao1.opcoes[0] = "A - Mário Goetze";
        questao1.opcoes[1] = "B - Sergio Aguero";
        questao1.opcoes[2] = "C - Lionel Messi";
        questao1.opcoes[3] = "D - Cristiano Ronaldo";
        questao1.questaoCorreta = "C";
        if (questao1.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }


        //Questão 2
        Questoes questao2 = new Questoes();
        questao2.pergunta =  "Qual jogador de futebol detém o recorde de maior número de assistências na Premier League? ";
        questao2.opcoes[0] = "A - Cesc Fabregas";
        questao2.opcoes[1] = "B - Ryan Giggs";
        questao2.opcoes[2] = "C - Bruyne";
        questao2.opcoes[3] = "D - Paul Scholes";
        questao2.questaoCorreta = "C";
        if (questao2.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 3
        Questoes questao3 = new Questoes();
        questao3.pergunta = "Quantas vezes Michael Jordan ganhou campeonatos pelo Chicago Bulls? ";
        questao3.opcoes[0] = "A - 5";
        questao3.opcoes[1] = "B - 7";
        questao3.opcoes[2] = "C - 6";
        questao3.opcoes[3] = "D - 4";
        questao3.questaoCorreta = "C";
        if (questao3.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 4
        Questoes questao4 = new Questoes();
        questao4.pergunta = "Quanto tempo dura um round de boxe típico para homens?  ";
        questao4.opcoes[0] = "A - 2 minutos";
        questao4.opcoes[1] = "B - 3 minutos";
        questao4.opcoes[2] = "C - 4 minutos";
        questao4.opcoes[3] = "D - 5 minutos";
        questao4.questaoCorreta = "B";
        if (questao4.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 5
        Questoes questao5 = new Questoes();
        questao5.pergunta = "Qual é o “rei dos esportes”? ";
        questao5.opcoes[0] = "A - Basquete";
        questao5.opcoes[1] = "B - Beisebol";
        questao5.opcoes[2] = "C - Futebol";
        questao5.opcoes[3] = "D - Hóquei no gelo";
        questao5.questaoCorreta = "C";
        if (questao5.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 6
        Questoes questao6 = new Questoes();
        questao6.pergunta = "As Olimpíadas são realizadas a cada quantos anos”? ";
        questao6.opcoes[0] = "A - A cada 4 anos";
        questao6.opcoes[1] = "B - A cada 3 anos";
        questao6.opcoes[2] = "C - A cada 2 anos";
        questao6.opcoes[3] = "D - Todo ano";
        questao6.questaoCorreta = "A";
        if (questao6.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 7
        Questoes questao7 = new Questoes();
        questao7.pergunta = "Qual dos seguintes esportes não usa bola”? ";
        questao7.opcoes[0] = "A - golfe";
        questao7.opcoes[1] = "B - tênis";
        questao7.opcoes[2] = "C - hóquei";
        questao7.opcoes[3] = "D - polo";
        questao7.questaoCorreta = "C";
        if (questao7.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 8
        Questoes questao8 = new Questoes();
        questao8.pergunta = "Qual é o significado de NBA”? ";
        questao8.opcoes[0] = "A - National Basket Administration";
        questao8.opcoes[1] = "B - National Basketball Administration";
        questao8.opcoes[2] = "C - National Basketball Association";
        questao8.opcoes[3] = "D - National Basket Administration";
        questao8.questaoCorreta = "C";
        if (questao8.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 9
        Questoes questao9 = new Questoes();
        questao9.pergunta = "Quantas Copas do Mundo a Itália ganhou”? ";
        questao9.opcoes[0] = "A - 3";
        questao9.opcoes[1] = "B - 2";
        questao9.opcoes[2] = "C - 1";
        questao9.opcoes[3] = "D - 4";
        questao9.questaoCorreta = "D";
        if (questao9.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 10
        Questoes questao10 = new Questoes();
        questao10.pergunta = "Quem é conhecido como O Rei?";
        questao10.opcoes[0] = "A - Neymar";
        questao10.opcoes[1] = "B - Pele";
        questao10.opcoes[2] = "C - Ronaldinho";
        questao10.opcoes[3] = "D - Cassio";
        questao10.questaoCorreta = "B";
        if (questao10.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 11
        Questoes questao11 = new Questoes();
        questao11.pergunta = "Qual time ganhou mais Champions League na história”? ";
        questao11.opcoes[0] = "A - Real Madrid";
        questao11.opcoes[1] = "B - Barcelona";
        questao11.opcoes[2] = "C - Milam";
        questao11.opcoes[3] = "D - Atletico de Madrid";
        questao11.questaoCorreta = "A";
        if (questao11.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 12
        Questoes questao12 = new Questoes();
        questao12.pergunta = "Em que país foi inventado o voleibol”? ";
        questao12.opcoes[0] = "A - Brasil";
        questao12.opcoes[1] = "B - Espanha";
        questao12.opcoes[2] = "C - Argentina";
        questao12.opcoes[3] = "D - Estados unidos";
        questao12.questaoCorreta = "D";
        if (questao12.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 13
        Questoes questao13 = new Questoes();
        questao13.pergunta = "O melhor jogador de futebol do mundo”? ";
        questao13.opcoes[0] = "A - Lionel Messi";
        questao13.opcoes[1] = "B - Cristiano Ronaldo";
        questao13.opcoes[2] = "C - Neymar";
        questao13.opcoes[3] = "D - Haalad";
        questao13.questaoCorreta = "A";
        if (questao13.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 14
        Questoes questao14 = new Questoes();
        questao14.pergunta = "Quem é o melhor jogador Brasileiro da atualidade”? ";
        questao14.opcoes[0] = "A - Gabriel Barbosa";
        questao14.opcoes[1] = "B - Vinicios Junior";
        questao14.opcoes[2] = "C - Neymar";
        questao14.opcoes[3] = "D - Cassio";
        questao14.questaoCorreta = "B";
        if (questao14.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 15
        Questoes questao15 = new Questoes();
        questao15.pergunta = "Quem foi o primeiro jogador britânico que ganhou títulos da liga em quatro países”? ";
        questao15.opcoes[0] = "A - Tom Brady";
        questao15.opcoes[1] = "B - David Beckham";
        questao15.opcoes[2] = "C - Cristiano Ronaldo";
        questao15.opcoes[3] = "D - Aaron Rogers";
        questao15.questaoCorreta = "C";
        if (questao15.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        System.out.println();
        System.out.println(" ******** RESUMO ********");
        System.out.println("  Total de Perguntas.......: " + (qtdeAcertos + qtdeErros));
        System.out.println("  Acertos..................: " + qtdeAcertos);
        System.out.println("  Erros....................: " + qtdeErros);
        System.out.println(" **************************");


    }


}
