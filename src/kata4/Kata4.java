
package kata4;

/**
 *
 * @author Guillermo
 */

import java.io.IOException;
import java.util.List;
import model.*;
import view.*;

public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String fileName = "email.txt";
        List<Object> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
