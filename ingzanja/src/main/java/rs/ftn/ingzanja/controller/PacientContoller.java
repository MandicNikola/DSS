package rs.ftn.ingzanja.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/pacients")
public class PacientContoller {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> test()
    {
        ArrayList<String> retList = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            retList.add("list " + i);
        }
        return retList;
    }
}
