package AppInfoEmpleado;

public class Empleado {

    String Codigo;
    String Nombre;
    double HRSTrabajadas;
    double ValorHRS;
    double RetencionFuente;


    public Empleado(String Codigo, String Nombre, double HRSTrabajadas, double ValorHRS, double RetencionFuente) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.HRSTrabajadas = HRSTrabajadas;
        this.ValorHRS = ValorHRS;
        this.RetencionFuente = RetencionFuente;

    }

    double CalculoSalarioBruto(){
        return (HRSTrabajadas*ValorHRS);

    }
    double CalculoSalarioRetencion(){
        double SalarioBrt=(HRSTrabajadas*ValorHRS);
        return (SalarioBrt*(RetencionFuente/100));

    }
    double CalculoSalarioNeto(){
        double SalarioBrt=(HRSTrabajadas*ValorHRS);
        double SalarioRet=(SalarioBrt*(RetencionFuente/100));
        return (SalarioBrt-SalarioRet);

    }

}
