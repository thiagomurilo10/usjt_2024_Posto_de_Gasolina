/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.gasolina;

/**
 *
 * @author 824144430
 */
public class Frentista {
    Carro carro;
    Bomba bomba;
    
    Frentista(){
        carro = new Carro(40);
        bomba = new Bomba(carro);
    }
    
    void abastecer() { 
        while (!carro.TanqueCheio()) {
            this.bomba.abastecer();
        }
    }
}
