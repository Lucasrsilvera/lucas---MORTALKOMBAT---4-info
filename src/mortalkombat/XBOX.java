/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortalkombat;


public class XBOX {

    
    public static void main(String[] args) {
        
        
        
        
        Reptile boneco = new Reptile();
        
        boneco.setSocoforte("y");
        
        boneco.setSocofraco("x");
        
        boneco.setChuteforte("a");
        
        boneco.setChutefraco("b");
        
        boneco.setDefender("lt e rt");
        
        boneco.setEspecial("lb e rt");
  
        System.out.println("  XBOX  ");
        System.out.println("\nBotões");
        System.out.println(" Soco Forte: " + boneco.getSocoforte());
        System.out.println(" Soco Fraco: " + boneco.getSocofraco());
        System.out.println(" Chute Forte: " + boneco.getChuteforte() );
        System.out.println(" Chute Fraco: "  + boneco.getChutefraco());
        System.out.println(" Defesa: " + boneco.getDefender());
        System.out.println(" Especial: " + boneco.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + boneco.getVida() + " % ");
        System.out.println("\nComandos Especiais");
        System.out.println("Invisivel: "  +  boneco.invisivel());
        System.out.println("Ácido: " + boneco.socofraco());
        System.out.println("Bola Rápida: " + boneco.chutefortee());
        System.out.println("Bola Lenta: " + boneco.chutefracoo());
        System.out.println("Combo 1: " + boneco.combo1());
        System.out.println("Combo 2: " + boneco.combo2() );
        System.out.println("Fatalyty 1: " + boneco.fatality());
        System.out.println("Fatality 2: " + boneco.fatality1());
        Scorpion a = new Scorpion();
        a.setSocoforte("y");
        a.setSocofraco("x");
        a.setChuteforte("a");
        a.setChutefraco("b");
        a.setDefender("lt e rt");
        a.setEspecial("lb e rt");
        System.out.println("xbox 360");
        System.out.println("\nConfigurações de Botões");
        System.out.println(" Soco Forte: " + a.getSocoforte());
        System.out.println(" Soco Fraco: " + a.getSocofraco());
        System.out.println(" Chute Forte: " + a.getChuteforte() );
        System.out.println(" Chute Fraco: "  + a.getChutefraco());
        System.out.println(" Defesa: " + a.getDefender());
        System.out.println(" Especial: " + a.getEspecial() );
        System.out.println(" persogens começam com vida de " + a.getVida() + " % ");
        System.out.println("\nComandos Especiais");
        System.out.println("Invisivel: "  + a.spear() );
        System.out.println("Ácido: " + a.takedown() );
        System.out.println("Bola Rápida: " + a.tp());
        System.out.println("Combo 1: " + a.combo1());
        System.out.println("Combo 2: " + a.combo2());
        System.out.println("Fatalyty 1: " + a.fatality());
        System.out.println("Fatality 2: " + a.fatality2());
    
        
    
    }
    }
    

