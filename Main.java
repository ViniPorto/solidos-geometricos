public class Main {
    public static void main(String[] args){
        //1ª classe = Cilindro
        Cilindro cilindro = new Cilindro(2, 2); //diametro e altura em cm
        System.out.println("Volume do cilindro: " + cilindro.calculaVolume() + " cm³");

        //2ª classe = Cubo
        Cubo cubo = new Cubo(10); //aresta em cm
        System.out.println("Volume do cubo: " + cubo.calculaVolume() + " cm³");

        //3ª classe = Esfera
        Esfera esfera = new Esfera(10); //diametro em cm
        System.out.println("Volume da esfera: " + esfera.calculaVolume() + " cm³");

        //4ª classe = Cone
        Cone cone = new Cone(12, 13); //diametro e altura em cm
        System.out.println("Volume do cone: " + cone.calculaVolume() + " cm³");

    }
}
