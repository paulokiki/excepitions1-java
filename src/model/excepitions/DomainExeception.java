package model.excepitions;

public class DomainExeception extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainExeception(String msg) {
        super(msg);
    }
}
