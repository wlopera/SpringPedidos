-- CONEXION A POSTGRES SQL
-- driver = org.postgresql.Driver
-- url =jdbc:postgresql://localhost:5432/nombre_BD
-- usuario = nombre_usuario
-- clave = clave_bd

-- Table: public.pedidos

-- DROP TABLE public.pedidos;
create table pedidos(
  id serial,
  idCliente integer,
  idProducto integer,
  unidades integer,
  primary key (id)
 );
 
 