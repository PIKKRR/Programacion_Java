package POO.TiendaAnime;
public class DVDAnime extends ArticuloAnime{

    private int duracionMinutos;

    public DVDAnime(String nombre, int precio, String descripcion, int duracionMinutos){
        super(nombre, precio, descripcion);
        this.duracionMinutos=duracionMinutos;
    }
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + ", Duración en minutos: " + duracionMinutos;
    }
}
