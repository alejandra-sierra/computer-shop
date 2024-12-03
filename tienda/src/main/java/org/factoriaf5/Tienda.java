package org.factoriaf5;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private final String nombreTienda;
    private final String propietario;
    private final String identificadorTributario;
    private final List<Computadora> listaOrdenadores;

    public Tienda(String nombreTienda, String propietario, String identificadorTributario) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.listaOrdenadores = new ArrayList<>();
    }

    public void agregarOrdenador(Computadora Computadora) {
        listaOrdenadores.add(Computadora);
    }

    public void eliminarOrdenador(String marca) {
        listaOrdenadores.removeIf(Computadora -> Computadora.getMarca().equalsIgnoreCase(marca));
    }

    public Computadora buscarOrdenador(String marca) {
        for (Computadora Computadora : listaOrdenadores) {
            if (Computadora.getMarca().equalsIgnoreCase(marca)) {
                return Computadora;
            }
        }
        return null;
    }

    public List<Computadora> listarOrdenadores() {
        return new ArrayList<>(listaOrdenadores);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombreTienda='" + nombreTienda + '\'' +
                ", propietario='" + propietario + '\'' +
                ", identificadorTributario='" + identificadorTributario + '\'' +
                ", listaOrdenadores=" + listaOrdenadores +
                '}';
    }
}
