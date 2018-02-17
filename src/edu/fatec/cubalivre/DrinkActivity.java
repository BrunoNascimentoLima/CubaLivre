package edu.fatec.cubalivre;

import edu.fatec.cubalivre.R;

import edu.fatec.javaBeans.Drink;
import edu.fatec.javaBeans.Fuzzy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DrinkActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drink);
		
	}
	
    public void EscolhaCocaClick(View v){
    	setContentView(R.layout.cocacola);
	}
	
    public void EscolhaPepsiClick(View v){
		setContentView(R.layout.pepsicola);
		
	}

    public void PaladarCocaClick(View v){
    	EditText txtCoca=(EditText) findViewById(R.id.txtCoca);
		EditText txtRun=(EditText) findViewById(R.id.txtRunCoca);    
		EditText txtGelo=(EditText) findViewById(R.id.txtGeloCoca);
		
		if(txtCoca.getText().toString().length() <= 0){
			txtCoca.setError("Preencha o campo Coca-cola.");
			txtCoca.requestFocus();
		}else if(txtRun.getText().toString().length() <= 0){
			txtRun.setError("Preencha o campo Run.");
			txtRun.requestFocus();
		} else if(txtGelo.getText().toString().length() <= 0){
			txtGelo.setError("Preencha o campo Gelo.");
			txtGelo.requestFocus();
		}else{
		
			  float coca =Float.valueOf(txtCoca.getText().toString());
			  float run =Float.valueOf(txtRun.getText().toString());
			  float gelo =Float.valueOf(txtGelo.getText().toString());
			if(coca < 50 || coca > 60){
				Toast.makeText(getBaseContext(),"O valor de Coca deve estar entre 50ml e 60ml"
						, Toast.LENGTH_LONG).show();
		      
			} else if(run < 10 || run > 30){
				Toast.makeText(getBaseContext(),"O valor de Run deve estar entre 10ml e 30ml"
						, Toast.LENGTH_LONG).show();
		      
			}else if(gelo < 20 || gelo > 20){
				Toast.makeText(getBaseContext(),"O valor de Gelo deve ser 20 ml"
						, Toast.LENGTH_LONG).show();
		      
			}else{
				Drink drink = new Drink();
				Fuzzy fuzzy = new Fuzzy();
				
				drink.setGelo(gelo);
				drink.setRefrigerante(coca);
				drink.setRun(run);
			
			float forte= fuzzy.Maximo(fuzzy.Minimo(fuzzy.uCocaForte(drink.getRefrigerante())
					, fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo())),
					fuzzy.Minimo(fuzzy.uCocaForte(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()),fuzzy.uGelo(drink.getGelo()) )
					, fuzzy.Minimo(fuzzy.uCocaSuave(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()), fuzzy.uGelo(drink.getGelo())));
		   
			float suave = fuzzy.Maximo(fuzzy.Minimo(fuzzy.uCocaForte(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uCocaSuave(drink.getRefrigerante()), fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					,fuzzy.Minimo(fuzzy.uCocaFraca(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()), fuzzy.uGelo(drink.getGelo())));
			
			float fraco= fuzzy.Maximo(fuzzy.Minimo(fuzzy.uCocaFraca(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uCocaFraca(drink.getRefrigerante()), fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uCocaSuave(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()),fuzzy.uGelo(drink.getGelo())));
			
			System.out.println("Fraco:"+fraco);
			System.out.println("Suave:"+suave);
			System.out.println("Forte:"+forte);
			 System.out.println("Resultado:"+fuzzy.Maximo(fraco, forte, suave));
			
			 int empate = 0;

				if (suave > fraco && suave > forte) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é SUAVE"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (fraco > suave && fraco > forte) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FRACA"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (forte > fraco && forte > suave) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FORTE"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (fraco == suave && empate == 0) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FRACO E SUAVE"
							, Toast.LENGTH_LONG).show();
				}

				if (suave == forte && empate == 0) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é SUAVE E FORTE"
							, Toast.LENGTH_LONG).show();
				}

			}
		}
    }
    
    public void PaladarPepsiClick(View v){
    	EditText txtPepsi=(EditText) findViewById(R.id.txtPepsi);
		EditText txtRun=(EditText) findViewById(R.id.txtRunPepsi);    
		EditText txtGelo=(EditText) findViewById(R.id.txtGeloPepsi);
		
		if(txtPepsi.getText().toString().length() <= 0){
			txtPepsi.setError("Preencha o campo Pepsi-cola.");
			txtPepsi.requestFocus();
		}else if(txtRun.getText().toString().length() <= 0){
			txtRun.setError("Preencha o campo Run.");
			txtRun.requestFocus();
		} else if(txtGelo.getText().toString().length() <= 0){
			txtGelo.setError("Preencha o campo Gelo.");
			txtGelo.requestFocus();
		}else{
		
			  float pepsi =Float.valueOf(txtPepsi.getText().toString());
			  float run =Float.valueOf(txtRun.getText().toString());
			  float gelo =Float.valueOf(txtGelo.getText().toString());
			if(pepsi < 60 || pepsi > 70){
				Toast.makeText(getBaseContext(),"O valor de Pepsi deve estar entre 60ml e 70ml"
						, Toast.LENGTH_LONG).show();
		      
			} else if(run < 10 || run > 30){
				Toast.makeText(getBaseContext(),"O valor de Run deve estar entre 10ml e 30ml"
						, Toast.LENGTH_LONG).show();
		      
			}else if(gelo < 20 || gelo > 20){
				Toast.makeText(getBaseContext(),"O valor de Gelo deve ser 20 ml"
						, Toast.LENGTH_LONG).show();
		      
			}else{
				Drink drink = new Drink();
				Fuzzy fuzzy = new Fuzzy();
				
				drink.setGelo(gelo);
				drink.setRefrigerante(pepsi);
				drink.setRun(run);
			
			float forte= fuzzy.Maximo(fuzzy.Minimo(fuzzy.uPepsiForte(drink.getRefrigerante())
					, fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo())),
					fuzzy.Minimo(fuzzy.uPepsiForte(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()),fuzzy.uGelo(drink.getGelo()) )
					, fuzzy.Minimo(fuzzy.uPepsiSuave(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()), fuzzy.uGelo(drink.getGelo())));
		   
			float suave = fuzzy.Maximo(fuzzy.Minimo(fuzzy.uPepsiForte(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uPepsiSuave(drink.getRefrigerante()), fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					,fuzzy.Minimo(fuzzy.uPepsiFraca(drink.getRefrigerante()), fuzzy.uRunForte(drink.getRun()), fuzzy.uGelo(drink.getGelo())));
			
			float fraco= fuzzy.Maximo(fuzzy.Minimo(fuzzy.uPepsiFraca(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uPepsiFraca(drink.getRefrigerante()), fuzzy.uRunSuave(drink.getRun()), fuzzy.uGelo(drink.getGelo()))
					, fuzzy.Minimo(fuzzy.uPepsiSuave(drink.getRefrigerante()), fuzzy.uRunFraco(drink.getRun()),fuzzy.uGelo(drink.getGelo())));
			
			System.out.println("Fraco:"+fraco);
			System.out.println("Suave:"+suave);
			System.out.println("Forte:"+forte);
			 System.out.println("Resultado:"+fuzzy.Maximo(fraco, forte, suave));
			
			 int empate = 0;

				if (suave > fraco && suave > forte) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é SUAVE"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (fraco > suave && fraco > forte) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FRACA"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (forte > fraco && forte > suave) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FORTE"
							, Toast.LENGTH_LONG).show();
					empate = 1;
				}

				if (fraco == suave && empate == 0) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é FRACO E SUAVE"
							, Toast.LENGTH_LONG).show();
				}

				if (suave == forte && empate == 0) {
					Toast.makeText(getBaseContext(),"Esta Cuba Livre é SUAVE E FORTE"
							, Toast.LENGTH_LONG).show();
				}

			}
		}
    }
}
