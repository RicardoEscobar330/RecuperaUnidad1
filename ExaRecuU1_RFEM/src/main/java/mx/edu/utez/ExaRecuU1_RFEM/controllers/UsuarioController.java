package mx.edu.utez.ExaRecuU1_RFEM.controllers;

import lombok.AllArgsConstructor;
import mx.edu.utez.ExaRecuU1_RFEM.models.dto.UsuarioDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.UsuarioBean;
import mx.edu.utez.ExaRecuU1_RFEM.service.IUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/usuario")
public class UsuarioController{

    private final IUsuario UsuarioService;

    //Metodo Para Crear Usuario
    @PostMapping("/usuario")
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto){
        UsuarioBean usuarioSave = UsuarioService.save(usuarioDto);
        return UsuarioDto.builder()
                .idUsuario(usuarioSave.getIdUsuario())
                .Username(usuarioSave.getUsername())
                .Password(usuarioSave.getPassword())
                .status(usuarioSave.getStatus())
                .build();
    }

    //Método para Actualizar Usuario
    @PutMapping("/usuario/")
    public UsuarioDto update(@RequestBody UsuarioDto usuarioDto){
        UsuarioBean usuarioUpdate = UsuarioService.save(usuarioDto);
        return UsuarioDto.builder()
                .idUsuario(usuarioUpdate.getIdUsuario())
                .Username(usuarioUpdate.getUsername())
                .Password(usuarioUpdate.getPassword())
                .status(usuarioUpdate.getStatus())
                .build();
    }

    //Método para Eliminar Usuario
    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable Integer id){
        UsuarioBean deleteUsuario = UsuarioService.findById(id);
        UsuarioService.delete(deleteUsuario);
    }

    //Método para Buscar Persona pro ID
    @GetMapping("/usuario/{id}")
    public UsuarioBean showById(@PathVariable Integer id) { return UsuarioService.findById(id); }

    //Método para Buscar a todos los usuarios
    @GetMapping("/usuarios")
    public List<UsuarioBean> findAll(){ return UsuarioService.showAll(); }
}
