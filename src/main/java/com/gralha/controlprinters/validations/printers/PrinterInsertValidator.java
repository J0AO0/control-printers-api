//package com.gralha.controlprinters.validations.printers;
//
//import com.gralha.controlprinters.dtos.printer.PrinterNewDTO;
//import com.gralha.controlprinters.repositories.PrintersRepository;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//
//public class PrinterInsertValidator  implements ConstraintValidator<PrinterInsert, PrinterNewDTO> {
//    @Autowired
//    private PrintersRepository repo;
//    @Override
//    public void initialize(PrinterInsert ann) {	}
//    @Override
//    public boolean isValid(PrinterNewDTO objDto, ConstraintValidatorContext context) {
//        List<FieldMessage> list = new ArrayList<>();
//
//        Convenio aux1 = repo.findByDescricao(objDto.getDescricao());
//        if(aux1 !=null) {
//            list.add(new FieldMessage("descricao"," Descrição já existente"));
//        }
//
//        for (FieldMessage e : list) {
//            context.disableDefaultConstraintViolation();
//            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
//                    .addConstraintViolation();
//        }
//        return list.isEmpty();
//
//    }
//}
