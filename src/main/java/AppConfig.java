import com.manjunath.com.manjunath.service.SpeakerService;
import com.manjunath.com.manjunath.service.SpeakerServiceImpl;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean("speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        // constructor injection
        // SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
        // setter injection
        // speakerService.setSpeakerRepository(getSpeakerRepository());

        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        return speakerService;
    }

    @Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

    /**
     * Other scopes available in web aware are
     * 1. Request:- only available in scope of per request of user
     * 2. Session:- will be available in the scope of entire browser user session of user
     * 3. Global:- will be there for entire life of application until redeployed or rebooted
     */
}
