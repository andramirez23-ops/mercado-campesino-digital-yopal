
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class ReservaServiceTest {

    private final ReservaService servicio = new ReservaService();

    // PRUEBA 1: Debe aceptar una reserva con inventario suficiente
    // y realizada antes del cierre del viernes.
    @Test
    public void debeAceptarReservaValida() {
        boolean resultado = servicio.reservarProducto(
                "Yuca",
                20,
                5,
                LocalDateTime.of(2026, 10, 30, 17, 30)
        );

        assertTrue(resultado,
                "La reserva debería ser aceptada");
    }

    // PRUEBA 2: Debe rechazar una reserva cuando no hay
    // suficientes unidades disponibles.
    @Test
    public void debeRechazarReservaSinInventarioSuficiente() {
        boolean resultado = servicio.reservarProducto(
                "Yuca",
                5,
                10,
                LocalDateTime.of(2026, 10, 29, 10, 0)
        );

        assertFalse(resultado,
                "La reserva debería ser rechazada por falta de inventario");
    }

    // PRUEBA 3: Debe rechazar una reserva realizada
    // el viernes después de las 6:00 p. m.
    @Test
    public void debeRechazarReservaDespuesDelHorarioLimite() {
        boolean resultado = servicio.reservarProducto(
                "Yuca",
                20,
                5,
                LocalDateTime.of(2026, 10, 30, 18, 1)
        );

        assertFalse(resultado,
                "La reserva debería ser rechazada por horario");
    }
}
