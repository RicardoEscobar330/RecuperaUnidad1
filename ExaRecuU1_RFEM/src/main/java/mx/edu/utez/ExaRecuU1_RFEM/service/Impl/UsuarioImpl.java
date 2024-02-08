package mx.edu.utez.ExaRecuU1_RFEM.service.Impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.ExaRecuU1_RFEM.models.dao.UsuarioDao;
import mx.edu.utez.ExaRecuU1_RFEM.models.dto.UsuarioDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.UsuarioBean;
import mx.edu.utez.ExaRecuU1_RFEM.service.IUsuario;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioImpl implements IUsuario {

    private final UsuarioDao usuarioDao;

    @Override
    @Transactional
    public UsuarioBean save(UsuarioDto usuarioDto) {
        UsuarioBean usuarioSave = UsuarioBean.builder()
                .idUsuario(usuarioDto.getIdUsuario())
                .Username(usuarioDto.getUsername())
                .Password(contraseñaRandom())
                .status(true)
                .build();
        return usuarioDao.save(usuarioSave);
    }

    @Override
    @Transactional(readOnly = true)
    public UsuarioBean findById(Integer id) { return usuarioDao.findById(id).orElse(null); }

    @Override
    public void delete(UsuarioBean usuarioBean) { usuarioDao.delete(usuarioBean); }

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioBean> showAll() { return (List<UsuarioBean>) usuarioDao.findAll(); }

    public String contraseñaRandom(){
        String Password = "";
        Password = UUID.randomUUID().toString().substring(0,8);
        return Password;
    }
}
