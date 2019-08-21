import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.FileOutputStream;

public class PM10Get {
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		PM10Get http = new PM10Get();
		http.sendGet();

	}

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnMesureLIst?itemCode=PM10&dataGubun=DAILY&searchCondition=MONTH&pageNo=1&numOfRows=10&ServiceKey=ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D";
		Node seoul = null;

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		// optional default is GET
		con.setRequestMethod("GET");
		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.getResponseCode();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
			response.append(inputLine);
		}
		in. close();

		// print result
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			FileOutputStream output = new FileOutputStream("./PM10");
			output.write(response.toString().getBytes());
			output.close();

			Document doc = dBuilder.parse("./PM10");
			doc.getDocumentElement().normalize();

			Element body = (Element) doc.getElementsByTagName("body").item(0);
			Element items = (Element) body.getElementsByTagName("items").item(0);
			Element item = (Element) items.getElementsByTagName("item").item(0);
			seoul = item.getElementsByTagName("seoul").item(0);
	
			System.out.println(seoul.getNodeName());
			System.out.println(seoul.getChildNodes().item(0).getNodeValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}