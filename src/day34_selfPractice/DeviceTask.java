package day34_selfPractice;

   public abstract class DeviceTask {
    private final String brand, model;
    private double price;
    private String color;
    private final int size;


    public DeviceTask(String brand, String model, double price, String color, int size) {
        if(brand ==null){
            System.err.println("Brand can not be empty");
            System.exit(1);
        }
        this.brand = brand;
        if(model == null){
            throw new RuntimeException("Model can not be empty");
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size <= 0){
            System.err.println("Size can not be zero or negative");
            System.exit(1);
        }
        this.size = size;
    }

    public boolean hasBattery  ;
   public boolean hasPowerButton ;

   public abstract void turnOn();

    public abstract void turnOff();

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
    public void setPrice(double price) {
        if( price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }
    public void setColor(String color) {
        if(color.equals(null)){
            System.err.println("Color can not be empty");
            System.exit(1);
        }
        this.color = color;
    }
}
/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields.

			Add a constructor to set all the fields.

						Condition:
							1. brand, model color, and size can not be null (if obj == null means it's an error)
							2. brand, model color, and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price


	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()


	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed.

	4. Create an interface named downloadable:

				Abstract method:
					downloadApp();

	5. Create a child interface of Downloadable named AndroidApps:
			Variables:
				AppStoreName, OS

	6. Create a child interface of Downloadable named AppleApps

			Variables:
				AppStoreName, OS


	7. Create the following subclasses of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces


	8. Create the following subclasses of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop


	9. Create a class named DeviceShop:
			Create an object from each concrete class.

			Test all the functions of each object.

            Analyze the relationships between the classes.
 */