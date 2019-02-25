package ricevimentoxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author di_lella_andrea
 */
public class ParserRicevimento {
    
    private List<Docenti> Docenti;

    public ParserRicevimento() {
        Docenti = new ArrayList();
    }
    
    public List analizzaDocumento(String nomeFile)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(nomeFile);
        root = document.getDocumentElement();
        List<String> Docenti = new ArrayList();
        int id;
        String nome,giorno,ora,note;
        
        // generazione della lista degli elementi "docenti"
        nodelist = root.getElementsByTagName("tr")   ;
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                
                /*
                id = (element) nodelist.item(i);
                nome = (element) nodelist.item(i);
                giorno = (element) nodelist.item(i);
                ora = (element) nodelist.item(i);
                note = (element) nodelist.item(i);
                */
                
                element = (Element) nodelist.item(i);
                doc = getDocenti(element);
                this.Docenti.add(doc);

            }
        }
        return this.Docenti;
    }
   
     private String getDocenti(Element element)
    {
        List<String> Docenti = new ArrayList();
        
        
        return element.getAttribute("td");
    }

    
    
    
}
