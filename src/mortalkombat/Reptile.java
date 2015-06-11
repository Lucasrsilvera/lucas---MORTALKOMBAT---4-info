package mortalkombat;

public class Reptile {

  private  String socoforte;
  private  String socofraco;
  private  String chuteforte;
  private  String chutefraco;
  private  String defender;
  private  String pegar;
  private  String especial;
  private Integer vida;
  
    public Integer getVida() {
        return this.vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

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
  
  
  
  
    
    
    public String invisivel() {

        return "baxo , cima " + socoforte;

    }

    public String socofraco() {
        return "baxo , esquerda " + socofraco;
    }

    public String chutefortee() {
        return "esquerdda , direta " + chuteforte;
    }

    public String chutefracoo() {
        return "baxo , tras " + chutefraco;
    }

    public String combo1() {
        return "baxo , cima " + socofraco + " , " + socofraco + " , " + socoforte;
    }

    public String combo2() {
        return chutefraco + " , " + chutefraco + " , " + chuteforte;
    }

    public String fatality1() {
        return "tras , tras , baxo ,cima " + chuteforte + " Distância de um chute ";
    }

    public String fatality() {
        return "baxo , baxo , frente , tras " + socofraco + " Distância um chute ";
    }

    private String bolasupersonica() {
        return "esquerda , direita , esquerda , direita" + chuteforte;
    }

}
