import com.marklogic.gds.GeoQueryRequest;
import org.hamcrest.core.IsNull;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.Matchers.is;

public class GeoserverHelloWorldTest extends AbstractGeoserverServiceTest {

    @Test
    public void helloWorld() {
        postGeoserverRequest(
            new GeoserverRequest()
                .withParam("rs:geoserverAuthType", "DIGEST")
                .withParam("rs:geoserverUser", "admin")
                .withParam("rs:geoserverPassword", "admin")
                .withParam("rs:geoserverUrl", "/feature-services/test/GDeltSearch.json")
                .withParam("rs:serviceDescriptorUri", "/feature-services/test/GDeltSearch.json")
                .withParam("rs:geoserverWorkspace", "XXX")
                .withParam("rs:geoserverDatastore", "YYY")
        )
            .log().everything();
    }
}
