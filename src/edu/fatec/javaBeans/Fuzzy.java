package edu.fatec.javaBeans;

import java.util.Arrays;

public class Fuzzy {

	public float uCocaForte(float coca) {

		if (coca < 50 || coca > 54)
			return 0;

		if (50 <= coca && coca < 52)
			return 1;

		if (52 <= coca && coca <= 54)
			return (54 - coca) / (54 - 52);

		else
			return 0;

	}

	public float uCocaSuave(float coca) {

		if (coca < 52 || coca > 58)
			return 0;

		if (52 <= coca && coca <= 54)
			return (coca - 52) / (54 - 52);

		if (54 < coca && coca < 56)
			return 1;

		if (56 <= coca && coca <= 58)
			return (58 - coca) / (58 - 56);

		else
			return 0;

	}

	public float uCocaFraca(float coca) {

		if (coca < 56 || coca > 60)
			return 0;

		if (56 <= coca && coca <= 58)
			return (coca - 56) / (58 - 56);

		if (58 < coca && coca <= 60)
			return 1;

		else
			return 0;
	}

	public float uPepsiForte(float pepsi) {

		if (pepsi < 60 || pepsi > 70)
			return 0;

		if (60 <= pepsi && pepsi < 62)
			return 1;

		if (62 <= pepsi && pepsi <= 64)
			return (64 - pepsi) / (64 - 62);

		else
			return 0;
	}

	public float uPepsiSuave(float pepsi) {

		if (pepsi < 62 || pepsi > 68)
			return 0;

		if (62 <= pepsi && pepsi <= 64)
			return (pepsi - 62) / (64 - 62);

		if (64 < pepsi && pepsi < 66)
			return 1;

		if (66 <= pepsi && pepsi <= 68)
			return (68 - pepsi) / (68 - 66);

		else
			return 0;
	}

	public float uPepsiFraca(float pepsi) {
		if (pepsi < 66 || pepsi > 70)
			return 0;

		if (66 <= pepsi && pepsi <= 68)
			return (pepsi - 66) / (68 - 66);

		if (68 < pepsi && pepsi <= 70)
			return 1;

		else
			return 0;
	}

	public float uRunForte(float run) {

		if (run < 23 || run > 30)
			return 0;

		if (23 <= run && run <= 28)
			return (run - 23) / (28 - 23);

		if (28 < run && run <= 30)
			return 1;

		else
			return 0;
	}

	public float uRunSuave(float run) {

		if (run < 15 || run > 27)
			return 0;

		if (15 <= run && run <= 20)
			return (run - 15) / (20 - 15);

		if (20 < run && run < 25)
			return 1;

		if (25 <= run && run <= 27)
			return (27 - run) / (27 - 25);

		else
			return 0;
	}

	public float uRunFraco(float run) {

		if (run < 10 || run > 20)
			return 0;

		if (10 <= run && run < 15)
			return 1;

		if (15 <= run && run <= 20)
			return (20 - run) / (20 - 15);

		else
			return 0;
	}

	public float uGelo(float gelo) {
		if (gelo == 20)
			return 1;
		else
			return 0;
	}

	public float Minimo(float a, float b, float c) {
		float[] menor = new float[3];
		menor[0] = a;
		menor[1] = b;
		menor[2] = c;

		Arrays.sort(menor);

		return menor[0];

	}

	public float Maximo(float a, float b, float c) {
		float[] maior = new float[3];
		maior[0] = a;
		maior[1] = b;
		maior[2] = c;

		Arrays.sort(maior);

		return maior[2];

	}

}
