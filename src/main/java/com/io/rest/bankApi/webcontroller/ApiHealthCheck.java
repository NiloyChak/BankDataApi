package com.io.rest.bankApi.webcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApiHealthCheck {

    @GetMapping("/status")
    public String getHealthCheck()
    {
        return "<html><body><h1>Bank Rest Api is Up and Running !</h1></body></html>";
    }
}
