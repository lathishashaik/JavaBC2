
public class KHero extends KPerson {
	String power;
	public KHero(String name,int age,String power){
		super(name,age);
		this.power=power;
	}
	public String toString() {
		return this.name+"\n"+this.age+"\n"+this.power;
	}

}
