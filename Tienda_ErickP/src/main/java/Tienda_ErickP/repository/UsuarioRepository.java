/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_ErickP.repository;

import Tienda_ErickP.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 *
 * @author porto
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
        Optional<Usuario> findByUsernameAndActivoTrue(String username);
        
}
