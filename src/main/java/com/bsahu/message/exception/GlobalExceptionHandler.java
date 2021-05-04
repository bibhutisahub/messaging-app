package com.bsahu.message.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author bsahu
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler({ MessageException.class, })
    public ResponseEntity<MessageError> handleMessageException(MessageException ex) {
    	MessageError error=new MessageError(HttpStatus.BAD_REQUEST.value(),ex.getMessage());
    	return new ResponseEntity<MessageError>(error,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({ Exception.class, })
    public ResponseEntity<MessageError> handleException(MessageException ex) {
    	MessageError error=new MessageError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
    	return new ResponseEntity<MessageError>(error,HttpStatus.BAD_REQUEST);
    }


}
