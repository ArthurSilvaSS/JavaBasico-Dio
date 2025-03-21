package sistemaSmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("----------ESTADO INICIAL----------");

        System.out.println("A Tv esta Ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? " + smartTv.volume);

        System.out.println("----------------------------------");

        smartTv.ligar();
        System.out.println("Estado atual da tv -> " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Estado atual da Tv -> " + smartTv.ligada);

        System.out.println("----------------------------------");

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("----------------------------------");

        smartTv.mudarCanal(15);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();


    }
}
