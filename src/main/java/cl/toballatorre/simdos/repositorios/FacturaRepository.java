package cl.toballatorre.simdos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.toballatorre.simdos.modelos.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
