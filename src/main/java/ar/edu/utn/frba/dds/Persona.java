package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  private List<Prenda> prendas;
  private PrendaBorrador prendaEnConstruccion; //sería el borrador

  public Persona() {
    prendas = new ArrayList<Prenda>();
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void terminarConstruccionPrenda(){
    this.prendas.add(this.prendaEnConstruccion.construirPrenda());
    this.prendaEnConstruccion = null;
  }
}
