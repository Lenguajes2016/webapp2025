package cr.ac.ucr.paraiso.lenguajes.webapp;

import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class HelloApplication extends Application {
    // Needed to enable Jakarta REST and specify path.
}
