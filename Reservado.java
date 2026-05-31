/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Israel 
 */
public class Reservado {

    private String idCodReserva;
    private String quarto;
    private String dataSaida;
    private String dataEntrada;
    private int nrHospedes;
    private double valorReserva;

    public Reservado(String idCodReserva, String quarto, String dataSaida, String dataEntrada, int nrHospedes, double valorReserva) {
        this.idCodReserva = idCodReserva;
        this.quarto = quarto;
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nrHospedes = nrHospedes;
        this.valorReserva = valorReserva;
    }
}
