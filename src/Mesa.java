import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numMesa;
    private String disponibilidadeMesa;
    private int capacidadePessoas;
    private List<Reserva> reservas;

    public Mesa(int numMesa, String disponibilidadeMesa, int capacidadePessoas) {
        this.numMesa = numMesa;
        this.disponibilidadeMesa = disponibilidadeMesa;
        this.capacidadePessoas = capacidadePessoas;
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void disponibilidade() {
        System.out.println("Disponibilidade da mesa: " + disponibilidadeMesa);
    }

    public int getNumMesa() {
        return numMesa;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }
}
