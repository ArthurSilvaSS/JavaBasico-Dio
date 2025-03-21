package sistemaSmartTv;

public class SmartTv {
    // Declarando Variaveis

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Metodos
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
        System.out.println("A justando o volume da tv para -> " + volume);
    }

    public void diminuirVolume() {
        //volume = volume -1;
        volume--;
        System.out.println("A justando o volume da tv para -> " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Novo canal ajustado " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("A justando o canal da tv para -> " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("A justando o canal da tv para -> " + canal);
    }


}
