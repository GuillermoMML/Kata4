package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import model.Mail;

public class MailListReader {
    
    private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    
    public static List<Object> read(String fileName) throws FileNotFoundException, IOException{
        List<Object> mailList = new ArrayList<>();
        File archivo = new File(fileName);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while((linea = br.readLine()) != null){
            if(pattern.matcher(linea).matches()){
                mailList.add(new Mail(linea));
                
            }
        }
        return mailList;
    }
}
