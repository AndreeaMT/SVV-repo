package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class HttpStringProvider {
	public String getStringForAddress(String urlAddress) {
		String result = "";
		try {
			URL url = new URL(urlAddress);
			//URLConnection urlConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("10.40.10.40", 3128)));
			URLConnection urlConnection = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null)
				result += inputLine;

			in.close();			
		} catch (IOException e) {
			result = "<html></html>";
		}
		return result;
	}

}
