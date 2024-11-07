package Operadores;
public class DefinirEnunciado {
        public static void main(String[] args) {

            /*
            Haz un programa en el que se presenten dos participantes y hagan un lanzamiento cada uno de unos dados.
            El que mayor puntuación saque, es el ganador.
            */
            
            System.out.println("Se presentan los participantes.\nA continuación, hará su lanzamiento el jugador 1");
            double aux1=(Math.random()*6)+0.5;
            double aux2=(Math.random()*6)+0.5;
            double intento1=Math.round(aux1);
            double intento2=Math.round(aux2);
            int jugador1=(int)intento1;
            int jugador2=(int)intento2;
            System.out.println("El jugador 1 ha sacado " + jugador1 + " y el jugador 2 ha sacado " + jugador2);
            int ganador=Math.max(jugador1, jugador2);
            System.out.println("Quien sacó " + ganador + " es el ganador");

            




        }
}
