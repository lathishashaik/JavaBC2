
public class HRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HFriend frnd1=new HFriend("Bro");
		HFriend frnd2=new HFriend("Cami");
		HFriend frnd3=new HFriend("Rosy");
		HFriend.displayNumberOfFriends();
		//As display is static method instead of below can call method using clsname
		//frnd1.displayNumberOfFriends();
		//frnd2.displayNumberOfFriends();
		//frnd3.displayNumberOfFriends();
		
		//if not static all 3 objects have only 1 frnd
		//as numofFrnds is static variable,a single copy 
		//of this var is created and shared

	}

}
