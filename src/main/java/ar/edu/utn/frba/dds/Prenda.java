package ar.edu.utn.frba.dds;

public class Prenda {
  private final Integer temperaturaMaxima;
  private final TipoDePrenda tipoDePrenda;
  private final Material material;
  private final Trama trama;
  private final Color colorPrimario;
  private Color colorSecundario;
  private final Formalidad formalidad;

  //no hace falta verificar que no sean nulls en el constructor porque tengo un builder
  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Trama trama, Formalidad formalidad, Integer temperaturaMaxima) {
    this.tipoDePrenda = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
    this.formalidad = formalidad;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  // al ser optativo no lo pongo en el constructor
  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public boolean esDeCategoria(Categoria categoria) {
    return this.tipoDePrenda.getCategoria().equals(categoria);
  }

  public Categoria obtenerCategoria() {
    return this.tipoDePrenda.getCategoria();
  }

  public Boolean esInformal() {
    return this.formalidad == Formalidad.INFORMAL;
  }

  public Boolean esAptaaTemperatura(Integer temperatura) {
    return temperatura <= this.temperaturaMaxima;
  }
}
