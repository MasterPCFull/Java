package ordemservico;

import java.util.Scanner;

import ordemservico.Atendente;
import ordemservico.Tecnico;
import ordemservico.OrdemServico;
import ordemservico.Servico;
import ordemservico.Material;

public class Main {
    public static void main(String[] args) {

        // Declarando classes
        Cliente cliente = new Cliente();
        Tecnico tecnico = new Tecnico();
        Atendente atendente = new Atendente();
        Material material = new Material();
        OrdemServico os = new OrdemServico();
        Servico servico = new Servico();
        Scanner scanner = new Scanner(System. in);

        // Colocando o sistema dentro de um loop para não parar
        int i = 0;
        while (i < 1) {

            System.out.println("O que deseja cadastrar? (Aperte a para Atendente. Aperte t para Tecnico)");
            String cmd = scanner. nextLine();

            if(cmd.equals("a")) {
                System.out.println("Nome do atendente: ");
                String nome = scanner. nextLine();
                atendente.setNome(nome);
                System.out.println("Nome do atendente: " + atendente.getNome());
            }
            else if(cmd.equals("t")) {
                System.out.println("Nome do técnico: ");
                String nome = scanner. nextLine();
                System.out.println("Telefone: ");
                String telefone = scanner. nextLine();
                tecnico.setNome(nome);
                tecnico.setTelefone(telefone);
                System.out.println("Nome do técnico: " + tecnico.getNome() + "\nTelefone: " + tecnico.getTelefone());
            }

            System.out.println("Deseja continuar?");
            cmd = scanner. nextLine();

            if(cmd.equals("nao") || cmd.equals("n")) {
                i ++;
            }
        }
    }
}