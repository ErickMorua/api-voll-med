package med.voli.api.domain.paciente;

import med.voli.api.domain.direccion.Direccion;


public record DatosRespuestaPaciente(Long id, String nombre, String email, String documentoIdentidad, String telefono, Direccion direccion) {


}
