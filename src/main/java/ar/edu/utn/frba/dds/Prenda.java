package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Trama trama) {
    this.tipoDePrenda = requireNonNull(tipo, "tipo de prenda es obligatorio");
    this.material = requireNonNull(material, "material es obligatorio");
    this.colorPrimario = requireNonNull(colorPrimario, "color primario es obligatorio");
    if (trama == null){
      trama = Trama.LISA;
    }
    this.trama = requireNonNull(trama, "trama es obligatorio");
  }

  // al ser optativo no lo pongo en el constructor
  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
