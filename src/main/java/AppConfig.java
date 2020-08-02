import com.manjunath.com.manjunath.service.SpeakerService;
import com.manjunath.com.manjunath.service.SpeakerServiceImpl;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("speakerService")
    public SpeakerService getSpeakerService() {
        // constructor injection
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
        // setter injection
        // speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
