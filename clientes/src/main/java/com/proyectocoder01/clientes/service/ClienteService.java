package com.proyectocoder01.clientes.service;

import com.proyectocoder01.clientes.dto.ClienteDto;
import com.proyectocoder01.clientes.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente buscarPorDni(int dni);
    List<Cliente> buscarTodosLosClientes();

    ClienteDto getClienteDto(Integer dni);


}
