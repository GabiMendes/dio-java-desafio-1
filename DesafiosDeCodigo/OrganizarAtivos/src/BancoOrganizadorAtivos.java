import java.util.ArrayList;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> ativos = new ArrayList<>();

    // Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine(); // Consuma a nova linha pendente após a entrada de int

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    // Ordenar os ativos em ordem alfabética manualmente (bubble sort).
    for (int i = 0; i < quantidadeAtivos - 1; i++) {
      for (int j = 0; j < quantidadeAtivos - i - 1; j++) {
        if (ativos.get(j).compareTo(ativos.get(j + 1)) > 0) {
          // Trocar os elementos se estiverem fora de ordem
          String temp = ativos.get(j);
          ativos.set(j, ativos.get(j + 1));
          ativos.set(j + 1, temp);
        }
      }
    }

    // Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (String ativo : ativos) {
      System.out.println(ativo);
    }
  }
}

/*Descrição
Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria, foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários. Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos que será informada pelos usuários. Os ativos são representados por strings que representam seus tipos, como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros.

Entrada
A primeira entrada consiste em um número inteiro que representa a  quantidade de ativos que o usuário possui. Em seguida, o usuário deverá  informar, em linhas separadas, os tipos (strings) dos respectivos ativos.

Saída
Seu programa deve exibir a lista de Ativos organizada em ordem alfabética. Cada ativo deve ser apresentado em uma linha separada. */
