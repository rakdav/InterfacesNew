public class MainClass
{
    public static void main(String[] args) {
//        Account<Integer> ac1=new Account(234,56000);
//        int acId=ac1.getId();
//        System.out.println(ac1.getId());
        Account<String> ac2=new Account<String>("345",67889);
        String acId1=ac2.getId();
        System.out.println(ac2.getId());
        String[] people={"Tom","Jerry","Bob"};
        Integer[] numbers={1,2,3,4};
        Printer printer=new Printer();
        printer.<String>print(people);
        printer.<Integer>print(numbers);
        Schet<String,Double>acc4=new Schet<String,Double>("45",345.8);
        Person person=new Person("fsfd",55);
    }
}
record Person(String name,int age){
    Person {
        if (age < 1 || age > 150) age = 18;
    }
}
