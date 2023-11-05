public class No{

  private double valor;
  private No prox;
  

  public No(double valor){
    this.valor = valor;
    this.prox = null;
  } 

  public No(){
    this.valor = 0;
    this.prox = null;
  }

  public No(double valor, No prox){
    this.valor = valor;
    this.prox = prox;
  } 

  public void setValor(double valor){
    this.valor = valor;
  }

  public void setProximo(No prox){
    this.prox = prox;
  }

  public double getValor(){
    return this.valor;
  }

  public No getProximo(){
    return this.prox;
  }
}
