package org.exception;

public class ExceptionMain  {
    public static void main(String[]args) throws UserException {
        throw new UserException("This is exception");
    }

}
