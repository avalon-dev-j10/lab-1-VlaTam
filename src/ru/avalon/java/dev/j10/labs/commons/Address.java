/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    
    private String city;
    private String street;
    private int numberOfHouse;
    private int numberOfApartment;
    
    public Address(String city, String street, int numberOfHouse, int numberOfApartment){
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.numberOfApartment = numberOfApartment;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }
    
    public int getNumberOfHouse(){
        return numberOfHouse;
    }
    
    public int getNumberOfApartment(){
        return numberOfApartment;
    }
    
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public void setNumberOfHouse(int numberOfHouse){
        this.numberOfHouse = numberOfHouse;
    }
    
    public void setNumberOfApartment(int numberOfApartment){
        this.numberOfApartment = numberOfApartment;
    }
    
    @Override
    public String toString(){
        return city + ", " + street + ", house number " + numberOfHouse + ", apartment number " + numberOfApartment;
    }
}
