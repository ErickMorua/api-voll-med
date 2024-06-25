package med.voli.api.domain.consulta;



import java.time.LocalDateTime;

public record DatosDetalleCOnsulta(Long id, Long idPaciente, Long idMedico,  LocalDateTime fecha) {
}
