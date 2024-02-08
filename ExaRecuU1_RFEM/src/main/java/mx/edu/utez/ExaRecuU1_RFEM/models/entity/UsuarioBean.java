package mx.edu.utez.ExaRecuU1_RFEM.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

@Table(name = "usuarios")
public class UsuarioBean {
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name = "username", unique = true)
    private String Username;
    @Column(name = "password", length = 8)
    private String Password;
    @Column(name = "status")
    private Boolean status; //Wrappers
}
