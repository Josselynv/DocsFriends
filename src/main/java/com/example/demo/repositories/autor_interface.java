/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories;

import com.example.demo.Datos.Autores;
import com.example.demo.Datos.Documento;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alvar
 */
@Repository
public interface autor_interface extends JpaRepository<Autores, Serializable> {

    Autores findByidAutor(long idAutor);

    @Query(value = "SELECT ac.* FROM autores ac INNER JOIN detalle_documento dc ON dc.nombre_autor_id_autor = ac.id_autor WHERE dc.id_documento_id_documento = :documentoId", nativeQuery = true)
    List<Autores> findAutoresByDocumentoId(@Param("documentoId") Long documentoId);
}
