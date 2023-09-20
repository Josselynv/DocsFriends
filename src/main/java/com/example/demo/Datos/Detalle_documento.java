/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Datos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author gatew
 */
@Entity
@Table(name = "detalle_documento")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Detalle_documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetalle;

    @ManyToOne
    @JoinColumn(nullable = true)
    Autores nombreAutor; /*clave foranea*/

    @ManyToOne
    @JoinColumn(nullable = false)
    Documento idDocumento;
}
