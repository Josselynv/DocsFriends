/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.Datos.Autores;
import com.example.demo.Datos.Documento;
import com.example.demo.Datos.Provincia;
import com.example.demo.repositories.autor_interface;
import com.example.demo.repositories.provincia_interface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gatew
 */
@Service
public class autor_service {

    @Autowired
    private autor_interface autor_inter;

    public Autores buscar(Long id) {
        return autor_inter.findByidAutor(id);
    }

    public List<Autores> listar() {
        return autor_inter.findAll();
    }
    public List<Autores> listar(long doc) {
        return autor_inter.findAutoresByDocumentoId(doc);
    }

    public void save(Autores usua) {

        autor_inter.save(usua);

    }

    public void delete(Autores usua) {
        autor_inter.delete(usua);
    }

}
