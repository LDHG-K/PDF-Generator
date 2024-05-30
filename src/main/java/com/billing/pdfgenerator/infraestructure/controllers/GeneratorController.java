package com.billing.pdfgenerator.infraestructure.controllers;

import com.billing.pdfgenerator.domain.dto.Request;
import com.billing.pdfgenerator.domain.dto.Response;
import com.billing.pdfgenerator.domain.services.PDFBillingGenerator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO ADD A PATH TO THE CONTROLLER
// TODO ADD A POST METHOD TO CREATE A PDF AND RETURN IT INSIDE A DTO
// TODO INJECT A SERVICE THAT ALLOW TO CREATE A PDF

@RestController
@RequestMapping("generator")
@AllArgsConstructor
public class GeneratorController {

    // Example of a dependency injection
    // private static final (Interface name) (any name);

    private final PDFBillingGenerator pdfBillingGenerator;

    @PostMapping()
    public Response generatePDF(@RequestBody Request request){

        return pdfBillingGenerator.generatePDF(request);

    }



}
// BUSCAR LAS 3 FORMAS DE INYECCION
//INYECCION POR CONSTRUCTOR
//INYECTOR POR METODO DE ACCESBILIDAD
//INYECTOR POR INSTANCIA