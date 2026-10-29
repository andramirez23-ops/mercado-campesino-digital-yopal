
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReservaService {

    public boolean reservarProducto(
            String nombreProducto,
            int cantidadDisponible,
            int cantidadSolicitada,
            LocalDateTime fechaReserva) {

        // Validar que la cantidad sea válida
        if (cantidadSolicitada <= 0) {
            System.out.println("Error: la cantidad debe ser mayor a cero.");
            return false;
        }

        // Validar disponibilidad del producto
        if (cantidadSolicitada > cantidadDisponible) {
            System.out.println("Error: no hay suficiente inventario.");
            return false;
        }

        // Validar fecha límite: viernes a las 6:00 p. m.
        if (fechaReserva.getDayOfWeek() == DayOfWeek.FRIDAY
                && fechaReserva.toLocalTime()
                .isAfter(LocalTime.of(18, 0))) {
            System.out.println("Error: las reservas cerraron el viernes a las 6:00 p. m.");
            return false;
        }

        // Aceptar la reserva
        int inventarioRestante = cantidadDisponible - cantidadSolicitada;

        System.out.println("Reserva realizada correctamente.");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Inventario restante: " + inventarioRestante);

        return true;
    }

    public static void main(String[] args) {
        ReservaService servicio = new ReservaService();

        servicio.reservarProducto(
                "Yuca",
                20,
                5,
                LocalDateTime.of(2026, 10, 30, 17, 30)
        );
    }
}
