package mortalkombat;

public class Subzero {
private  String socoforte;
  private  String socofraco;
  private  String chuteforte;
  private  String chutefraco;
  private  String defender;
  private  String pegar;
  private  String especial;
  private Integer vida;

    public String getSocoforte() {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefender() {
        return defender;
    }

    public void setDefender(String defender) {
        this.defender = defender;
    }

    public String getPegar() {
        return pegar;
    }

    public void setPegar(String pegar) {
        this.pegar = pegar;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    
  

    
 

   
    
    
    
    
    public String gelofrente() {

        return "atras , frente " + socoforte;

    }

    public String gelochao() {
        return "baxo , frente " +chuteforte;
    }

    public String slide() {
        return "esquerda , direita " + socofraco;
    }

    public String combo1() {
        return  socofraco + " , " + socofraco + " , " + socoforte;
    }

    public String combo2() {
        return chutefraco + " , " + socoforte + " , " + chuteforte;
    }

    public String fatality2() {
        return "Trás, Frente, Baixo, Frente, " + chutefraco + " Distância de um chute ";
    }

    public String fatality() {
        return "baxo , atras , baxo , frente,  " + socoforte + " distancia de um chute. ";
    }

    private String supergelo() {
        return "baxo , atras," + chuteforte + " cima, baixo " + pegar ;
    
    
}
}