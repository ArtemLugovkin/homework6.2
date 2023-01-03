import java.sql.SQLOutput;

public class People {
    String name;
    int age;
    String city;
    String post;





    People maksim = new People();
    maksim.name = "Максим";
    maksim.age = 35;
    maksim.city = "Минск";
    maksim.post = "бренд-менеджер";


    People any = new People();
    any.name = "Аня";
    any.age = 29;
    any.city = "Москва";
    any.post = "методист образовательных программ";

    People kate = new People();
    kate.name = "Катя";
    kate.age = 28;
    kate.city = "Калиниград";
    kate.post = "продакт-менеджер";

    People artem = new People();
    artem.name = "Артём";
    artem.age = 27;
    artem.city = "Москва";
    artem.post = "директор по развитию бизнеса";

    void say() {
        System.out.println("Привет! Меня зовут" + name + " Я из города " + city + "Мне " + age + " лет. Я работаю на должности" + post + " Будем знакомы!");
    }
}
