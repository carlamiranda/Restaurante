import java.util.Date;

public class Reserva {
    private int numReserva;
    private int numPessoas;
    private Date dataReserva;

    public Reserva(int numReserva, int numPessoas, Date dataReserva) {
        this.numReserva = numReserva;
        this.numPessoas = numPessoas;
        this.dataReserva = dataReserva;
    }

    public void alterarReserva() {
    }

    public void cancelarReserva() {
    }

    public int getNumReserva() {
        return numReserva;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public Date getDataReserva() {
        return dataReserva;
    }
}
