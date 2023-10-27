package com.exp4.exp4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class Controller {
    private static List<Bookticket> bk = new ArrayList<Bookticket>();

    @GetMapping
    public List<Bookticket> disp1() {
        return bk;
    }

    @PostMapping
    public Bookticket add(@RequestBody Bookticket ticket) {
        bk.add(ticket);
        return ticket;
    }
}
