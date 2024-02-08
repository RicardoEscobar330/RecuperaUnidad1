package mx.edu.utez.ExaRecuU1_RFEM.service;

import mx.edu.utez.ExaRecuU1_RFEM.models.dto.UsuarioDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.UsuarioBean;

import java.util.List;

public interface IUsuario {
    UsuarioBean save(UsuarioDto usuarioDto);
    UsuarioBean findById(Integer id);
    void delete (UsuarioBean usuarioBean);
    List<UsuarioBean> showAll();
}
