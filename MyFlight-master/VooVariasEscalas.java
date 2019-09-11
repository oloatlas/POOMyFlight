package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{
	
	private ArrayList<Rota> rotas;
	
	public VooVariasEscalas(LocalDateTime dataHora){
		super(dataHora);
		rotas = new ArrayList<>();
	}
	public void addRota(Rota r){
		rotas.add(r);
	}

	@Override
	public Rota getRota() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duration getDuracao() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString(){
		StringBuilder aux = new StringBuilder();
		for(Rota r: rotas){
			aux.append(r + "\n");
		}
		return aux.toString();
	}
	
	

}
