package DesignPattens;

import java.util.Scanner;

//abstract class
abstract class Phone
{
    protected String os;
    protected String supportedNetwork;
    protected String memory;

    abstract void getSpecification();

}
//child class 1

class Iphone extends Phone
{

    @Override
    void getSpecification() {
        os="ios 15";
        supportedNetwork = "5G/4G/LTE";
        memory = "128 GB";
    }
}

//child class 2
class Samsung extends Phone
{
    @Override
    void getSpecification() {
        os="Andriod OS";
        supportedNetwork = "5G/4G/LTE";
        memory = "256 GB";
    }
}

//child class 3
class GooglePixel extends Phone
{
    @Override
    void getSpecification() {
        os="Chrome OS / Android OS";
        supportedNetwork = "5G/4G";
        memory = "128 GB/256 GB";
    }
}

class GetSpecificationFactory
{
    public Phone getspecs(String writeName)
    {
        if(writeName==null)
        {
            return null;
        }
        if(writeName.equalsIgnoreCase("IPHONE"))
        {
            return new Iphone();
        }
        if(writeName.equalsIgnoreCase("SAMSUNG"))
        {
            return new Samsung();
        }
        if(writeName.equalsIgnoreCase("GOOGLEPIXEL"))
        {
            return new GooglePixel();
        }
        return null;
    }
}
 class FactoryMethodPattern {
    public static void main(String[] args)
    {
        GetSpecificationFactory getSpecificationFactory=new GetSpecificationFactory();
        Scanner sc=new Scanner(System.in);
        String writeName = sc.next();


        Phone p=getSpecificationFactory.getspecs(writeName);
        p.getSpecification();
        System.out.println("#####################");
        System.out.println("Specifications are :  " +p.os + " " +p.memory + " " +p.supportedNetwork);
    }
}
