import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String faculdade = "Centro Universitario Alfredo Nasser";
        String aluno = "Guilherme Augusto de Oliveira Vargas";
        String professor = "Brenno Pimenta";
        String mensagemBoasVindas = "Bem-vindo ao sistema de Quiz!";

        Questao[] questoes = criarQuestoes();
        int acertos = 0;

        Scanner scanner = new Scanner(System.in);
        for (Questao questao : questoes) {
            System.out.println(questao.getEnunciado());
            String[] opcoes = questao.getOpcoes();
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i + 1) + ": " + opcoes[i]);
            }
            System.out.print("Sua resposta: ");
            int respostaUsuario = scanner.nextInt();
            if (respostaUsuario - 1 == questao.getRespostaCorreta()) {
                acertos++;
            }
        }

        int erros = questoes.length - acertos;
        double porcentagemAcertos = (double) acertos / questoes.length * 100;

        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");
        System.out.println("Sua porcentagem de acertos é " + porcentagemAcertos + "%.");
    }
 // Adicione aqui as perguntas

            

    private static Questao[] criarQuestoes() {
        return new Questao[]{
        new Questao("Qual o planeta mais próximo do Sol?", new String[]{"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter"}, 0),
        new Questao("Qual é o maior planeta do Sistema Solar?", new String[]{"Saturno", "Júpiter", "Netuno", "Urano", "Terra"}, 1),
        new Questao("Quantos planetas anões existem no Sistema Solar?", new String[]{"1", "2", "3", "4", "5"}, 4),
        new Questao("Qual planeta é conhecido como o Planeta Vermelho?", new String[]{"Marte", "Terra", "Vênus", "Júpiter", "Saturno"}, 0),
        new Questao("Qual é o planeta mais quente do Sistema Solar?", new String[]{"Vênus", "Mercúrio", "Terra", "Marte", "Saturno"}, 0),
        new Questao("Qual é o planeta com mais luas?", new String[]{"Júpiter", "Saturno", "Urano", "Netuno", "Terra"}, 1),
        new Questao("Qual é a principal composição da atmosfera de Marte?", new String[]{"Oxigênio", "Hidrogênio", "Metano", "Nitrogênio", "Dióxido de Carbono"}, 4),
        new Questao("Qual planeta tem um dia mais longo que seu ano?", new String[]{"Vênus", "Mercúrio", "Terra", "Marte", "Netuno"}, 0),
        new Questao("Qual é o nome da maior lua de Saturno?", new String[]{"Europa", "Ío", "Titã", "Ganímedes", "Calisto"}, 2),
        new Questao("Qual é a única lua conhecida do planeta Terra?", new String[]{"Phobos", "Deimos", "Luna", "Titã", "Europa"}, 2),
        new Questao("Quantos planetas compõem o Sistema Solar?", new String[]{"6", "7", "8", "9", "10"}, 2),
        new Questao("Qual é a segunda maior lua do Sistema Solar?", new String[]{"Europa", "Titã", "Calisto", "Io", "Tritão"}, 1),
        new Questao("Qual planeta tem a maior montanha conhecida do Sistema Solar?", new String[]{"Marte", "Terra", "Vênus", "Netuno", "Urano"}, 0),
        new Questao("Qual é a unidade astronômica (UA) média da Terra ao Sol?", new String[]{"0.5 UA", "1 UA", "1.5 UA", "2 UA", "2.5 UA"}, 1),
        new Questao("Qual planeta tem o maior sistema de anéis?", new String[]{"Júpiter", "Saturno", "Urano", "Netuno", "Marte"}, 1)
                };
            }
            
        };
    }
}

