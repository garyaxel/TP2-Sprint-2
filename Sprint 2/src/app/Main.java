package app;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EpassStudent student= new EpassStudent(7,"ffdd") {
            @Override
            protected void clone(EpassStandard pass) {

            }
        };



        student.setSaldo(500);
        student.checkValidade();


        Titular titul= new Titular("23f",TipoDocumento.BI,"ddd", LocalDate.now(),"email");
        titul.toString();

        EpassTurista turista= new EpassTurista(Duracao.Tres);
        turista.creditar(1);









    }
}
