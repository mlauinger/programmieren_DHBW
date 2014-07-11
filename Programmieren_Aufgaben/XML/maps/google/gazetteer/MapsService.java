package maps.google.gazetteer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MapsService {

	public MapsService() {
		String[] targets = { "formatted_address", "long_name", "type" };
		System.out.println(getFormattedAddress(getRootElem(getDocument()),
				targets));
	}

	public static void main(String[] args) {
		new MapsService();
	}

	private Document getDocument() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser;
		try {
			parser = factory.newDocumentBuilder();
			Document doc = parser
					.parse("http://maps.googleapis.com/maps/api/geocode/xml?address=karlsruhe&sensor=false");
			return doc;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private NodeList getRootElem(Document doc) {
		return doc.getDocumentElement().getChildNodes();
	}

	private String getFormattedAddress(NodeList nl, String[] target) {
		for (int i = 0; i < nl.getLength(); i++) {
			for (int x = 0; x < target.length; x++) {
				if (nl.item(i).getNodeName().contains(target[x])) {
					String value = nl.item(i).getTextContent();
					System.out.println(target[x] + " : " + value);
				}
			}
			if (nl.item(i).hasChildNodes()) {
				getFormattedAddress(nl.item(i).getChildNodes(), target);
			}
		}
		return "not found";
	}

}
