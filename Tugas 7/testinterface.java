class Nama_Kelas impements Nama_Interface {
// isi kelas
}

interface singable{
	public void bernyanyi ();
}

public class manusia implements singable {
	@Override
	public void bernyanyi () {
		System.out.println ("lalala ... lalala...")
	}
}

public class sapi implements singable{
	@Override
	public void bernyanyi () {
		System.out,println ("Moooooooooooo...");
	}
}

Public class testinterface {
	public static void main (string args [] ){
		sapi objectsapi = new sapi () ;
		manusia objectmanusia = new manusia () ;
		objectsapi.bernyanyi () ;
		objectmanusia.bernyanyi () ;
	}
}