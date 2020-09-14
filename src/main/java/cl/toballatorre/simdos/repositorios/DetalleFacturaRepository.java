package cl.toballatorre.simdos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.toballatorre.simdos.modelos.DetalleFactura;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {

}
