package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Prenda> prendas;
  private PrendaBuilder prendaEnConstruccion; //sería el borrador
  private List<Atuendo> atuendos;
  private Integer edad;
  private GeneradorSugerencias generadorDeSugerencias;

  public Usuario(Integer edad, GeneradorSugerencias generadorDeSugerencias) {
    prendas = new ArrayList<Prenda>();
    atuendos = new ArrayList<Atuendo>();
    this.edad = requireNonNull(edad);
    this.generadorDeSugerencias = requireNonNull(generadorDeSugerencias);
  }

  public void agregarAtuendo(Atuendo atuendo) {
    this.atuendos.add(atuendo);
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

  public List<Atuendo> generarSugerencias() {
    return generadorDeSugerencias.generarSugerenciasCon(this.prendas, this.edad);
  }
}
