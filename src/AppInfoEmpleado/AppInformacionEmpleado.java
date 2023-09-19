package AppInfoEmpleado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppInformacionEmpleado extends JFrame{
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtHRSTrabajadasMes;
    private JTextField txtValorHRS;
    private JTextField txtRetFuente;
    private JButton btnSALIR;
    private JButton btnBORRAR;
    private JButton btnCALCULAR;
    private JPanel MainPanel;
    private JLabel lbNombre;
    private JLabel lbCodigo;
    private JLabel lbSalarioBruto;
    private JLabel lbSalarioNeto;

    public AppInformacionEmpleado() {
        setContentPane(MainPanel);
        setTitle("Calculo Salario Empleado");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo;
                double HRSTrabajadas=0,ValorHRS=0;
                double RetencionFuente=0;
                String Nombre;

                codigo=txtCodigo.getText();
                Nombre=txtNombre.getText();

                try {
                    HRSTrabajadas=Integer.parseInt(txtHRSTrabajadasMes.getText());
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR HORAS TRABAJADAS AL MES",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }

                try{
                    ValorHRS=Integer.parseInt((txtValorHRS.getText()));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL VALOR DE LA HORA",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }

                try{
                    RetencionFuente=Double.parseDouble(txtRetFuente.getText());
                }

                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL VALOR DE LA RETENCION EN LA FUENTE",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }
                if((HRSTrabajadas == 0) ||((ValorHRS == 0) ||(RetencionFuente == 0))){
                    txtCodigo.setText("");
                    txtNombre.setText("");
                    txtHRSTrabajadasMes.setText("");
                    txtValorHRS.setText("");
                    txtRetFuente.setText("");
                    lbNombre.setText("");
                    lbCodigo.setText("");
                    lbSalarioBruto.setText("");
                    lbSalarioNeto.setText("");
                }
                else {


                    Empleado Trabajador = new Empleado(codigo, Nombre, HRSTrabajadas, ValorHRS, RetencionFuente);

                    double SlrBrt = Trabajador.CalculoSalarioBruto();
                    double SlrNet = Trabajador.CalculoSalarioNeto();

                    int SlrBruto = (int) Math.round(SlrBrt);
                    int SlrNeto = (int) Math.round(SlrNet);

                    lbNombre.setText(Trabajador.Nombre);
                    lbCodigo.setText(Trabajador.Codigo);
                    lbSalarioBruto.setText(String.valueOf("$" + SlrBruto));
                    lbSalarioNeto.setText(String.valueOf("$" + SlrNeto));

                /*/*Calculo de las operaciones sin utilizar la Clase
                int SalarioBruto=HRSTrabajadas*ValorHRS;
                double SalarioRetencion =(SalarioBruto*(RetencionFuente/100));
                double SalarioNet=(SalarioBruto-SalarioRetencion);
                int SalarioNeto=(int)SalarioNet;*/

                }

            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtHRSTrabajadasMes.setText("");
                txtValorHRS.setText("");
                txtRetFuente.setText("");
                lbNombre.setText("");
                lbCodigo.setText("");
                lbSalarioBruto.setText("");
                lbSalarioNeto.setText("");
            }
        });
        btnSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}