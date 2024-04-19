package ar.edu.utn.frba.dds;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    if (this.prendaSuperior.TipoDePrenda.Categoria == PARTE_SUPERIOR) {
      this.prendaSuperior = prendaSuperior;
    }
    else {
      throw new RuntimeException("La prenda ingresada como parte superior no es de categoria parte superior");
    }

    if (this.prendaInferior.TipoDePrenda.Categoria == PARTE_INFERIOR) {
      this.prendaInferior = prendaInferior;
    }
    else {
      throw new RuntimeException("La prenda ingresada como parte inferior no es de categoria parte inferior");
    }

    if (this.calzado.TipoDePrenda.Categoria == CALZADO) {
      this.calzado = calzado;
    }
    else {
      throw new RuntimeException("La prenda ingresada como calzado no es de categoria calzado");
    }
  }
}
