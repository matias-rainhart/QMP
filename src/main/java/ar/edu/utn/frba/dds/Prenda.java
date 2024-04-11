package ar.edu.utn.frba.dds;

public class Prenda {
  private Tipo tipo;
  private String material;
  private String colorPrimario;
  private String colorSecundario;

  public Prenda(Tipo tipo, String material, String colorPrimario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  // al ser optativo no lo pongo en el constructor
  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
