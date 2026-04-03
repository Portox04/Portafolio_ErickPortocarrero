/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_ErickP.repository;

import Tienda_ErickP.domain.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author porto
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
    public Optional<Rol> findByRol(String Rol);
    
}
