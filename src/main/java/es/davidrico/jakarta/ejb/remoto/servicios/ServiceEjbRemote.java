package es.davidrico.jakarta.ejb.remoto.servicios;

import jakarta.ejb.Remote;
import es.davidrico.jakarta.ejb.remoto.modelos.Producto;

import java.util.List;

@Remote
public interface ServiceEjbRemote {
    String saludar(String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}
