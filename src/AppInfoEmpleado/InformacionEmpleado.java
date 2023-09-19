package AppInfoEmpleado;

import java.util.*;

public class InformacionEmpleado {

    public static void main(String[] args) {
        AppInformacionEmpleado form=new AppInformacionEmpleado();
        form.setVisible(true);
    }

}

 /*Calculo de las operaciones sin utilizar la Clase
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("CODIGO EMPLEADO:");
        int CodeEmpl= input.nextInt();
        System.out.print("NOMBRES:");
        String Nombre= input.next();
        System.out.println("NUMERO DE HORAS TRABAJADAS MENSUALMENTE");
        int HrsTrabajadas= input.nextInt();
        System.out.println("VALOR HORA");
        int ValorHrs= input.nextInt();
        System.out.println("PORCENTAJE RETENCION EN LA FUENTE");
        float PorcentajeRet= input.nextFloat();

        int SalarioBruto=HrsTrabajadas*ValorHrs;
        double SalarioRetencion =(SalarioBruto*(PorcentajeRet/100));
        double SalarioNet=(SalarioBruto-SalarioRetencion);
        int SalarioNeto=(int)SalarioNet;

        System.out.println("CODIGO EMPLEADO:");
        System.out.println(CodeEmpl);

        System.out.print("NOMBRES:");
        System.out.println(Nombre);

        System.out.println("SALARIO BRUTO");
        System.out.println("$"+SalarioBruto);

        System.out.println("SALARIO NETO");
        System.out.println("$"+SalarioNeto);

    }*/