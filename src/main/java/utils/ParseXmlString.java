package utils;

import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;

public class ParseXmlString {




  
  public void parse_print(String xml_string, String element_name) {

    

    try {
        DocumentBuilderFactory dbf =
            DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xml_string));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName(element_name);

        // iterate the employees
        for (int i = 0; i < nodes.getLength(); i++) {
           Element element = (Element) nodes.item(i);

           NodeList name = element.getElementsByTagName("name2");
           Element line = (Element) name.item(0);
           System.out.println("Name2: " + getCharacterDataFromElement(line));

           NodeList title = element.getElementsByTagName("title");
           line = (Element) title.item(0);
           System.out.println("Title: " + getCharacterDataFromElement(line));
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    /*
    output :
        Name: John
        Title: Manager
        Name: Sara
        Title: Clerk
    */

  }


  public String parse(String xml_string,String root_element, String element_name) {

      String ret="";
    try {
        DocumentBuilderFactory dbf =
            DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xml_string));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName(root_element);

        // iterate the employees
        //for (int i = 0; i < nodes.getLength(); i++) {
        Element element = (Element) nodes.item(0);

        NodeList name = element.getElementsByTagName(element_name);
        Element line = (Element) name.item(0);
        System.out.println(element_name+" : " + getCharacterDataFromElement(line));
        ret=getCharacterDataFromElement(line);
       // NodeList title = element.getElementsByTagName("title");
     //   line = (Element) title.item(0);
       // System.out.println("Title: " + getCharacterDataFromElement(line));
     //   }
    }
    catch (Exception e) {
        e.printStackTrace();
    }


      return ret;
  }

  public static String getCharacterDataFromElement(Element e) {
    Node child = e.getFirstChild();
    if (child instanceof CharacterData) {
       CharacterData cd = (CharacterData) child;
       return cd.getData();
    }
    return "?";
  }
}
