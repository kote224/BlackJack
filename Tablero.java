import java.awt.*;
import java.applet.*;
import java.net.*;

public class Tablero extends Applet{
	public static final int NUM_CARTAS = 52;
	Image imagen;
	Image imgsCartas[];
	Carta cartas[];
    public void init() {
    	imgsCartas = new Image[NUM_CARTAS];
    	cartas = new Carta[NUM_CARTAS];
    	String nombres[] ={"_of_clubs","_of_hearts","_of_spades","_of_diamonds"};
    	for(int i=0; i<4; i++)
    		for(int j=0;j<13;j++)
    			imgsCartas[(i*13)+j] = getImage(getCodeBase(), "Cartas/" + (j+1) + nombres[i] + ".png");
    			
    		for(int z=0; z<NUM_CARTAS; z++){
    			cartas[z]=new Carta(100,70,z,imgsCartas[z]);
    			
    	}	
    }
    public void paint(Graphics g){
    	for(int i=0; i<NUM_CARTAS; i++)
				cartas[i].dibujar(g,this);
    	
    	//g.drawImage(imgsCartas[7],200,200,100,100, this);
   		g.drawImage(imagen, 0, 0, this);
   	}
}