package mx.edu.utez.ExaRecuU1_RFEM.models.dao;

import mx.edu.utez.ExaRecuU1_RFEM.models.entity.UsuarioBean;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<UsuarioBean, Integer> {
}
