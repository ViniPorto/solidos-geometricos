import java.lang.Math;

public class Cubo {
    public float aresta; //medida em cm

    public Cubo(float aresta){
        this.aresta = aresta;
    }

    public float getAresta() {
        return aresta;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }

    public double calculaVolume(){
        return Math.pow(aresta, 3);
    }
}
