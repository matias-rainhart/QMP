package ar.edu.utn.frba.dds;


import static java.util.Objects.requireNonNull;

public class PrendaBuilder {
  private final TipoDePrenda tipo;
  private Trama trama = Trama.LISA;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Formalidad formalidad;

  public PrendaBuilder(TipoDePrenda tipo) {
    this.tipo = requireNonNull(tipo, "seleccione un tipo de prenda");
  }

  public PrendaBuilder conTrama(Trama trama) {
    this.trama = trama;
    if (trama == null) {
      this.trama = Trama.LISA;
    }
    return this;
  }

  public PrendaBuilder conMaterial(Material material) {
    this.material = requireNonNull(material, "seleccione un material de prenda");
    return this;
  }

  public PrendaBuilder conColor(Color colorPrincipal, Color colorSecundario) {
    this.colorPrincipal = requireNonNull(colorPrincipal, "seleccione un color principal para la prenda");
    this.colorSecundario = colorSecundario;
    return this;
  }

  public PrendaBuilder conFormalidad(Formalidad formalidad) {
    this.formalidad = requireNonNull(formalidad, "seleccione una formalidad para la prenda");
    return this;
  }

  public Prenda construirPrenda() {
    if (tipo == null || material == null || colorPrincipal == null) {
      throw new RuntimeException(" PRENDA NO VÁLIDA !! faltan datos obligatorios para crear la prenda");
    }

    Prenda prenda = new Prenda(tipo, material, colorPrincipal, trama, formalidad);
    if (colorSecundario != null) {
      prenda.setColorSecundario(colorSecundario);
    }

    return prenda;
  }

}
