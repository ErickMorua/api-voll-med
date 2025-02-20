package med.voli.api.domain.paciente;

import jakarta.validation.Valid;
import med.voli.api.domain.direccion.DatosDireccion;

public record DatosActualizacionPaciente(
        Long id,
        String nombre,
        String telefono,
        @Valid DatosDireccion direccion
) {
}