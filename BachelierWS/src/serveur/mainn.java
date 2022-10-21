package serveur;

import service.BachelierService;

public class mainn {

	public static void main(String[] args) {
BachelierService b = new BachelierService();
try {
	System.out.println(b.listebachelier());
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
