package entities;

public class Product {
    public String name;
    public double price;
    public int qtd;

    public double totalValueInStock(){
        return price * qtd;
    }
    public void addProducts(int qtd){
        this.qtd += qtd;   //this acessa o atributo da classe e não da função
    }
    public void removeProducts(int qtd){
        this.qtd -= qtd;
    }

}