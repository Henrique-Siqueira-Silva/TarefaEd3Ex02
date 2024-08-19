package controller;

public class TarefaEd3EX02 {
	
	public TarefaEd3EX02 () {
		super();
	}
		
	public int Ex02 (int num, int quanti, int procurado){
		if (num < 1 ) {
//			O parametro de parada foi definido assim pois caso o num seja < que 0 a função recursiva já poercorreu todo o numero.
			return quanti;
		}
		else if ( num % 10 == procurado) {
					quanti++;
				
			}
		
		return Ex02 (num / 10   , quanti, procurado);
//		Já a chamada nessa chamada dos passos, totas as variaveis se mantem normais por não existe necessidade de alteralas

	}
}
