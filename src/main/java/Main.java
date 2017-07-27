import first_draft.Args;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println("logging: " + logging);
            System.out.println("port: " + port);
            System.out.println("directory: " + directory);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
