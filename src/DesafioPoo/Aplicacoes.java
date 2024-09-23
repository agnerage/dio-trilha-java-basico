package DesafioPoo;

public class Aplicacoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligando para o número discado");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Site Desejado");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }
}
