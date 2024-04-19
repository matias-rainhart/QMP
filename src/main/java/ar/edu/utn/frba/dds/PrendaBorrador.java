package ar.edu.utn.frba.dds;


import static java.util.Objects.requireNonNull;

public class PrendaBorrador {
  private TipoDePrenda tipo;
  private Trama trama = Trama.LISA;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public PrendaBorrador(TipoDePrenda tipo) {
    this.tipo = requireNonNull(tipo, "seleccione un tipo de prenda");
  }

  public PrendaBorrador setTrama(Trama trama) {
    this.trama = trama;
    if (trama == null){
      this.trama = Trama.LISA;
    }
    return this;
  }

  public PrendaBorrador setMaterial(Material material) {
    this.material = requireNonNull(material, "seleccione un material de prenda");
    return this;
  }

  public PrendaBorrador setColor(Color colorPrincipal, Color colorSecundario) {
    this.colorPrincipal = requireNonNull(colorPrincipal, "seleccione un color principal para la prenda");
    this.colorSecundario = colorSecundario;
    return this;
  }

  public Prenda construirPrenda(){
  if (tipo == null || material == null || colorPrincipal == null){
   throw new RuntimeException(" PRENDA NO VÁLIDA !! faltan datos obligatorios para crear la prenda");
  }

  Prenda prenda = new Prenda(tipo, material, colorPrincipal, trama);
  if (colorSecundario != null){
    prenda.setColorSecundario(colorSecundario);
  }

  return prenda;
  }

}