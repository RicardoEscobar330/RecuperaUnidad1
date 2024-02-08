package mx.edu.utez.ExaRecuU1_RFEM.service.Impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.ExaRecuU1_RFEM.models.dao.ClienteDao;
import mx.edu.utez.ExaRecuU1_RFEM.models.dto.ClienteDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.ClienteBean;
import mx.edu.utez.ExaRecuU1_RFEM.service.ICliente;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteImpl implements ICliente {

    private final ClienteDao clienteDao;

    @Override
    @Transactional
    public ClienteBean save(ClienteDto clienteDto) {
        ClienteBean clienteSave = ClienteBean.builder()
                .idCliente(clienteDto.getIdCliente())
                .Nombre(clienteDto.getNombre())
                .apellidoPaterno(clienteDto.getApellidoPaterno())
                .apellidoMaterno(clienteDto.getApellidoMaterno())
                .Dirección(clienteDto.getDirección())
                .Contacto(clienteDto.getContacto())
                .build();
        return clienteDao.save(clienteSave);
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteBean findById(Integer id) { return clienteDao.findById(id).orElse(null); }

    @Override
    public void delete(ClienteBean clienteBean) { clienteDao.delete(clienteBean); }

    @Override
    @Transactional(readOnly = true)
    public List<ClienteBean> showAll() { return (List<ClienteBean>) clienteDao.findAll(); }
}
