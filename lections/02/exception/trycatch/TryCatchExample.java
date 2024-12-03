package seals2.exception.trycatch;

import seals2.exception.hierarchy.MyOwnException;
import seals2.exception.hierarchy.MyOwnThrowable;


public class TryCatchExample {

    public static void main(String[] args) {
        try {
            testMyException();
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        } finally {

        }
    }

    public static void testMyException() throws MyOwnException {
        throw new MyOwnException(404, "Не правильный url");
    }
}
