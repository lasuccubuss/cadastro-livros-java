
 
 public class TestaLivro{
     
	 
	 public static void main (String[] args){
    Livro l1 = new Livro();
    Livro l2 = new Livro(452, "O Idiota", 600);
    Livro l3 = new Livro(l2);

    int codLivro = 123;
    String tituloLivro = "Orgulho e Preconceito";
    double precoLivro = 150.20;

    l1.setCodigo(codLivro);
    l1.setTitulo(tituloLivro);
    l1.setPreco(precoLivro);	
	
	System.out.println("Código do livro: " + l1.getCodigo());
	System.out.println("Título: " + l1.getTitulo());	
	System.out.println("Código do livro: " + l1.getPreco());
	
	System.out.println("Código do livro: " + l2.getCodigo());
	System.out.println("Título: " + l2.getTitulo());	
	System.out.println("Código do livro: " + l2.getPreco());
	
	System.out.println("Código do livro: " + l3.getCodigo());
	System.out.println("Título: " + l3.getTitulo());	
	System.out.println("Código do livro: " + l3.getPreco());
	
	l1.livroCaro();
	l2.livroCaro();
	l3.livroCaro();
	
	      if(l1.livroCaro()){
			  System.out.println("Esse livro é caro");
		  } else {
			  System.out.println("Valor acessível! ");
		  }
		  if(l2.livroCaro()){
			  System.out.println("Esse livro é caro!");
		  } else {
			  System.out.print("Valor acessível");
		  }	     
		  if(l3.livroCaro()){
			  System.out.println("Esse livro é caro!");
		  } else {
			  System.out.println("Valor acessível");
		  }
	
     }
 }