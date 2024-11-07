import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> grupoMasculino = new ArrayList<>();
        List<Pessoa> grupoFeminino = new ArrayList<>();

        System.out.print("Digite o número de pessoas: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + ": ");
            String sexo = sc.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(pessoa);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(pessoa);
            } else {
                System.out.println("Sexo Inválido! 'M' ou 'F' para validar.");
            }
        }

        System.out.println("\nGrupo Masculino: ");
        for (Pessoa p : grupoMasculino) {
            System.out.println(p.getNome());
        }

        System.out.println("\nGrupo Feminino: ");
        for (Pessoa p : grupoFeminino) {
            System.out.println(p.getNome());
        }
    }
}