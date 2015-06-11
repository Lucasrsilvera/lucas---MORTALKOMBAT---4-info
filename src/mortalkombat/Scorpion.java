package mortalkombat;

public class Scorpion {

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
  

    
 

   
    
    
    
    
    public String spear() {

        return "atras, atras " + socofraco;

    }

    public String takedown() {
        return "baixo , frente, " + chutefraco;
    }

    public String tp() {
        return "baixo ,atras , " + chutefraco;
    }


    public String combo1() {
        return "esquerda , para baixo, " + socofraco + " , " + socoforte;
    }

    public String combo2() {
        return chutefraco + " , " + chutefraco + " , " + socoforte;
    }

    public String fatality2() {
        return "frente, baxo , frente, " + socoforte + " socando o inimigo. ";
    }

    public String fatality() {
        return "atras, frente, atras,  " + chuteforte + "chutando no inimigo. ";
    }

    private String airdeamon() {
        return "atras , atras" + socoforte + "Encostado no inimigo. ";
    }

}

    

