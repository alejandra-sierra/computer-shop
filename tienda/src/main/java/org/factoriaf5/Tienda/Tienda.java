package org.factoriaf5.Tienda;


import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private final String nombreTienda;
    private final String propietario;
    private final String identificadorTributario;
    private final List<Computadora> listaComputadores;

    public Tienda(String nombreTienda, String propietario, String identificadorTributario) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.listaComputadores = new ArrayList<>();
    }

    public void agregarComputador(Computadora Computadora) {
        listaComputadores.add(Computadora);
    }

    public void eliminarComputador(String marca) {
        listaComputadores.removeIf(Computadora -> Computadora.getMarca().equalsIgnoreCase(marca));
    }

    public Computadora buscarComputador(String marca) {
        for (Computadora Computadora : listaComputadores) {
            if (Computadora.getMarca().equalsIgnoreCase(marca)) {
                return Computadora;
            }
        }
        return null;
    }

    public List<Computadora> listarComputadores() {
        return new ArrayList<>(listaComputadores);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombreTienda='" + nombreTienda + '\'' +
                ", propietario='" + propietario + '\'' +
                ", identificadorTributario='" + identificadorTributario + '\'' +
                ", listaComputadores=" + listaComputadores +
                '}';
    }
}
