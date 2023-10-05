

abstract class Addition1
{
	Addition1(){
		System.out.println("base class");
	}
	abstract float Add0(float a,float b);//abstract method
	abstract float Add1(float a,float b,float c);
}

class AddFloat extends Addition1
{
	float Add0(float a,float b){
		return a+b;
	}
	float Add1(float a,float b,float c) {
		return a+b+c;
	}
}

public class Add {

	public static void main(String[] args) 
	{
		AddFloat add = new AddFloat();
		float value=add.Add0(2, 20);
		System.out.println(value);
        float value2=add.Add1(20, 30, 40);
        System.out.println(value2);
	}
}


