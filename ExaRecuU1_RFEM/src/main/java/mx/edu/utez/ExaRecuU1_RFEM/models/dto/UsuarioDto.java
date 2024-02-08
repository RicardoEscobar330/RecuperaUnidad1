package mx.edu.utez.ExaRecuU1_RFEM.models.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class UsuarioDto {
    private Integer idUsuario;
    private String Username;
    private String Password;
    private Boolean status;
}
