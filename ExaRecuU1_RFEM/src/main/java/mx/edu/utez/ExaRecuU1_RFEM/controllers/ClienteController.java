package mx.edu.utez.ExaRecuU1_RFEM.controllers;

import lombok.AllArgsConstructor;
import mx.edu.utez.ExaRecuU1_RFEM.models.dto.ClienteDto;
import mx.edu.utez.ExaRecuU1_RFEM.models.entity.ClienteBean;
import mx.edu.utez.ExaRecuU1_RFEM.service.ICliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/cliente")
public class ClienteController {

    private final ICliente ClienteService;

    //Metodo para crear al Cliente
    @PostMapping("/cliente")
    public ClienteDto create(@RequestBody ClienteDto clienteDto){
        ClienteBean clienteSave = ClienteService.save(clienteDto);
        return ClienteDto.builder()
                .idCliente(clienteSave.getIdCliente())
                .Nombre(clienteSave.getNombre())
                .apellidoPaterno(clienteSave.getApellidoPaterno())
                .apellidoMaterno(clienteSave.getApellidoMaterno())
                .Dirección(clienteSave.getDirección())
                .Contacto(clienteSave.getContacto())
                .build();
    }

    //Método para Actualizar Persona
    @PutMapping("/cliente/")
    public ClienteDto update(@RequestBody ClienteDto clienteDto){
        ClienteBean clienteUpdate = ClienteService.save(clienteDto);
        return ClienteDto.builder()
                .idCliente(clienteUpdate.getIdCliente())
                .Nombre(clienteUpdate.getNombre())
                .apellidoPaterno(clienteUpdate.getApellidoPaterno())
                .apellidoMaterno(clienteUpdate.getApellidoMaterno())
                .Dirección(clienteUpdate.getDirección())
                .Contacto(clienteUpdate.getContacto())
                .build();
    }

    //Metodo para Eliminar Persona
    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Integer id){
        ClienteBean deleteCliente = ClienteService.findById(id);
        ClienteService.delete(deleteCliente);
    }

    //Método Para Buscar Persona por ID
    @GetMapping("/cliente/{id}")
    public ClienteBean showById(@PathVariable Integer id){ return ClienteService.findById(id); }

    //Método para Buscar a todos los clientes
    @GetMapping("/clientes")
    public List<ClienteBean> findAll(){ return ClienteService.showAll(); }
}
