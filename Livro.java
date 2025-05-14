public class Livro{

  private int codigo;
  private String titulo;
  private double preco;
  
  public Livro(){
	  
  }
  public Livro(int codigo, String titulo, double preco){
	  this.codigo = codigo;
	  this.titulo = titulo;
	  this.preco = preco;
  }
  public Livro(Livro livro){
	  this.codigo = livro.getCodigo();
	  this.titulo = livro.getTitulo();
	  this.preco = livro.getPreco();
  }
  
  
  
  public int getCodigo(){
	  return codigo;
  }
  public String getTitulo(){
	  return titulo;
  }
  public double getPreco(){
	  return preco;
  }
  
  public void setCodigo(int codigo){
	  this.codigo = codigo;
  }
  public void setTitulo(String titulo){
	  this.titulo = titulo;
  }
  public void setPreco(double preco){
	  this.preco = preco;
  }
  
  public boolean livroCaro(){
	  if(preco > 200){
          return true;		  
	  } else {
		  return false;
	  }
  }

}