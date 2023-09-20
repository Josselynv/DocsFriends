/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.Datos.Detalle_documento;
import com.example.demo.repositories.Detalledocumento_interface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gatew
 */
@Service
public class Detalledocumento_service {
    @Autowired
    private Detalledocumento_interface Detalleinterface; 

    public Detalle_documento buscar(Long id)
    {
        return Detalleinterface.findByidDetalle(id);
    }
    
    public List<Detalle_documento> listar()
    {
        return Detalleinterface.findAll();
    }
    
    
    public void save(Detalle_documento usua)
    {

            Detalleinterface.save(usua);

        
    }
    
    public void delete(Detalle_documento usua)
    {
        Detalleinterface.delete(usua);
    }
}
