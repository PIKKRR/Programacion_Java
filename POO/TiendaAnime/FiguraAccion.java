package POO.TiendaAnime;
public class FiguraAccion extends ArticuloAnime {

    private String personaje;

    public FiguraAccion(String nombre, int precio, String descripcion, String personaje) {
        super(nombre, precio, descripcion);
        this.personaje = personaje;
    }
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + ", Personaje: " + personaje;
    }

}
