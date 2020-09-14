package cl.toballatorre.simdos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.toballatorre.simdos.modelos.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
