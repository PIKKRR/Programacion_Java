package POO.Cine;
class Asiento {
    char letra;
    int numero;
    boolean ocupado;

    // Constructor de la clase Asiento
    public Asiento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
        this.ocupado = false; // Al inicio, ningún asiento está ocupado
    }

    // Método para ocupar el asiento
    public void ocuparAsiento() {
        this.ocupado = true;
    }

    // Método para desocupar el asiento
    public void desocuparAsiento() {
        this.ocupado = false;
    }
}
