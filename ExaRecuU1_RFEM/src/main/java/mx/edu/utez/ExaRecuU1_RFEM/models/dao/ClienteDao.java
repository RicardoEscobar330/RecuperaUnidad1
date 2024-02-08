package mx.edu.utez.ExaRecuU1_RFEM.models.dao;

import mx.edu.utez.ExaRecuU1_RFEM.models.entity.ClienteBean;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<ClienteBean, Integer> {
}
