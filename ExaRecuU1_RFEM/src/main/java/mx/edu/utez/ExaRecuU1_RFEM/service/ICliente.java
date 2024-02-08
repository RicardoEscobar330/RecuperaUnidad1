package mx.edu.utez.ExaRecuU1_RFEM.service;

import mx.edu.utez.ExaRecuU1_RFEM.models.dto.ClienteDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.ClienteBean;

import java.util.List;

public interface ICliente {
    ClienteBean save(ClienteDto clienteDto);
    ClienteBean findById(Integer id);
    void delete (ClienteBean clienteBean);
    List<ClienteBean> showAll();
}
