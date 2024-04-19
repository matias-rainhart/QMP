package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.TipoDePrenda.CHOMBA;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    if (this.prendaSuperior.esDeCategoria(Categoria.PARTE_SUPERIOR)) {
      this.prendaSuperior = prendaSuperior;
    }
    else {
      throw new RuntimeException("La prenda ingresada como parte superior no es de categoria parte superior");
    }

    if (this.prendaInferior.esDeCategoria(Categoria.PARTE_INFERIOR)) {
      this.prendaInferior = prendaInferior;
    }
    else {
      throw new RuntimeException("La prenda ingresada como parte inferior no es de categoria parte inferior");
    }

    if (this.calzado.esDeCategoria(Categoria.CALZADO)) {
      this.calzado = calzado;
    }
    else {
      throw new RuntimeException("La prenda ingresada como calzado no es de categoria calzado");
    }
  }

  // Los distintos uniformes que pone como ejemplos serían distintos objetos de la clase uniforme
}


