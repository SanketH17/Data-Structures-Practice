public class OOPS {

    public static class phone {
        String brand; // current class instance variables
        String model;// current class instance variables
        int Ram;// current class instance variables

        public void display() {
            String str = "Brand : " + brand + "\n" + "model : " + model + "\n" + "Ram: " + Ram;
            System.out.println(str);
        }
    

    public phone(String brand, String model, int Ram){
        this.brand = brand;
        this.model = model;
        this.Ram = Ram;
    }

}

    public static void main(String[] args) {
        phone p1 = new phone("Samsung", "galaxy", 12);
        phone p2 = new phone("Samsung", "galaxy", 24);
        p1.display();
        p2.display();
    }

}
