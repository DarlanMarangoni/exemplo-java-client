package br.com.alura.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class ClientWebService {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		String conteudo = Request
			.Post("http://localhost:8090/gerenciador/empresas")
			.addHeader("accept", "appication/pdf")
			.execute()
			.returnContent()
			.asString();
		
		System.out.println(conteudo);
	}

}
