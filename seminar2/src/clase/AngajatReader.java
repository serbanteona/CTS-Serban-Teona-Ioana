package clase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class AngajatReader extends Reader {
    @Override
    public List<Aplicant> readAplicanti(String file) throws Exception {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            String nume = input2.next();
            String prenume = input2.next();
            int varsta = input2.nextInt();
            int punctaj = input2.nextInt();
            int nr = input2.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input2.next();
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            aplicanti.add(a);
        }
        input2.close();
        return aplicanti;
    }
}
