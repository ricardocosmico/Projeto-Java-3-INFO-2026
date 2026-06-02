/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author ricardo
 */
public class Funcionario {
    
    private String cargo;
    private String nome;
    private String cpf;
    private String numero;
    private String endereco;
    private String salario;
    private String dataadmissao;
    private String ferias;
    private String faltas;
    private String turno;
    
public Funcionario(String cargo, String nome, String cpf, String numero, String endereco, String salario, String dataadmissao, String ferias, String faltas, String turno)
{  
    this.cargo = cargo;
    this.nome = nome;
    this.cpf = cpf;
    this.numero = numero;
    this.endereco = endereco;
    this.salario = salario;
    this.dataadmissao = dataadmissao;
    this.ferias = ferias;
    this.faltas = faltas;
    this.turno = turno;
}
}
