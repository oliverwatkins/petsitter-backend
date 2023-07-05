package com.petsitter;

public class PetsitterException extends Exception {


    ErrorType error;

    public static enum ErrorType {
//        COMPANY_DOES_NOT_EXIST,
//        CATEGORY_DOES_NOT_EXIST,
//        ORDER_HAS_NO_ORDER_ITEMS,
//        PROD_ID_BELONGS_TO_WRONG_COMPANY,
//        PROD_NOT_FOUND,
//        IMAGE_SAVE_ERROR,
//        IMAGE_SRC_FOLDER_NOT_FOUND,
    }

    public PetsitterException(String s, ErrorType error, Throwable cause) {
        super(s, cause);
        this.error = error;
    }

    public PetsitterException(String s, Throwable cause) {
        super(s, cause);
    }

    public PetsitterException(String s, ErrorType error) {
        super(s);
        this.error = error;
    }

    public PetsitterException(String s) {
        super(s);
    }

    public ErrorType getError() {
        return error;
    }

    public void setError(ErrorType error) {
        this.error = error;
    }
}
