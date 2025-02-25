
public class Usuario {

    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();



        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("canal atual ?" + smartTv.canal);
        System.out.println("volume atual ?" + smartTv.volume);
   
        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada?  " + smartTv.ligada);
   
        smartTv.desligar ();
        System.out.println("Novo Status -> TV ligada?  " + smartTv.ligada);
    }

}