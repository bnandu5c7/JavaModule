package com.kpit.demo5.Layer2;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="pizza1")
public class Pizza {
    @Id
    @column(name ="pizzaid")
    private int pizzaNumber;

    @column(name="pizzatype")
    private String typeOfPizza;

    @column(name="pizzacost")
    private double pizzaPrice;
    public Pizza() {
    }
    public int getPizzaNumber() {
        return pizzaNumber;
    }
    public String gettypeOfPizza() {
        return typeOfPizza;
    }
    public double getPizzaPrice() {
        return pizzaPrice;
    }
    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }
    public void settypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }   
}
