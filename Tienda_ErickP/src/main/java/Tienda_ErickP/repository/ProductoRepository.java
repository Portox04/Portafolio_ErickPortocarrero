/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_ErickP.repository;

/**
 *
 * @author porto
 */
import Tienda_ErickP.domain.Producto;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    public List<Producto> findByActivoTrue();
    
    public List<Producto> findByDescripcionContainingIgnoreCase(String texto);
    
    public List<Producto> findByPrecioBetweenOrderByPrecioAsc(BigDecimal precioInf, BigDecimal precioSub);
    
    @Query(value = "SELECT p FROM Producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.precio ASC")
    public List<Producto> consultaJPQL(@Param(value = "precioInf")
    BigDecimal precioInf, @Param(value = "precioSup")
    BigDecimal precioSup);


    @Query(value = "SELECT * FROM producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.precio ASC",
           nativeQuery = true)
    public List<Producto> consultaSQL(@Param(value = "precioInf")
    BigDecimal precioInf, @Param(value = "precioSup")
    BigDecimal precioSup);
}

