/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_ErickP.repository;

/**
 *
 * @author porto
 */

import Tienda_ErickP.domain.Ruta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RutaRepository extends JpaRepository<Ruta, Integer>{
    List<Ruta> findAllByOrderByRequiereRolAsc();
}
