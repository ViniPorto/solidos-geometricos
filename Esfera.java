import java.lang.Math;

public class Esfera {
    public float diametro; //medida em cm

    public Esfera(float diametro){
        this.diametro = diametro;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public double calculaVolume(){
        float raio = diametro / 2;
        return (4 * Math.PI * Math.pow(raio, 3)) / 3;
    }
}
