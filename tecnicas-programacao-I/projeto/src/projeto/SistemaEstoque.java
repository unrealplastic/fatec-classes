package projeto;
import java.util.Scanner;

public class SistemaEstoque {
    static final int max = 100;
    static int[] codigos = new int[max];
    static String[] nomes = new String[max];
    static String[] categorias = new String[max];
    static double[] precos = new double[max];
    static int[] quantidades = new int[max];
    static int contadorFerramentas = 0;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = ler.nextInt();
            ler.nextLine();  

            switch(opcao) {
                case 1 -> cadastrarFerramenta(ler);
                case 2 -> consultarFerramenta(ler);
                case 3 -> atualizarQuantidade(ler);
                case 4 -> removerFerramenta(ler);
                case 5 -> exibirValorTotalEstoque();
                case 6 -> listarFerramentasPorCategoria(ler);
                case 7 -> System.out.println("Obrigada por utilizar!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
        
    }
    
    // Função menu de opções
    public static void exibirMenu() {
        System.out.println("\nMenu de Opções:");
        System.out.println("1. Cadastrar ferramenta");
        System.out.println("2. Consultar ferramenta (por código ou nome)");
        System.out.println("3. Atualizar quantidade em estoque");
        System.out.println("4. Remover ferramenta do estoque");
        System.out.println("5. Exibir o valor total em estoque");
        System.out.println("6. Listar ferramentas por categoria");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    // Função cadastrar nova ferramenta
    public static void cadastrarFerramenta(Scanner ler) {
        if (contadorFerramentas >= max) {
            System.out.println("Estoque cheio!");
            return;
        }

        System.out.print("Código da ferramenta: ");
        int codigo = ler.nextInt();
        ler.nextLine();
        if (codigoExistente(codigo)) {
            System.out.println("Código já existente!");
            return;
        }

        System.out.print("Nome da ferramenta: ");
        String nome = ler.nextLine();
        System.out.print("Categoria da ferramenta: ");
        String categoria = ler.nextLine();
        System.out.print("Preço unitário: ");
        double preco = ler.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = ler.nextInt();
        
        if (preco < 0 || quantidade < 0) {
            System.out.println("Preço e quantidade não podem ser negativos.");
            return;
        }

        codigos[contadorFerramentas] = codigo;
        nomes[contadorFerramentas] = nome;
        categorias[contadorFerramentas] = categoria;
        precos[contadorFerramentas] = preco;
        quantidades[contadorFerramentas] = quantidade;
        contadorFerramentas++;
        
        System.out.println("Ferramenta cadastrada com sucesso!");
    }

    // Função verificar código já existe
    public static boolean codigoExistente(int codigo) {
        for (int i = 0; i < contadorFerramentas; i++) {
            if (codigos[i] == codigo) {
                return true;
            }
        }
        return false;
    }
    
    // Função consultar ferramenta por código ou nome
    public static void consultarFerramenta(Scanner ler) {
        System.out.print("Digite o código ou nome da ferramenta: ");
        String input = ler.nextLine();
        
        for (int i = 0; i < contadorFerramentas; i++) {
            if (Integer.toString(codigos[i]).equals(input) || nomes[i].equalsIgnoreCase(input)) {
                System.out.println("Ferramenta encontrada:");
                System.out.printf("Código: %d, Nome: %s, Categoria: %s, Preço: %.2f, Quantidade: %d\n", 
                                  codigos[i], nomes[i], categorias[i], precos[i], quantidades[i]);
                return;
            }
        }
        System.out.println("Ferramenta não encontrada.");
    }
    
    // Função atualizar quantidade
    public static void atualizarQuantidade(Scanner ler) {
        System.out.print("Digite o código da ferramenta para atualizar: ");
        int codigo = ler.nextInt();
        
        for (int i = 0; i < contadorFerramentas; i++) {
            if (codigos[i] == codigo) {
                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = ler.nextInt();
                if (novaQuantidade < 0) {
                    System.out.println("A quantidade não pode ser negativa.");
                    return;
                }
                quantidades[i] = novaQuantidade;
                System.out.println("Quantidade atualizada com sucesso.");
                return;
            }
        }
        System.out.println("Ferramenta não encontrada.");
    }
    
    // Função remover ferramenta
    public static void removerFerramenta(Scanner ler) {
        System.out.print("Digite o código da ferramenta para remover: ");
        int codigo = ler.nextInt();
        
        for (int i = 0; i < contadorFerramentas; i++) {
            if (codigos[i] == codigo) {
                for (int j = i; j < contadorFerramentas - 1; j++) {
                    codigos[j] = codigos[j + 1];
                    nomes[j] = nomes[j + 1];
                    categorias[j] = categorias[j + 1];
                    precos[j] = precos[j + 1];
                    quantidades[j] = quantidades[j + 1];
                }
                contadorFerramentas--;
                System.out.println("Ferramenta removida com sucesso.");
                return;
            }
        }
        System.out.println("Ferramenta não encontrada.");
    }
    
    // Função exibir o valor total
    public static void exibirValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < contadorFerramentas; i++) {
            total += precos[i] * quantidades[i];
        }
        System.out.printf("Valor total em estoque: R$ %.2f\n", total);
    }
    
    // Função para listar ferramentas por categoria
    public static void listarFerramentasPorCategoria(Scanner ler) {
        System.out.print("Digite a categoria: ");
        String categoria = ler.nextLine();
        
        System.out.println("Ferramentas na categoria " + categoria + ":");
        boolean encontrou = false;
        for (int i = 0; i < contadorFerramentas; i++) {
            if (categorias[i].equalsIgnoreCase(categoria)) {
                System.out.printf("Código: %d, Nome: %s, Preço: %.2f, Quantidade: %d\n", 
                                  codigos[i], nomes[i], precos[i], quantidades[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma ferramenta encontrada nessa categoria.");
        }
    }
}