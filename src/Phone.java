public class Phone {private int number; private String model; private int weight; private String name;

    public String getName() {
        return name;
    }
      public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone() {
    }
    public void receiveCall(String name){
        this.name = name;
        System.out.println("Звонит " +getName());
    }
    public void receiveCall(String name, int number){
        this.name = name;
        this.number=number;
        System.out.println("Звонит " +getName()+" +375 "+getNumber());
    }
    public static void sendMessage(int...number){
        for (int j : number) System.out.println("+375 " + j + " Здесь могло быть Ваше сообщение");
    }
}
