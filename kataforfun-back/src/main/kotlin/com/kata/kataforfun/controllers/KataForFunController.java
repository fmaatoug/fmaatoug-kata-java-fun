package com.kata.kataforfun.controllers;

import com.kata.kataforfun.services.KataForFunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kata-for-fun")
class KataForFunController {

    @Autowired
    private KataForFunService kataForFunService;

    @GetMapping(value = "/{inputNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"})
    ResultDto convertNumber(@PathVariable(name = "inputNumber") int inputNumber) {
        return new ResultDto(kataForFunService.convertNumber(inputNumber));
    }

    public class ResultDto {
        private String result;

        public ResultDto(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}

