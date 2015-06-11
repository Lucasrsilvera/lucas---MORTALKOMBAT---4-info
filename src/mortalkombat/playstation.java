/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortalkombat;


public class playstation {

    
    public static void main(String[] args) {
        
        
        
        
        
        Reptile boneco2 = new Reptile();
        
        boneco2.setSocoforte(" triangulo ");
        
        boneco2.setSocofraco(" quadrado ");
        
        boneco2.setChuteforte(" x ");    
        
        boneco2.setChutefraco(" circulo ");
        
        boneco2.setDefender(" l1 e r2 ");
        
        boneco2.setEspecial("l1 e r1 ");     
      
        System.out.println("playstation");
        System.out.println("\n Botões");
        System.out.println(" Soco Forte: " + boneco2.getSocoforte());
        System.out.println(" Soco Fraco: " + boneco2.getSocofraco());
        System.out.println(" Chute Forte: " + boneco2.getChuteforte() );
        System.out.println(" Chute Fraco: "  + boneco2.getChutefraco());
        System.out.println(" Defesa: " + boneco2.getDefender());
        System.out.println(" Especial: " + boneco2.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + boneco2.getVida() + " % ");
        
        
        
        System.out.println("\nComandos Especiais");
        System.out.println("Invisivel: "  +  boneco2.invisivel());
        System.out.println("Ácido: " + boneco2.socofraco());
        System.out.println("Bola Rápida: " + boneco2.chutefortee());
        System.out.println("Bola Lenta: " + boneco2.chutefracoo());
        System.out.println("Combo 1: " + boneco2.combo1());
        System.out.println("Combo 2: " + boneco2.combo2() );
        System.out.println("Fatalyty 1: " + boneco2.fatality());
        System.out.println("Fatality 2: " + boneco2.fatality1());
    
    
    
    }
}
    

