import java.lang.Math;

public class Cilindro{
    public float diametro; //diametro da base do cilindro -> diametro / 2 = raio, medida em cm
    public float altura; //altura do cilindro, medida em cm

    public Cilindro(float diametro, float altura){
        this.diametro = diametro; 
        this.altura = altura; 
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calculaVolume(){
        float raio = diametro / 2;
        return (Math.PI * (Math.pow(raio, 2))) * altura;
    }
}