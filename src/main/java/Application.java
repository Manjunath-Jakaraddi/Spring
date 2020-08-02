import com.manjunath.com.manjunath.service.SpeakerService;
import com.manjunath.com.manjunath.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService speakerService = new SpeakerServiceImpl();

        // using the beans with setter and constructor injection
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);
        System.out.println(speakerService.findAll().get(0).getFirstName());

        SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService2);
    }
}
