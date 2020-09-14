-- TABLA: CATEGORIA
CREATE TABLE categoria(
    categoriaid NUMBER NOT NULL,
    nombre VARCHAR(50),
    
    CONSTRAINT categoriaid_pk PRIMARY KEY (categoriaid)
);

-- TABLA: PRODUCTO
CREATE TABLE producto(
    productoid NUMBER NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    valor NUMBER NOT NULL,
    categoriaid NUMBER,
    
    CONSTRAINT productoid_pk PRIMARY KEY (productoid),
    CONSTRAINT categoriaid_fk FOREIGN KEY (categoriaid) REFERENCES categoria (categoriaid)
);
-- TABLA: FACTURA
CREATE TABLE factura(
    facturaid NUMBER NOT NULL,
    cliente VARCHAR(50),
    fecha VARCHAR(10),
    
    CONSTRAINT facturaid_pk PRIMARY KEY (facturaid)
);
-- TABLA: DETALLEFACTURA
CREATE TABLE detallefactura(
    facturaid NUMBER NOT NULL,
    productoid NUMBER,
    cantidad NUMBER NOT NULL,
    
    CONSTRAINT detallefactura_pk PRIMARY KEY (facturaid, productoid),
    CONSTRAINT detallefactura_facturaid_fk FOREIGN KEY (facturaid) REFERENCES factura (facturaid),
    CONSTRAINT detallefactura_productoid_fk FOREIGN KEY (productoid) REFERENCES producto (productoid)
);

