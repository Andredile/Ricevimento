package ricevimentoxml;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author di_lella_andrea
 */
public class RicevimentoXml {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List lista = null;
        ParserRicevimento dom = new ParserRicevimento();
        try {
            lista = dom.analizzaDocumento("Circolari_2755A_2018-2019_ricevimento docenti-pdftables.xml");
            for(int i = 0; i < lista.size(); i++)
            {
                System.out.println(lista.get(i).toString());
            }
           
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }

    }
    
}
