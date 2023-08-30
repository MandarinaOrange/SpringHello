import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.setAge(2);
        return cat;
    }

    /*@Bean(name="cat2")
    @Scope("singleton")
    public Cat getCat2() {
        Cat cat = new Cat();
        cat.setName("Gav");
        cat.setAge(3);
        return cat;
    }*/

}