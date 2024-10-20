package controller;

import service.NavegadorService;
import service.ReproducaoMusicalService;
import service.TelefonicoService;

public class Iphone {

    public static void main(String[] args) {

        TelefonicoService telefonicoService = new TelefonicoService();
        telefonicoService.ligar("123456789");
        telefonicoService.atender();
        telefonicoService.iniciarCorreioVoz();

        System.out.println("#####################################");

        ReproducaoMusicalService reproducaoMusicalService = new ReproducaoMusicalService();
        reproducaoMusicalService.selecionarMusica("Musica");
        reproducaoMusicalService.tocar();
        reproducaoMusicalService.pausar();

        System.out.println("#####################################");

        NavegadorService navegadorService = new NavegadorService();
        navegadorService.exibirPagina("hhtps://teste.com");
        navegadorService.adicionarNovaAba();
        navegadorService.atualizarPagina();

    }
}
