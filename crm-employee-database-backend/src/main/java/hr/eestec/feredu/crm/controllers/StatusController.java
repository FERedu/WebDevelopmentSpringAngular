package hr.eestec.feredu.crm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class StatusController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public Map<String, Object> getApplicationStatus() {
        return Collections.singletonMap("status", "UP");
    }

}
