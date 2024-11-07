package POO.TiendaAnime;
public class Manga extends ArticuloAnime {

    private int volumen;

    public Manga(String nombre,int precio, String Descripción, int volumen){
        super(nombre, precio, Descripción);
        this.volumen=volumen;
    }
    @Override
    public String getDescripcion(){
        return super.getDescripcion()  + ", Volumen:" + volumen;
    }
    
}
