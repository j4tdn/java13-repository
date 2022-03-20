package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo {
	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
			org.w3c.dom.Document doc = db.parse("src/demo/employee.xml");
			org.w3c.dom.Element list = doc.getDocumentElement();
			NodeList liname = list.getElementsByTagName("name");
			NodeList liphone = list.getElementsByTagName("phone");	
			List<Employee> ds = new ArrayList<>();
			for( int i = 0; i < liname.getLength(); i++) {
				Employee s = new Employee();
				s.setName(liname.item(i).getTextContent());
				s.setPhone(liphone.item(i).getTextContent());
				ds.add(s);
			}
			System.out.println("Danh sach nhan vien tu file employee.xml : ");
			int i = 1; 
			for(Employee a : ds) {
				System.out.println(i + ". " + a);
				i++;
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
