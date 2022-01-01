import org.springframework.stereotype.Component;
import service.ConfigurationService;

@Component
public class Configurations {
    private static final String key_ussd_session_timeout_seconds = "ussd.session.timeout.seconds";
    private static final String key_ussd_number_max_segments = "ussd.number.max-segments";
    private static final String spring_application_name = "spring.application.name";
    private static final String m3ua_client_address = "m3ua.client.address";
    private static final String ss7_node_name = "ss7.node.name";
    private static final String ussd_menu_maker_url = "ussd.menu-maker.url";
    private static final String ussd_ati_service_url = "ussd.ati.service.url";
    private final ConfigurationService configurationService;

    public Configurations(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    public int getUssdSessionTimeout() {
        return Integer.parseInt(this.configurationService.get("ussd.session.timeout.seconds", "60"));
    }

    public int getUssdNumberMaxSegments() {
        return Integer.parseInt(this.configurationService.get("ussd.number.max-segments", "3"));
    }

    public String getNodeName() {
        return this.configurationService.get("ss7.node.name", "Elma");
    }

    public String getAppName() {
        return this.configurationService.get("spring.application.name", "GREENGATE-USSDC");
    }

    public String[] getNodeAddresses() {
        return this.configurationService.get("m3ua.client.address", "127.0.0.1").split(",");
    }

    public String getMenuMakerURL() {
        return this.configurationService.get("ussd.menu-maker.url", (String)null);
    }

    public String getAtiServiceURL() {
        return this.configurationService.get("ussd.ati.service.url", "");
    }
}
