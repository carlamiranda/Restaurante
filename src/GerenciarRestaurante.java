import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GerenciarRestaurante {

    private static final List<Reserva> reservas = new ArrayList<>();
    private static final List<Pedido> pedidos = new ArrayList<>();
    private static final List<ItemCardapio> cardapio = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao Restaurante!");

        // Exemplo de como adicionar itens ao cardápio
        cardapio.add(new ItemCardapio(1, "Pizza", "Pizza de calabresa", 35.50) {});
        cardapio.add(new ItemCardapio(2, "Refrigerante", "Coca-Cola 2L", 7.50) {});

        while (true) {
            // Menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Criar Reserva");
            System.out.println("2 - Criar Pedido");
            System.out.println("3 - Adicionar Item ao Pedido");
            System.out.println("4 - Finalizar Pedido");
            System.out.println("5 - Realizar Pagamento");
            System.out.println("6 - Cancelar Reserva");
            System.out.println("7 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarReserva();
                    break;
                case 2:
                    criarPedido();
                    break;
                case 3:
                    adicionarItemPedido();
                    break;
                case 4:
                    finalizarPedido();
                    break;
                case 5:
                    realizarPagamento();
                    break;
                case 6:
                    cancelarReserva();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    // Método para criar uma reserva
    private static void criarReserva() {
        System.out.print("Informe o número da reserva: ");
        int numReserva = scanner.nextInt();
        System.out.print("Informe o número de pessoas: ");
        int numPessoas = scanner.nextInt();
        System.out.print("Informe a data da reserva (dd/MM/yyyy): ");
        String dataStr = scanner.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataReserva = null;
        try {
            dataReserva = sdf.parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Erro ao parsear a data. Por favor, use o formato correto (dd/MM/yyyy).");
            return; // Se a data não for válida, retorna para o menu
        }

        Reserva reserva = new Reserva(numReserva, numPessoas, dataReserva);
        reservas.add(reserva);

        System.out.println("Reserva criada com sucesso! Número da reserva: " + numReserva);
    }

    // Método para criar um pedido
    private static void criarPedido() {
        System.out.print("Informe o número do pedido: ");
        int numPedido = scanner.nextInt();
        scanner.nextLine();  // Consumir o newline após o nextInt()
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, numPedido);
        Pedido pedido = new Pedido(numPedido, cliente);
        pedidos.add(pedido);

        System.out.println("Pedido criado com sucesso! Número do pedido: " + numPedido);
    }

// Método para adicionar um item ao pedido
private static void adicionarItemPedido() {
    System.out.print("Informe o número do pedido: ");
    int numPedido = scanner.nextInt();
    Pedido pedido = findPedidoByNum(numPedido);

    if (pedido != null) {
        System.out.println("Itens do cardápio:");
        for (ItemCardapio item : cardapio) {
            System.out.println(item.getNumItem() + " - " + item.getNomeItem() + " - R$" + item.getPreco());
        }

        System.out.print("Informe o número do item que deseja adicionar: ");
        int numItem = scanner.nextInt(); // O número do item (não o nome)

        ItemCardapio item = findItemByNum(numItem);

        if (item != null) {
            pedido.addItemCardapio(item);
            System.out.println("Item adicionado ao pedido com sucesso!");
        } else {
            System.out.println("Item não encontrado no cardápio.");
        }
    } else {
        System.out.println("Pedido não encontrado.");
    }
}

    // Método para finalizar um pedido
    private static void finalizarPedido() {
        System.out.print("Informe o número do pedido a ser finalizado: ");
        int numPedido = scanner.nextInt();
        Pedido pedido = findPedidoByNum(numPedido);

        if (pedido != null) {
            pedido.setSituacaoPedido("Finalizado");
            System.out.println("Pedido finalizado com sucesso!");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    // Método para realizar o pagamento
    private static void realizarPagamento() {
        System.out.print("Informe o número do pedido para realizar o pagamento: ");
        int numPedido = scanner.nextInt();
        Pedido pedido = findPedidoByNum(numPedido);

        if (pedido != null) {
            // Calcular total do pedido
            double total = 0;
            for (ItemCardapio item : pedido.getItensCardapio()) {
                total += item.getPreco();
            }
            System.out.println("Total do pedido: R$" + total);

            System.out.print("Informe o tipo de pagamento (Ex: Crédito, Débito, etc.): ");
            String tipoPagamento = scanner.next();

            Conta conta = new Conta(pedido.getNumPedido(), pedido.getCliente().getNumCliente(), tipoPagamento);
            conta.pagamento();
            System.out.println("Pagamento realizado com sucesso!");

        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    // Método para cancelar uma reserva
    private static void cancelarReserva() {
        System.out.print("Informe o número da reserva a ser cancelada: ");
        int numReserva = scanner.nextInt();
        Reserva reserva = findReservaByNum(numReserva);

        if (reserva != null) {
            reservas.remove(reserva);
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }

    // Método auxiliar para encontrar uma reserva pelo número
    private static Reserva findReservaByNum(int numReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getNumReserva() == numReserva) {
                return reserva;
            }
        }
        return null;
    }

    // Método auxiliar para encontrar um pedido pelo número
    private static Pedido findPedidoByNum(int numPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumPedido() == numPedido) {
                return pedido;
            }
        }
        return null;
    }

    // Método auxiliar para encontrar um item no cardápio pelo número
    private static ItemCardapio findItemByNum(int numItem) {
        for (ItemCardapio item : cardapio) {
            if (item.getNumItem() == numItem) {
                return item;
            }
        }
        return null;
    }
}
