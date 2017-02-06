package ru.MyApp.Server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 1 on 06.02.2017.
 */
@Controller
@RequestMapping("/events")
public class EventController {
    @RequestMapping(value = "/2",method = RequestMethod.GET)
    @ResponseBody
    public String getEvents(ModelMap modelMap) {
        return "All events";
}
}
