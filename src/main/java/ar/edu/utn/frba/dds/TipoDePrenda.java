package ar.edu.utn.frba.dds;


public class TipoDePrenda {
  Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public static final TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);

  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);

  public static final TipoDePrenda ZAPATILLAS = new TipoDePrenda(Categoria.CALZADO);
}
