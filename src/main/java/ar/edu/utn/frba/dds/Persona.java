package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  private List<Prenda> prendas;

  public Persona() {
    prendas = new ArrayList<Prenda>();
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }
}
