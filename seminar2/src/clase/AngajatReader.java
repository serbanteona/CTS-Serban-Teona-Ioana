package clase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class AngajatReader extends Reader {
    @Override
    public List<Aplicant> readAplicanti(String file) throws Exception {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            String nume = scanner.next();
            String prenume = scanner.next();
            int varsta = scanner.nextInt();
            int punctaj = scanner.nextInt();
            int nr = scanner.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = scanner.next();
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            aplicanti.add(a);
        }
        scanner.close();
        return aplicanti;
    }
}
