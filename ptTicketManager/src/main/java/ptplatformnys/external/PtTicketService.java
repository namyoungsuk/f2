
package ptplatformnys.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="ptTicket", url="http://ptTicket:8080")
public interface PtTicketService {

    @RequestMapping(method= RequestMethod.GET, path="/ptTickets")
    public void ptTicketUse(@RequestBody PtTicket ptTicket);

}