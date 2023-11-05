public class ListaSimples {
  private No inicio;
  private No fim;
  private int tamanho;

  public ListaSimples(){ // Construtor
    this.inicio = null;
    this.fim = null;
    this.tamanho = 0;
  }

  public int tamanho() {
    return this.tamanho;
  }

  public boolean ehVazia(){
    if ((this.inicio == null) && (this.fim == null)){
      return true;
    } else {
      return false;
    }
  }

  public void inserePrimeiroElemento(double x) {
    No novo = new No(x);
    this.inicio = novo;
    this.fim = novo;
    this.tamanho++;
  }

  public void insereElementoFim(double x){
    No novo = new No(x);
    this.fim.setProx(novo);
    this.fim = novo;
    this.tamanho++;
  }

  public void insereElementoComeco(double x){
    No novo = new No(x);
    novo.setProx(this.inicio);
    this.inicio = novo;
    this.tamanho++;
  }

  public void inseleElementoMeio(double x, int pos) {
    No novo = new No(x);
    No aux = this.inicio;
    for (int i = 1; i < pos; i++) {
      aux = aux.getProx();
    }
    novo.setProx(aux.getProx());
    aux.setProx(novo);
    this.tamanho++;
  }

  public boolean insereElemento(double x, int pos) {
    if (!ehVazia()) {
      if ((pos > 0) && (pos < this.tamanho)) {
        inseleElementoMeio(x, pos);
      } else if (pos == 0) {
        insereElementoComeco(x);
      } else if (pos == this.tamanho) {
        insereElementoFim(x);
      }
      return true;
    } else {
      return false;
    }
  }

  public void print() {
    No aux = this.inicio;
    do {
      System.out.println("lista[] = " + aux.getValor());
      aux = aux.getProx();
    } while (aux != null);
  }
}
