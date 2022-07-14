package com.proyectocoder01.clientes.controller;

//http://localhost:8080/coderhouse/cliente/getClienteDto/1
import com.proyectocoder01.clientes.dto.ClienteDto;
import com.proyectocoder01.clientes.model.Cliente;
import com.proyectocoder01.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("coderhouse/cliente")
public class ClienteController {

    @Autowired
     ClienteService clienteService;


    @GetMapping("")
    public List<Cliente> buscarTodosLosCliente(){
        return clienteService.buscarTodosLosClientes();
    }


    @GetMapping("/{dni}") //parametro
    public Cliente buscarPorDni(@PathVariable int dni){
        return clienteService.buscarPorDni(dni);
    }


    @GetMapping("/getClienteDto/{id}")
    public ClienteDto getClienteDto(@PathVariable (value="id")int id){
        return clienteService.getClienteDto(id);
    }

}
