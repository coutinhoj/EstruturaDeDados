package fila;

//N�o est� funcionando
public class Principal {
	
	public static void main(String [] args) {
		
		Fila f = new Fila();
		
		f.entrar(8);
		f.entrar(9);
		f.entrar(18);
		f.entrar(36);
		f.sair();
		
		f.listar();
		
	}

}
