import java.math.BigDecimal;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    //Task1
    public void main(String[] args){
        float weightRasuljonovEarth=60.0f;
        float marsGravity=0.38f;
        float weightRasuljonovMars;
        double weightRasuljonovMarsDouble;
        int weightRasuljonovMarsInt;
        char weightRasuljonovMarsChar;
        int charwithOperation;

        //getting weight on Mars
        weightRasuljonovMars=weightRasuljonovEarth*marsGravity;
        System.out.println("Weight On Mars: "+weightRasuljonovMars);

        //converting float weight to double
        weightRasuljonovMarsDouble=weightRasuljonovMars;
        System.out.printf("Weight on Mars with 4 decimal %.4f\n",weightRasuljonovMarsDouble);

        //converting double weight to int
        weightRasuljonovMarsInt= (int)weightRasuljonovMarsDouble;
        System.out.println("Mars Weight in Int: "+weightRasuljonovMarsInt);

        //convert int to char
        weightRasuljonovMarsChar=(char) weightRasuljonovMarsInt;
        System.out.println("Mars weight in char: "+weightRasuljonovMarsChar);


        //operation with char
        charwithOperation=weightRasuljonovMarsChar+5;
        System.out.println("Operation with char: "+charwithOperation);
    }
    *
    /*
    //Task 2
    public void main(String[] args){
        //get subclass from Random class
        Random random=new  Random();
        //get random number
        int randomNum=random.nextInt(100);
        if (randomNum%2==0){
            System.out.println("Even: "+randomNum);
        }else {
            System.out.println("Odd:  "+randomNum);
        }

    }*/
/*
Task3

    public void main(String[] args){
        Random random=new Random();

        int randomNumber=(int) (Math.random()*51)+50;
        int randomOddnumber=1;
        int randomIndex=random.nextInt(3);
        int[] evennumbers={6,8,10};
        int randomEvenNumber=evennumbers[randomIndex];



        if (randomNumber%2!=0){
            randomOddnumber=randomNumber;
        }
        int fullcontainers=randomOddnumber/randomEvenNumber;
        int totalContainers;
        if(randomOddnumber%randomEvenNumber==0){
            totalContainers=fullcontainers;
        }
        else {
            totalContainers=fullcontainers+1;
        }
        System.out.println("Random ODD number: " +randomOddnumber);
        System.out.println("Random Even Number: "+randomEvenNumber);
        System.out.println("Full Container: "+fullcontainers);
        System.out.println("Total Containers: "+totalContainers);

    }
    */
    public void main(String[] args){
//        double netPrice=9.99;
//        double vat=23;
//        double grossPrice=netPrice+(netPrice/100*vat);
//        double totalGrossValueSold=grossPrice*10000;
//        double totalNetValueSold=netPrice*10000;

        BigDecimal netPrice=new BigDecimal("9.99");
        BigDecimal vat=new BigDecimal("0.23");
        BigDecimal grossPrice=netPrice.multiply(BigDecimal.ONE.add(vat));
        BigDecimal totalGrossValueSold=grossPrice.multiply(BigDecimal.valueOf(10000));
        BigDecimal totalNetValueSold=totalGrossValueSold.divide(BigDecimal.ONE.add(vat));


        System.out.println("Gross Price: "+grossPrice);
        System.out.println("Total Value of Sold with gross Price: "+totalGrossValueSold);
        System.out.println("Total Value of Sold with net Price: "+totalNetValueSold);


    }



}
