public class Main {
       public static void main(String[] args) {
        Phone phone1=new Phone(291112233,"Nokia",120);
        Phone phone2=new Phone(292223344,"Xiaomi",110);
        Phone phone3=new Phone(293334455,"Huawei", 130);
        System.out.println();

        System.out.println("Номер: +375 "+phone1.getNumber()+"; Модель: "+phone1.getModel()+"; Вес:"+phone1.getWeight());
        System.out.println("Номер: +375 "+phone2.getNumber()+"; Модель: "+phone2.getModel()+"; Вес:"+phone2.getWeight());
        System.out.println("Номер: +375 "+phone3.getNumber()+"; Модель: "+phone3.getModel()+"; Вес:"+phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Alex");
        phone2.receiveCall("Marti");
        phone3.receiveCall("Gloria");
        System.out.println();

        Phone phone4=new Phone();
        phone4.setNumber(299998877);
        phone4.setModel("HTC");
        phone4.setWeight(99);
        phone4.receiveCall("Melman",335558866);
        System.out.println();

        Phone.sendMessage(291111111,332222222,443333333,254444444);
    }
}
