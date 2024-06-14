package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Prenda> prendas;
  private PrendaBuilder prendaEnConstruccion; //sería el borrador

  public Usuario() {
    prendas = new ArrayList<Prenda>();
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void comenzarConstruccionDePrenda(TipoDePrenda tipo) {
    this.prendaEnConstruccion = new PrendaBuilder(tipo);
  }

  public void terminarConstruccionPrenda() {
    this.prendas.add(this.prendaEnConstruccion.construirPrenda());
    this.prendaEnConstruccion = null;
  }
}
