package com.FigMerchante.FigMerchante.Controller;

import com.FigMerchante.FigMerchante.Model.Answer;
import com.FigMerchante.FigMerchante.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    AnswerRepository answerRepository;

    @PostMapping("/playerAnswer")
    @CrossOrigin
    Answer playerAnswer(@RequestBody Answer answer){
        return answerRepository.save(answer);
    }

    @GetMapping("/playerAnswer")
    @CrossOrigin
    List<Answer> findAllAnswer(){
        return answerRepository.findAll();
    }

}
