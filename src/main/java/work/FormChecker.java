package work;

import interfaces.Identifiable;
import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public abstract class FormChecker <T extends Identifiable> {
    
    protected Map<String, RuntimeException> errors;
    protected T bean;
    protected HttpServletRequest request;

    public FormChecker(HttpServletRequest request, T bean) {
        errors = new HashMap<>();
        this.request = request;
        this.bean = bean;
    }

    public abstract T checkForm();

    public Map<String, RuntimeException> getErrors() {
        return errors;
    }
}
