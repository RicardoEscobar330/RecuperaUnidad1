package mx.edu.utez.ExaRecuU1_RFEM.models.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class ClienteDto {
    private Integer idCliente;
    private String Nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String Dirección;
    private String Contacto;
}
