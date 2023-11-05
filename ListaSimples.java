public class ListaSimples {
  private No inicio;
  private No fim;
  private int tamanho;

  public ListaSimples() { // Construtor
    this.inicio = null;
    this.fim = null;
    this.tamanho = 0;
  }

  public int tamanho() {
    return this.tamanho;
  }

  public boolean ehVazia() {
    if ((this.inicio == null) && (this.fim == null)) {
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

  public void insereElementoFim(double x) {
    No novo = new No(x);
    this.fim.setProximo(novo);
    this.fim = novo;
    this.tamanho++;
  }

  public void insereElementoComeco(double x) {
    No novo = new No(x);
    novo.setProximo(this.inicio);
    this.inicio = novo;
    this.tamanho++;
  }

  public void inseleElementoMeio(double x, int pos) {
    No novo = new No(x);
    No aux = this.inicio;
    for (int i = 1; i < pos; i++) {
      aux = aux.getProximo();
    }
    novo.setProximo(aux.getProximo());
    aux.setProximo(novo);
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
      inserePrimeiroElemento(x);
      return true;
    }
  }

  public void print() {
    No aux = this.inicio;
    do {
      System.out.println("lista[] = " + aux.getValor());
      aux = aux.getProximo();
    } while (aux != null);
  }

  public void removeElementoInicio() {
    No temp = this.inicio;
    this.inicio.setProximo(temp.getProximo());
    temp = null;
    this.tamanho--;
  }

  public void removeElementoFinal() {
    No temp = this.fim;
    No ant = this.inicio;
    do {
      ant = ant.getProximo();
    } while (ant.getProximo() != null);
    ant.setProximo(null);
    this.fim = ant;
    this.tamanho--;
  }

  public void removeElementoMeio(int pos) {
    No ant = this.inicio;
    for (int i = 1; i < pos; i++) {
      ant = ant.getProximo();
    }
  }

}
