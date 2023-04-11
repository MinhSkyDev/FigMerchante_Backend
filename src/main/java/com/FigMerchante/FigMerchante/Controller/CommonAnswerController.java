package com.FigMerchante.FigMerchante.Controller;

import com.FigMerchante.FigMerchante.Model.CommonAnswer;
import com.FigMerchante.FigMerchante.Repository.CommonAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommonAnswerController {

    @Autowired
    CommonAnswerRepository commonAnswerRepository;

    @PostMapping("/commonPlayer")
    @CrossOrigin
    CommonAnswer saveCommonAnswer(@RequestBody CommonAnswer answer){
        return commonAnswerRepository.save(answer);
    }

    @GetMapping("/commonPlayer")
    @CrossOrigin
    List<CommonAnswer> getAllCommonAnswer(){
        return commonAnswerRepository.findAll();
    }
}
