package classes;

public class Main {

    public static void main(String[] args) {
    	// private field will be accessed by getters and setters

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
        
        
        BankAccount bankAccount=new BankAccount();
      //  bankAccount.setAccountBalance(1000);
        System.out.println("balance = " +   bankAccount.getAccountBalance());
        bankAccount.deposit(500);
        System.out.println("Updatedbalance = " +   bankAccount.getAccountBalance());
        bankAccount.withdraw(15000);
        System.out.println("Updatedbalance after withdraw = " +   bankAccount.getAccountBalance());
    
       
        
    }
}

