public class SmartTv { boolean ligada= false; int canal= 1; int volume = 25;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal () {
        canal++;
        System.out.println("mudei o canal para : "+ canal);
    }
    public void diminuirCanal () {
        canal--;
        System.out.println("mudei o canal para : "+ canal);
    }

    public void ligar() {
        ligada=true;
    } 
    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        volume++; //volume = volume + 1 
        System.out.println("Aumentando o volume para: "+ volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo o volume para: "+ volume);
    
    }
}