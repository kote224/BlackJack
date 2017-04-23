import java.awt.*;
import java.applet.*;
//metodo para extraer cartas y otro para barajar cartas
public class Carta{
	int valor;
	Image imagen;
	int x,y;
	int width=50;
	int height=90;
    public Carta(int posx, int posy, int v, Image img) {
    	valor = v;
    	imagen = img;
    	x=posx;
    	y=posy;
    	
    }

    public void dibujar(Graphics g, Applet a){
		g.drawImage(imagen, x, y,width,height,a);
		/*for(int i=0; i<numeros_apostados.size(); i++)
			g.drawString("" + numeros_apostados.get(i), x + (i*10), y);
		*/
    }
}