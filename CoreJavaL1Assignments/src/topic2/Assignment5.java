package topic2;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument inst[] = new Instrument[10];
		inst[0] = new Piano();
		inst[1] = new Guitar();
		inst[2] = new Piano();
		inst[3] = new Flute();
		inst[4] = new Guitar();
		inst[5] = new Piano();
		inst[6] = new Flute();
		inst[7]= new Piano();
		inst[8] = new Flute();
		inst[9] = new Guitar();

		for (int i= 0; i<inst.length; i++)
		{
		if(inst[i] instanceof Piano)
		{
		inst[i].Play();
		}
		if(inst[i] instanceof Guitar)
		{
		inst[i].Play();
		}
		if(inst[i] instanceof Flute)
		{
		inst[i].Play();
		}

		}

	}

}
