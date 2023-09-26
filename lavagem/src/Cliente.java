/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno TDS
 */
public class Cliente{
    private String nome;
    private String sobrenome;
    private String sexo;
    private String telefone;
    private String dataDeNascimento;
    private String endereco;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
   

    /**
     *
     */
    public Cliente (String nome, String sobrenome, String sexo, String telefone, String dataDenascimento, String endereco, String marca, String modelo, String ano, String cor, String placa){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataDeNascimento = dataDenascimento;
        this.endereco = endereco;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome =  nome;
    }
    
    public String getSobrenome(){
        return sobrenome;    
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome= sobrenome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
   public String getDataNascimento(){
        return dataDeNascimento;
    }
   
    public void setDataNascimento(String dataNascimento){
        this.dataDeNascimento = dataNascimento;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getMarca(){
        return marca;    
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getModelo(){
        return modelo;    
    }
    
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    
    public String todoOsDados(){
        return "Nome e Sobrenome: "+getNome()+" "+getSobrenome()+" Sexo: "+getSexo()+"  Telefone: "+getTelefone();
    }
   
}
    
    
    
         




    
    
    
    
    
    
    
    
    
    
    

