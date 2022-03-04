package clase;

import java.util.List;
import java.util.Scanner;

public abstract class Reader {
    public abstract List<Aplicant> readAplicanti(String file) throws Exception;
    public void readAplicant(Scanner scanner,Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nrProiecte; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiecte(nrProiecte, aplicant.denumireProiect);





    };

}
