package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String args[]){

		Veena v1 = new Veena();
		v1.play();

		Saxophone s1 = new Saxophone();
		s1.play();

		Playable v, s;
		v = new Veena();
		s = new Saxophone();
		v.play();
		s.play();

		}
}
