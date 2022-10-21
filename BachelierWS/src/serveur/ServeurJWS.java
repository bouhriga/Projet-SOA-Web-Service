package serveur;

import javax.xml.ws.Endpoint;

import service.BachelierService;

public class ServeurJWS {

	public static void main(String[] args) {
          String url="http://localhost:8553/";
          Endpoint.publish(url, new BachelierService());
          System.out.print(url);
	}

}
