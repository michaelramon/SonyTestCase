package framework.data;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class SonyImportCustomerData{

    public static void importCustomerData (String argv []){
    try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("CustomerData.xml"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();

            NodeList listOfCustomers = doc.getElementsByTagName("CustomerData");
            int CustomerData = listOfCustomers.getLength();
           

            for(int s=0; s<listOfCustomers.getLength() ; s++){


                Node firstElementNode = listOfCustomers.item(s);
                if(firstElementNode.getNodeType() == Node.ELEMENT_NODE){


                    Element firstElement = (Element)firstElementNode;

                    NodeList firstName = firstElement.getElementsByTagName("firstname");
                    Element firstNameElement = (Element)firstName.item(0);

                    NodeList lastName = firstElement.getElementsByTagName("lastname");
                    Element lastNameElement = (Element)lastName.item(0);

                    NodeList shipAddress = firstElement.getElementsByTagName("shipaddress");
                    Element shipAddressElement = (Element)shipAddress.item(0);
                    
                    NodeList shipCity = firstElement.getElementsByTagName("shipcity");
                    Element shipCityElement = (Element)shipCity.item(0);
                    
                    NodeList shipzipcode = firstElement.getElementsByTagName("shipzipcode");
                    Element shipzipcodeElement = (Element)shipzipcode.item(0);
                    
                    NodeList phone = firstElement.getElementsByTagName("phone");
                    Element phoneElement = (Element)phone.item(0);
                    
                    NodeList state = firstElement.getElementsByTagName("state");
                    Element stateElement = (Element)state.item(0);
                    
                    NodeList wishlist = firstElement.getElementsByTagName("wishlist");
                    Element wishlistElement = (Element)wishlist.item(0);
                }//end of if clause
            }//end of for loop with s var


        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        //System.exit (0);

   
    }
}
