
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReservaService {

    public boolean reservarProducto(
            String nombreProducto,
            int cantidadDisponible,
            int cantidadSolicitada,
            LocalDateTime fechaReserva) {

        // REQ-01: La cantidad solicitada debe ser mayor que cero.
        if (cantidadSolicitada <= 0) {
            System.out.println("Error: la cantidad debe ser mayor a cero.");
            return false;
        }

        // REQ-02: El sistema debe verificar que exista inventario suficiente.
        if (cantidadSolicitada > cantidadDisponible) {
            System.out.println("Error: no hay suficiente inventario.");
            return false;
        }

        // REQ-03: Las reservas no se permiten después del viernes a las 6:00 p. m.
        if (fechaReserva.getDayOfWeek() == DayOfWeek.FRIDAY
                && fechaReserva.toLocalTime()
                .isAfter(LocalTime.of(18, 0))) {
            System.out.println(
                "Error: las reservas cerraron el viernes a las 6:00 p. m."
            );
            return false;
        }

        // REQ-04: Si se cumplen las validaciones, se calcula el inventario restante.
        int inventarioRestante = cantidadDisponible - cantidadSolicitada;

        // REQ-05: El sistema informa que la reserva fue aceptada.
        System.out.println("Reserva realizada correctamente.");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Inventario restante: " + inventarioRestante);

        return true;
    }

    public static void main(String[] args) {
        ReservaService servicio = new ReservaService();

        // PRUEBA: Se reservan 5 unidades de yuca de un inventario de 20.
        servicio.reservarProducto(
                "Yuca",
                20,
                5,
                LocalDateTime.of(2026, 10, 30, 17, 30)
        );
    }
}

