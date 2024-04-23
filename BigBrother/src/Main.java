import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        // Adicionando jogadores
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o nome do jogador em quem deseja votar ou digite sair para finalizar a votação.");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(nome)) {
                    jogador.incrementaUmVoto();
                    break;
                }
            }
        }

        Jogador jogadorMaisVotado = jogadores.get(0);
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > jogadorMaisVotado.getVotos()) {
                jogadorMaisVotado = jogador;
            }
        }

        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir " +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu " +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu " +
                "vou conseguir te eliminar com alegria. Com " + jogadorMaisVotado.getVotos() + " votos, é você quem sai " +
                jogadorMaisVotado.getNome() + ".");
    }
}