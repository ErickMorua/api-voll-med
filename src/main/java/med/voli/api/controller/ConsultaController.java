package med.voli.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voli.api.domain.consulta.AgendaDeConsultaService;
import med.voli.api.domain.consulta.DatosAgendarConsulta;
import med.voli.api.domain.consulta.DatosDetalleCOnsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultaService service;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DatosAgendarConsulta datos) {

        service.agendar(datos);



        System.out.println(datos);
        return  ResponseEntity.ok(new DatosDetalleCOnsulta(null, null, null, null));
    }
}
