package clase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws Exception {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev=new Elev();
       readAplicant(scanner,elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);

            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
