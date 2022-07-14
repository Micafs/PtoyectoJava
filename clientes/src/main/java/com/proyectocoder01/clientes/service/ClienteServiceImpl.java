package com.proyectocoder01.clientes.service;

import com.proyectocoder01.clientes.dto.ClienteDto;
import com.proyectocoder01.clientes.model.Cliente;
import com.proyectocoder01.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
    //Va a traerme las cosas de la base de datos
    @Autowired
    ClienteRepository ClienteRepository;

    @Override //Metodos que tiene la interfaz
    public Cliente buscarPorDni(int dni) {
        return null;
    }

    @Override
    public List<Cliente> buscarTodosLosClientes() {
        return null;
    }

    @Override
    public ClienteDto getClienteDto(Integer dni) {
        ClienteDto clienteDto=new ClienteDto();

        Cliente clienteObtener = ClienteRepository.findById(dni).orElseThrow(RuntimeException::new);
        clienteDto.setDni(clienteObtener.getDni());
        clienteDto.setNombre(clienteObtener.getNombre());
        clienteDto.setApellido(clienteObtener.getApellido());

        LocalDate fechaInicial = clienteObtener.getFecha_nacimiento().toInstant().atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate fechaActual= LocalDate.now();
        clienteDto.setEdad(Period.between(fechaInicial,fechaActual).getYears());

        return clienteDto;
    }




}
