/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories;

import com.example.demo.Datos.Autores;
import com.example.demo.Datos.Detalle_documento;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gatew
 */
@Repository
public interface Detalledocumento_interface extends JpaRepository<Detalle_documento, Serializable> {
    Detalle_documento findByidDetalle(long idDetalle);
    List<Autores> findBynombreAutor(Autores nombreAutor);

}

