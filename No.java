public class No{

  private double valor;
  private No prox;

  public No(double valor){
    this.valor = valor;
    this.prox = null;
  } 

  public No(){
    this.ponto = 0;
    this.ponto = null;
  }

  public No(double valor, No prox){
    this.valor = valor;
    this.prox = prox;
  } 

  public void setValor(){
    this.valor = valor;
  }

  public void setProx(){
    this.prox = prox;
  }

  public double getValor(){
    return this.valor;
  }

  public double getProx(){
    return this.prox;
  }
}
