package revisao;

public class ValorInvalidoException extends RuntimeException { //Não monitorada
	public ValorInvalidoException (String mensagem){
		super(mensagem);
	} 
}
