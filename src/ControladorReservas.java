import java.util.ArrayList;
import java.util.List;

public class ControladorReservas {
    private List<Reserva> reservas;

    public ControladorReservas() {
        this.reservas = new ArrayList<>();
    }

    public void criarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva criada.");
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva cancelada.");
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
