package ar.edu.utn.frba.dds;


public class TipoDePrenda {
  Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
